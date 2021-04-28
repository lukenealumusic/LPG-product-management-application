import React from 'react';
import './App.css';
import Table from "./Table";

function App() {
  return (
    <div className="App">
      <Table></Table>
    </div>
  );
}

// function componentDidMount() {
//     fetch('http://localhost:8080/api/products/get-all-products')
//         .then(res => res.json())
//         .then((data) => {
//             let d  = data;
//         })
//         .catch(console.log)
// }

export default App;
