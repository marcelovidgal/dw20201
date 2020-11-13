import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8081/api'
});


// Permite a comunicação com a aplicação backend cuja porta é 3333

export default api;


//const API_URL = 'http://localhost:8080'
//
//
//class CourseDataService {
//
//    retrieveAllCourses(name) {
//        return axios.get(`${API_URL}/entes`);
//    }
//}
//
//export default new CourseDataService()