class Name extends React.Component {
    render() {
        // TODO recording - show this is the wrong thing first
        // return (
        //     <li key={this.props.id}>{this.props.name.toUpperCase()}</li>
        // );

        // TODO recording - show this correct one second
        return (
            <li>{this.props.name.toUpperCase()}</li>
        );

    }
}


class NamesList extends React.Component {

    render() {

        // TODO recording - show this is the wrong thing first
        // var listItems = Object.keys(this.props.names).map(
        //     (key, index) => <Name id={key} name={names[key]} />
        // );

        // TODO recording - show this correct one second
        var listItems = Object.keys(this.props.names).map(
            (key, index) => <Name key={key} name={names[key]} />
        );
    
        return (
            <ul className = "names">{listItems}</ul>
        );
    }
}


const names = {
    'id1': 'Esther',
    'id2': 'Lily', 
    'id3': 'Candace', 
    'id4': 'Edward', 
    'id5': 'Sidney'
};


ReactDOM.render(<NamesList names={names} />,
    document.getElementById('react-lists-1'));

// TODO recording - uncomment this last to show that keys only
// need to be unique amongst siblings
// TODO recording - Inspect elements using Chrome browser tools once you uncomment this

// ReactDOM.render(<NamesList names={names} />,
//     document.getElementById('react-lists-2'));



