import React, {useEffect, useState} from 'react';
import { useTheme } from '@material-ui/core/styles';
import api from '../../services/api';
import { LineChart, Line, XAxis, YAxis, Label, ResponsiveContainer, BarChart,
         Bar, Legend, Tooltip, CartesianGrid, Text } from 'recharts';

function Grafico() {

    const [ servidoresQtd, setServidoresQtd ] = useState(); 
    const [ contratosQtd, setContratosQtd ] = useState(); 
    const [ fornecedoresQtd, setFornecedoresQtd ] = useState(); 
    const [ licitacoesQtd, setLicitacoesQtd ] = useState(); 
    
    async function contador(){
      try{
          await api.get('/servidores').then(response => {                                          
              setServidoresQtd(response.data.length);
          });
          await api.get('/contratos').then(response => {                                        
            setContratosQtd(response.data.length);
          });
          await api.get('/fornecedores').then(response => {                                        
            setFornecedoresQtd(response.data.length);
          });
          await api.get('/licitacoes').then(response => {                                        
            setLicitacoesQtd(response.data.length);
          });
      }catch (e) {
          console.log(e);
      }
    }
  
    useEffect(() => {
      contador();        
    }, []);

    const data = [
    	{
    		name: 'Servidores', Quantidade: servidoresQtd,
    	},
    	{
    		name: 'Contratos', Quantidade: contratosQtd,
    	},
    	{
    		name: 'Fornecedores', Quantidade: fornecedoresQtd,
    	},
    	{
    		name: 'Licitações', Quantidade: licitacoesQtd,
    	}
    ];

    const theme = useTheme();

    return (
        <>
        <React.Fragment>
          <h6 style={{display: "flex", justifyContent:"center"}}>Quantidade por listagem</h6>
          <ResponsiveContainer>
            <BarChart            
  		        width={500}
  		        height={300}
  		        data={data}
  		        margin={{
  		  	      top: 5, right: 30, left: 20, bottom: 5,
  		        }}
  	        >             
              <CartesianGrid strokeDasharray="3 3"/>
  		        <XAxis dataKey="name" />
  		        <YAxis />
  		        <Tooltip />  		        
  		        <Bar dataKey="Quantidade" fill="#8884d8" />
            </BarChart>
          </ResponsiveContainer>
        </React.Fragment>
        </>
    );
}

export default Grafico;