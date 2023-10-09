// Functions

// Good practice:

const greet = function greet(name) {
   return `Hi, ${name}`;
}
console.log(greet('Carlos'));

// lambda

const greet2 = (firstName) => `Hi, ${firstName}`;
console.log(greet2('Carlos'));

// lambda retreiving an object

const getUser = () => {
   return {
      uid: '123',
      username: 'user123'
   }
};
console.log(getUser());

const getUser2 = () => (
   {
      uid: '123',
      username: 'user123'
   }
);
console.log(getUser2());

// lambda retreiving an object with parameters

const activeUser = (name) => (
   {
      uid: '123',
      username: name
   }
);
console.log(activeUser('Carlos'));


