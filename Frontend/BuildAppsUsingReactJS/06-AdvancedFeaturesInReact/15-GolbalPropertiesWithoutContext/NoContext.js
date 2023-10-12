
class ThemedBorderBackground extends React.Component{
    render() {

        return(
            <div className = {'bt bt-' + this.props.theme + ' bg-' + this.props.theme}>
                {this.props.children}
            </div>    
        );
    }
}

class ThemedButton extends React.Component {
    render() {
        return (
            <div>
                <button className = {'button button-' + this.props.theme}>
                    {this.props.label}
                </button>
            </div>
        );
    }
}

class ThemedDialog extends React.Component{
    render() {
        return (
            <div className = {'dialog dialog-' + this.props.theme}>

                <h3 className = "dialog-title">{this.props.title}</h3>
                <div className = "dialog-message">{this.props.message}</div>
                <br/>

                <ThemedButton theme={this.props.theme} label='OK'>
                </ThemedButton>
            </div>    
        );
    }
}



// TODO recording: Show each of the themes in turn

ReactDOM.render(
    <div>
        <ThemedBorderBackground theme='light'>
            Hello!
        </ThemedBorderBackground>

        <ThemedButton theme='light' label='Click me!'>
        </ThemedButton>

        <ThemedDialog theme='light' title='Dialog title here' message='Dialog message here'>
        </ThemedDialog>
    </div>,
    document.getElementById('react-no-context'));


// ReactDOM.render(
//     <div>
//         <ThemedBorderBackground theme='dark'>
//             Hello!
//         </ThemedBorderBackground>

//         <ThemedButton theme='dark' label='Click me!'>
//         </ThemedButton>

//         <ThemedDialog theme='dark' title='Dialog title here' message='Dialog message here'>
//         </ThemedDialog>
//     </div>,
//     document.getElementById('react-no-context'));






