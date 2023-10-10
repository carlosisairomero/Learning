var names = ['Alice', 'Bob', 'Charles', 'Darwin', 'Emily', 'Fiona', 'Garrett'];

function Names(props) {
    var namesList = [];
    for (var i = 1; i <= props.upto; i++) {
        // Access the function which is the child
        // of the component
        // The function argument is the index of the
        // element
        namesList.push(props.children(i, names));
    }

    return <div>{namesList}</div>
}

function NamesList(props) {

    return (
        <Names upto={props.upto}>
            {(index, names) => <div key={index}> {names[index]} </div>}
        </Names>
    );
}

// TODO recording: Uncomment each and show in browser

// ReactDOM.render(<NamesList upto={3}/>,
//     document.getElementById('outer'));

ReactDOM.render(<NamesList upto={5}/>,
    document.getElementById('outer'));
