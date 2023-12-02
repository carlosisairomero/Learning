import axios from "axios";

export default axios.create({
   baseURL: 'https://api.rawg.io/api',
   params: {
      key: 'ddaacd5491564bfa981109f959da7686'
   }
})