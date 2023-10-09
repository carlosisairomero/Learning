// Variables and Constants

const name = 'Carlos';
const lastName = 'Romero';
let age = 35;

console.log(name, lastName, age);

// Variable scope

if (true) {
   const name = 'Nathalia';
   const lastName = 'Flores';
   let age = 34;
   console.log(name, lastName, age);
}