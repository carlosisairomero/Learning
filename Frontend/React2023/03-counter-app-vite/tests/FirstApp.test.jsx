import { render } from "@testing-library/react";
import { FirstApp } from "../src/FirstApp";

describe('Test: FirstApp', () => {
   // test('should match with snapshot', () => {
   //    const title = 'Hola, Soy Goku';
   //    const {container} = render(<FirstApp title={title}/>);
   //    expect(container).toMatchSnapshot();
   // });
   test('should show title in h1', () => {
      const title = 'Hola, Soy Goku';
      const {container, getByText, getByTestId} = render(<FirstApp title={title}/>);
      expect(getByText(title)).toBeTruthy();
      
      expect(getByTestId('test-title').innerHTML).toBe(title);
   });
   test('should show the subtitle sent by props', () => {
      const title = 'Hola, Soy Goku';
      const subtitle = 'Soy un subtitulo';
      const {getAllByText} = render(
         <FirstApp 
            title={title} 
            subtitle={subtitle}
         />
      );
      expect(getAllByText(subtitle).length).toBe(2);
   });
});