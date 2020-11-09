import React from 'react';
import { Carousel } from 'react-bootstrap';

import ImgBandeiraMA from '../../assets/images/BandeiraMAEsticada2.jpg';
import ImgSaoLuis from '../../assets/images/SaoLuisMA.jpg';
import ImgTce from '../../assets/images/tce.jpg';

import './styles.css'

function Carrossel () {

    return (     
        <div className='container-fluid' >  
        <Carousel interval={4000} id="carrossel">  
            <Carousel.Item className="carroselItem">  
                <img 
                
                    className="d-block w-100"  
                    src={ImgBandeiraMA}
                    alt="Maranhão"
                />  
                <Carousel.Caption className="carroselTitulo">                    
                    <h3>Municípios maranhenses</h3>                    
                </Carousel.Caption>  
            </Carousel.Item  >

            <Carousel.Item className="carroselItem">  
                <img
                 
                    className="d-block w-100"  
                    src={ImgSaoLuis}
                    alt="São Luís"
                />  
                <Carousel.Caption className="carroselTitulo">  
                   <h3 className="tituloOutraCor">Fácil manipulação dos dados</h3>  
                </Carousel.Caption>  
            </Carousel.Item>

            <Carousel.Item className="carroselItem">  
                <img
             
                    className="d-block w-100"  
                    src={ImgTce}
                    alt="tce"
                />  
                <Carousel.Caption className="carroselTitulo">  
                    <h3>Utilizamos a API pública do TCE</h3>  
                </Carousel.Caption>  
            </Carousel.Item>  
        </Carousel>  
    </div>
    )
}

export default Carrossel