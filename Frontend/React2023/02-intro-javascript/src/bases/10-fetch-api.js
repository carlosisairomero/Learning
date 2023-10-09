// Fetch APIS

const endpoint = 'http://api.giphy.com/v1/gifs/random';
const apiKey = 'zl78jXcz477X0zCF3hPYiaa0YtedWCcT';
const httpRequest = fetch(`${endpoint}?api_key=${apiKey}`);
httpRequest
.then(resp => resp.json())
.then(({data}) => {
   const {url} = data.images.original;
   const img = document.createElement('img');
   img.src = url;
   document.body.append(img);
})
.catch(console.warn);