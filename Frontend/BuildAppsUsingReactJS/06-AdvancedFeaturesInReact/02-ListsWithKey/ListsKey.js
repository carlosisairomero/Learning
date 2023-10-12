
class NamesList extends React.Component{

    render() {
        // TODO while recording: Show each of these in turn

        // TODO First show this
        // var listItems = this.props.names.map(
        //     (name) => <li key={1}>{name.toUpperCase()}</li>
        // );

        // TODO Second show this
        // var listItems = this.props.names.map(
        //     (name) => <li key={name}>{name.toUpperCase()}</li>
        // );

        // TODO Third show this
        var listItems = this.props.names.map(
            (name, index) => <li key={index}>{name.toUpperCase()}</li>
        );
    
        return(
            <ul className = "names">{listItems}</ul>
        );
    }
}


const names = ['Esther', 'Lily', 'Candace', 'Edward', 'Sidney'];


ReactDOM.render(<NamesList names={names} />,
    document.getElementById('react-lists'));