// Literal Objects

const person = {
   firstName: 'Tony',
   lastName: 'Stark',
   age: 45,
   address: {
      city: 'New York',
      zip: 5532,
      lat: 14.35,
      lng: 34.52,
   }
};

// cloning by reference (will fail)

// const person2 = person;
// person2.firstName = 'Peter';

// console.log({person});
// console.table(person);
// console.log({person2});
// console.table(person2);

// cloning by spread

const person3 = {...person};
person3.firstName = "Peter";

console.log({person});
console.table(person);
console.log({person3});
console.table(person3);
