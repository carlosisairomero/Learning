import PropTypes from 'prop-types';

const name = 'Carlos Romero';
const age = 35;
const boolean = true;
const colorsArray = ['red','green','blue'];
const person = {
   name: 'Nathalia',
   age: 34,
   gender: 'F'
};
const aFunction = () => {
   const a = 2, b = 3;
   const sum = a + b;
   return sum
}

export const FirstApp = ({title, subtitle, year}) => {
   return (
      <div>
         <div>Name: {name}</div>
         <div>Age: {age}</div>
         <div>Boolean: {boolean}</div>
         <div>Array: {colorsArray}</div>
         <div>Object: {JSON.stringify(person)}</div>
         <div>Function: {aFunction()}</div>
         <div>props.title: {title}</div>
         <div>props.subtitle: {subtitle}</div>
         <div>props.year: {year}</div>
      </div>
   )
}

FirstApp.propTypes = {
   title: PropTypes.string.isRequired,
   subtitle: PropTypes.string.isRequired,
   year: PropTypes.number.isRequired
}

FirstApp.defaultProps = {
   title: "No Title",
   subtitle: "No Subtitle",
   year: 0,
}
