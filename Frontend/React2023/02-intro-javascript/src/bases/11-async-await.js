// Async

// const getImage = async() => {
//    return 'https://abc.com';
// };
// getImage()
// .then(console.log)

// Fetch API easier by using: Async and Await

console.log('Fetch API easier by using: Async and Await:');

const getImage = async() => {

   try {
      const endpoint = 'http://api.giphy.com/v1/gifs/random';
      const apiKey = 'zl78jXcz477X0zCF3hPYiaa0YtedWCcT';
      const resp = await fetch(`${endpoint}?api_key=${apiKey}`);
      const json = await resp.json();
      const data = await json.data;
      const {url} = data.images.original;
      const img = document.createElement('img');
      img.src = url;
      document.body.append(img);
   } catch (error) {
      console.warn(error);
   }
 
};
getImage()