var el = React.createElement(
  "div", {key : "el-key"}, "Some of my favorite fruits");

var fr_el1 = React.createElement("li", {key : "O-key"}, "Orange");

// TODO recording: Change to "Avacado" and show update
var fr_el2 = React.createElement("li", {key : "A-key"}, "Apple");
var fr_el3 = React.createElement("li", {key : "B-key"}, "Banana");

var element_list = [el, fr_el1, fr_el2, fr_el3];

var list_el = React.createElement("ul", {className: "my-fruits"}, element_list)

ReactDOM.render(list_el, document.getElementById("my-react-app"));