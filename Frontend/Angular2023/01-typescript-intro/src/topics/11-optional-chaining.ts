export interface Passenger {
   name: string;
   children?: string[];
}

const passanger1: Passenger = {
   name: 'Carlos',
}
const passanger2: Passenger = {
   name: 'Jhon',
   children: ['Natalia', 'Elizabeth'],
}

const printChildren  = (passenger: Passenger) => {
   const howManyChildren = passenger.children?.length || 0;
   console.log(passenger.name, howManyChildren);
};

printChildren(passanger1);
printChildren(passanger2);
