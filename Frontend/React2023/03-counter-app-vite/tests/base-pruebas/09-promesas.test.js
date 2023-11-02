import { getHeroeByIdAsync } from "../../src/base-pruebas/09-promesas";

describe('Test: 09-promesas', () => {
   test('getHeroeByIdAsync should return a heroe', (done) => {
      const id = 1;
      getHeroeByIdAsync(id)
         .then(heroe => {
            expect(heroe).toEqual({
               id: 1,
               name: 'Batman',
               owner: 'DC'
            });
            done();
         });
   });
   test('getHeroeByIdAsync when heroe does not exist should return an error', (done) => {
      const id = 100;
      getHeroeByIdAsync(id)
         .catch(error => {
            expect(error).toBe('No se pudo encontrar el héroe ' + id)
            console.log(error);
            done();
         });
   });
});