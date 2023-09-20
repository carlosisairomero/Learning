export class Person {
   constructor(
      public name: string,
      public address?: string) {}
}

export class Hero {
   constructor(
      public alterEgo: string,
      public age: number,
      public realName: string,
      public person: Person,
   ) {}
}

const person = new Person('Carlos')
const ironman = new Hero('Ironman', 45, 'Tony', person);
console.log(ironman);