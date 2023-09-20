export class Person {
   // 1st (long way):
   // public name: string;
   // public address: string;

   // constructor(name: string, address: string) {
   //    this.name = name;
   //    this.address = address;
   // }

   // 2nd (short way):

   constructor(
      public name: string,
      public address: string) {}
}

export class Hero extends Person {
   constructor(
      public name: string,
      public age: number,
      public realName: string,
   ) {
      super(realName, 'New York'); 
   }
}

const ironman = new Hero('Ironman', 45, 'Tony');
console.log(ironman);