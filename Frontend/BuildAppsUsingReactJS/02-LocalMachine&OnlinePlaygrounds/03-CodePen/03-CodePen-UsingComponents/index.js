class Food extends React.Component{
    render() {
        return(
            <div>
                <h2 id = "head">These are some of my favorite foods:</h2>
            </div>

        );
    }
}

class FoodNames extends React.Component{
    render() {
        return (
            <div>
                <ol className = 'foods'>
                    <li key="food1"> Dim Sum </li>
                    <li key="food2"> Pizza </li>
                    <li key="food3"> Spaghetti </li>
                </ol>
            </div>

        );
    }
}

ReactDOM.render(<div>
                    <Food />
                </div>, 
                document.getElementById('favorite-foods')); 

ReactDOM.render(<div>
                    <FoodNames />
                </div>, 
                document.getElementById('food-list')); 
