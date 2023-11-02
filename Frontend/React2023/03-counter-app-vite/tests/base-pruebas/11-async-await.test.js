import { getImagen } from "../../src/base-pruebas/11-async-await";

describe('Test: 11-async-await', () => {
   test('getImagen should return a URL of a random image', async() => {
      const url = await getImagen();
      console.log(url);
      expect(typeof url).toBe('string');
   });
});