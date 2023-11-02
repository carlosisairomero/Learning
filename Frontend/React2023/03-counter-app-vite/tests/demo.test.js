describe('Pruebas en <DemoComponent />', () => { 
   test('test1', () => {
      const message1 = 'Hola Mundo';
      const message2 = message1.trim();
      expect(message1).toBe(message2);
   });
})