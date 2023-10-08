import React, { Component } from 'react'
// import TableHeader from './TableHeader'
// import TableBody from './TableBody'

class Table extends Component {
  render() {
    return (
      <table>
        <thead>
          <tr>
            <th>Book</th>
            <th>Author</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>Harry Potter and the Goblet of Fire</td>
            <td>J. K Rowling</td>
          </tr>
          <tr>
            <td>Diary of a Wimpy Kid</td>
            <td>Jeff Kinney</td>
          </tr>
          <tr>
            <td>Charlie and the Chocolate Factory</td>
            <td>Roald Dahl</td>
          </tr>
          <tr>
            <td>Timmy Failure</td>
            <td>Stephan Pastis</td>
          </tr>
        </tbody>
      </table>
    )
  }
}

// TODO while recording - this should be the second part of this demo 
// class Table extends Component {
//   render() {
//     return (
//       <table>
//         <TableHeader />
//         <TableBody />
//       </table>
//     )
//   }
// }


export default Table