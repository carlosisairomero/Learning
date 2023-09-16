let currentKey = '';
let result = '';
let tempResult = '';
let operator = '';
document
   .querySelector(".calc-table")
   .addEventListener("click", function (event) {
      if(event.target.className !== 'result') {
         currentKey = event.target.innerText;
         result += currentKey;
      }

      if (currentKey === '0' && result === '0'){
         setResultToZero();
      } else if (currentKey === 'C') {
         doClear();
      } else if (currentKey === '⬅') { 
         doBackspace();
      } else if (currentKey === '+' || currentKey === '-' || currentKey === 'x' || currentKey === '÷') { 
         operator = currentKey;
         tempResult = gimmeOnlyResult();
         setResultToZero();
      } else if (currentKey === '=') {
         doOperation();
      } else {
         document.querySelector(".result").innerText = result;
      }

      console.log("currentKey: " + currentKey);
      console.log("tempResult: " + tempResult);
      console.log("result: " + result);
      console.log("operator: " + operator);
});

function gimmeOnlyResult() {
   return result.substring(0, (result.length-1));
}

function setResultToZero() {
   document.querySelector(".result").innerText = '0';
   result = '';
}

function doClear() {
   setResultToZero();
   operator = '';
   tempResult = '';
}

function doBackspace() {
   result = gimmeOnlyResult();
   if(result.length <= 1) {
      setResultToZero();
   } else {
      result = result.substring(0, (result.length-1));
      document.querySelector(".result").innerText = result;
   }
}

function doOperation() {
   let num1 = Number(tempResult);
   let num2 = Number(gimmeOnlyResult());
   console.log("num1: " + num1);
   console.log("num2: " + num2);
   if (operator === '+') {
      result = (num1 + num2).toString(); 
   } else if (operator === '-') {
      result = (num1 - num2).toString(); 
   } else if (operator === 'x') {
      result = (num1 * num2).toString(); 
   } else if (operator === '÷') {
      result = (num1 / num2).toString(); 
   } 
   document.querySelector(".result").innerText = result;
}

