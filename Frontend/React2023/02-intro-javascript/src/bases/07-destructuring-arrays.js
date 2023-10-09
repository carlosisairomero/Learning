// Destructuring arrays

console.log('Destructuring arrays:');

const characters = ['Goku', 'Vegeta', 'Trunks'];
const [,,ch3] = characters;
console.log('[2]: ', ch3);


const retrieveFruitsArray = () => {
   return ['Apple', 'Pear', 'Cherry'];
};
const [f1, f2, f3] = retrieveFruitsArray();
console.log(f1, f2, f3);

