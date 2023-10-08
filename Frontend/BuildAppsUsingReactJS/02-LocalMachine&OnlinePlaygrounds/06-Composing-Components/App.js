import React from 'react';
import book from './books.jpg';
import './App.css';
import Table from './Table';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={book} className="App-logo" alt="logo" />
        <Table />
      </header>
    </div>
  );
}

export default App;
