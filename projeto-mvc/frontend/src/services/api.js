import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8081/api',
    headers: {"Authorization": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJicnVubyIsImV4cCI6MTYwNjM5Njc2OH0.Jull9-r6RlneV-GThmyEALlxnf4CIxx80mBkBd4W8vUb7uiP2lrHii2jAxkQQuqjIt-vgK2wcYWPHU5yBG0sCQ"}
});


// Permite a comunicação com a aplicação backend cuja porta é 3333

export default api;