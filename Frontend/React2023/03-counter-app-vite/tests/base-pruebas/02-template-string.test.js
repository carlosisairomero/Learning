import { getSaludo } from "../../src/base-pruebas/02-template-string";

describe('Test: 02-template-string', () => {
   test('getSaludo should return "Hola Carlos"', () => { 
      const name = 'Carlos';
      const message = getSaludo(name);
      expect(message).toBe(`Hola ${name}`);
   })
});