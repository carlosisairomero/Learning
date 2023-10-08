class MyFirstCompoment extends React.Component {
  render() {
    return (
      <div>
        <h2 className = "class-highlight">Hello world from a component!</h2>
      </div>
    );
  }
}

class MyFruitList extends React.Component {
  render() {
    const orange_str = "Orange";
    const apple_str = "Apple";
    const banana_str = "Banana";

    const fruit_img = 'images/fruit.jpg';
    const image_el = <img src= {fruit_img}/>

	var items = ['Jackfruit', 'Mango', 'Strawberry', 'Grapes', 'Peach'];

	var item = items[Math.floor(Math.random() * items.length)];


	const fruit_list = (
		<div>
		    <div key="el-key" >Some of my favorite fruits</div>
		    <ul>
		        <li key="O-key">{orange_str}</li>
		        <li key="A-key">{apple_str}</li>
		        <li key="B-key">{banana_str}</li>
		        <li key="N-key" className="my-fruit" >{item}</li>
		    </ul>
		    {image_el}
		</div>
	);

	return fruit_list;
  }
}

ReactDOM.render(<MyFirstCompoment />,
    document.getElementById("my-first-component"));


function on_tick() {
	ReactDOM.render(<MyFruitList />,
	    document.getElementById("my-fruit-list"));
}

setInterval(on_tick, 2000);


