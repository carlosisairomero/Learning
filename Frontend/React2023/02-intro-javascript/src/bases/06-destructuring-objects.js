// NO Destructuring assignment

console.log('NO Destructuring assignment:');

const person = {
   name: 'Tony',
   age: 45,
   key: 'Ironman',
   role: 'Soldier'
};

console.log(person.name);
console.log(person.age);
console.log(person.key);

// Destructuring assignment

console.log('Destructuring assignment:');

const person2 = {
   name: 'Tony',
   age: 45,
   key: 'Ironman',
   role: 'Soldier'
};

const {name, age, key} = person;

console.log(name);
console.log(age);
console.log(key);

// Destructuring when passing an argument

console.log('Destructuring when passing an argument:');

const getPerson = ({name, age, role = 'Captain'}) => {
   console.log(name, age, role);
};
getPerson(person);


// Destructuring an object and retrieving another object

console.log('Destructuring an object and retrieving another object:');

const getPerson2 = ({name, age, role = 'Captain'}) => {
   return {
      newName: name,
      newAge: age
   }
};
const newObject = getPerson2(person);
const {newName, newAge} = newObject;
console.log(newName);
console.log(newAge);

// Destructuring an object which is inside another object

console.log('Destructuring an object which is inside another object:');

const getPerson3 = ({name, age, role = 'Captain'}) => {
   return {
      newName3: name,
      newAge3: age,
      newObject3: {
         lat: 12.50,
         lng: 15.90
      }
   }
};
const person3 = getPerson3(person);
const {newName3, newAge3, newObject3:{lat, lng}} = person3;
console.log(newName);
console.log(newAge);
console.log(lat, lng);



