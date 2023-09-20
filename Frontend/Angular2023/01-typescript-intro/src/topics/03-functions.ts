function addNumbers(a: number, b: number) {
   return a + b;
}

const addNumbersArrow = (a: number, b: number) => {
   return a + b;
} 

function multiply(n1: number, n2?: number, base: number = 2) {
   return n1 * base;
}

// const result: number = addNumbers(1,2);
// const result2: number = addNumbersArrow(1, 2);
// const multiplyResult: number = multiply(5)
// console.log({result, result2, multiplyResult});

interface Character {
   name: string;
   hp: number;
   showHp: () => void;
}

const healCharacter = (character: Character, amount: number) => {
   character.hp += amount;
}

const strider: Character = {
   name: 'Strider',
   hp: 50,
   showHp() {
      console.log(`Puntos de vida ${this.hp}`);
   }
}

healCharacter(strider, 10);

strider.showHp();

export {};