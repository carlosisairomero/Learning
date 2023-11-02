import { fireEvent, render, screen } from "@testing-library/react";
import { CounterApp } from "../src/CounterApp";

describe('Test: CounterApp', () => {
   const value = 10;

   test('should match with snapshot', () => {
      const {container} = render(
         <CounterApp 
            value={value}
         />
      );
      expect(container).toMatchSnapshot();
   });

   test('should show the initial value 100', () => {
      render(
         <CounterApp 
            value={value}
         />
      );
      expect(screen.getByRole('heading', {level: 2}).innerHTML).toContain('10');
   });

   test('should increase with button +1', () => {
      render(
         <CounterApp 
            value={value}
         />
      );
      fireEvent.click(screen.getByText('+1'));
      expect(screen.getByText('11')).toBeTruthy();
   });

   test('should decrement with button -1', () => {
      render(
         <CounterApp 
            value={value}
         />
      );
      fireEvent.click(screen.getByText('-1'));
      expect(screen.getByText('9')).toBeTruthy();
   });

   test('should work reset button', () => {
      render(
         <CounterApp 
            value={value}
         />
      );
      fireEvent.click(screen.getByText('+1'));
      fireEvent.click(screen.getByText('+1'));
      fireEvent.click(screen.getByText('+1'));
      fireEvent.click(screen.getByText('Reset'));
      expect(screen.getByText('10')).toBeTruthy();
   });

   test('should work reset button by aria-label', () => {
      render(
         <CounterApp 
            value={value}
         />
      );
      fireEvent.click(screen.getByText('+1'));
      fireEvent.click(screen.getByText('+1'));
      fireEvent.click(screen.getByText('+1'));
      fireEvent.click(screen.getByRole('button', {name: 'btn-reset'}));
      expect(screen.getByText('10')).toBeTruthy();
   });
});