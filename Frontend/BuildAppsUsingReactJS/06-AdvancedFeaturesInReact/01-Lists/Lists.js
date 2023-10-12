
class NamesList extends React.Component{

    render() {
        var listItems = this.props.names.map(
            (name) => <li>{name.toUpperCase()}</li>
        );
    
        return(
            <ul className = "names">{listItems}</ul>
        );
    }
}


const names = ['Esther', 'Lily', 'Candace', 'Edward', 'Sidney'];

ReactDOM.render(<NamesList names={names} />,
    document.getElementById('react-lists'));