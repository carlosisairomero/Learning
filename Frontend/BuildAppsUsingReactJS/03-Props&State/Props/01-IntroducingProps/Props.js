class Greeting extends React.Component {    
    render() {
        return(
            <div className = 'prop-class'>       
                <h2>{this.props.message}</h2>
                <h2>{this.props.message2}</h2>
            </div>
        );
    }

} 

ReactDOM.render(<Greeting message = "Hello React Developers!" message2 = "Message 2"/>,
    document.getElementById('react-prop1'));

ReactDOM.render(<Greeting message = "Hi React Developers!"/>,
    document.getElementById('react-prop2'));
