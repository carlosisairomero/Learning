import { render, screen } from "@testing-library/react";
import { FirstApp } from "../src/FirstApp";

describe('Test: FirstApp', () => {
   const title = 'Hola, Soy Goku';
   const subtitle = 'Soy un subtitulo';

   test('should match with snapshot', () => {
      const {container} = render(
         <FirstApp title={title}/>
      );
      expect(container).toMatchSnapshot();
   });

   test('should show msg: Hola, Soy Goku', () => {
      render(
         <FirstApp title={title}/>
      );
      expect(screen.getByText(title)).toBeTruthy();
   });

   test('should show msg: Hola, Soy Goku in a h1', () => {
      render(
         <FirstApp title={title}/>
      );
      expect(screen.getByRole('heading', {level: 1}).innerHTML).toContain(title);
   });

   test('should show the subtitle sent by props', () => {
      render(
         <FirstApp 
            title={title} 
            subtitle={subtitle}
         />
      );
      expect(screen.getAllByText(subtitle).length).toBe(2);
   });
});