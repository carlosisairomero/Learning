import { getHeroeById, getHeroesByOwner } from "../../src/base-pruebas/08-imp-exp";
import heroes from "../../src/data/heroes";

describe('Test 08-imp-exp', () => {
   test('getHeroeById should return just one heroe', () => {
      const id = 1;
      const testHeroe = {
         id: id,
         name: 'Batman',
         owner: 'DC'
      };
      const heroe = getHeroeById(id);
      expect(testHeroe).toEqual(heroe);
   });
   test('getHeroeById should return undefined', () => {
      const id = 10;
      const heroe = getHeroeById(id);
      expect(heroe).toEqual(undefined);
      expect(heroe).toBeFalsy();
   });
   test('getHeroeByOwner: when owner === DC should return 3 objects', () => {
      const owner = 'DC';
      const heroesByOwner = getHeroesByOwner(owner);
      expect(heroesByOwner.length).toBe(3);
      expect(heroesByOwner).toEqual(heroes.filter((heroe) => heroe.owner === owner));
   });
   test('getHeroeByOwner: when owner === Marvel should return 2 objects', () => {
      const owner = 'Marvel';
      const heroesByOwner = getHeroesByOwner(owner);
      expect(heroesByOwner.length).toBe(2);
      expect(heroesByOwner).toEqual(heroes.filter((heroe) => heroe.owner === owner));
   });
});