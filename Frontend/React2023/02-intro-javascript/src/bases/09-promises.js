// Promises

import { getHeroeById } from "./08-imports-exports";

// ******************************
// A promise without parameters
// ******************************

// const promise = new Promise((resolve, reject) => {
//    setTimeout(() => {
//       const heroe = getHeroeById(2);
//       resolve(heroe);
//       // reject('heroe not found');
//    }, 5000);
// });

// promise.then((heroe) => {
//    console.log('5 seconds after ...');
//    console.log(heroe);
// })
// .catch(err => {
//    console.warn(err);
// });

// ******************************
// A promise with a parameter
// ******************************

const getHeroeByIdAsync = (id) => {
   return new Promise((resolve, reject) => {
      setTimeout(() => {
         const heroe = getHeroeById(id);
         if (heroe !== undefined) {
            resolve(heroe);
         } else {
            reject('heroe not found');
         }
      }, 5000);
   });
};

getHeroeByIdAsync(2)
   .then(console.log)
   .catch(console.warn);


