const orange_str = "Orange";
const apple_str = "Apple";
const banana_str = "Banana";

const fruit_list =       
  <div>
      <div key="el-key" className="my-fruit">Some of my favorite fruits</div>
      <ul>
          <li key="O-key">{orange_str}</li>
          <li key="A-key">{apple_str}</li>
          <li key="B-key">{banana_str}</li>
      </ul>
  </div>

ReactDOM.render(fruit_list, document.getElementById("my-react-app"));