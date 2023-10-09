// Template Strings

const firstName = 'Carlos';
const lastfirstName = 'Romero';
const completfirstName = `
   firstName lastfirstName
   ${firstName} ${lastfirstName}
`
console.log(completfirstName);

function greeting(firstName) {
   return 'Hi ' + firstName;
}

console.log(`Greeting: ${greeting(firstName)}`);