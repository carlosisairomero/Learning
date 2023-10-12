const ThemeContext = React.createContext('light');

class ThemedBorderBackground extends React.Component {
    render() {

        return(
            <div className = {'bt bt-' + this.context + ' bg-' + this.context}>
                {this.props.children}
            </div>    
        );
    }
}

ThemedBorderBackground.contextType = ThemeContext;

class ThemedButton extends React.Component {
    render() {
        return (
            <div>
                <button className = {'button button-' + this.context}>
                    {this.props.label}
                </button>
            </div>
        );
    }
}

ThemedButton.contextType = ThemeContext;


class ThemedDialog extends React.Component{
    render() {
        return (
            <div className = {'dialog dialog-' + this.context}>

                <h3 className = "dialog-title">{this.props.title}</h3>
                <div className = "dialog-message">{this.props.message}</div>
                <br/>

                <ThemedButton label='OK'>
                </ThemedButton>
            </div>    
        );
    }
}

ThemedDialog.contextType = ThemeContext;


// TODO recording: Show each of the themes in turn

ReactDOM.render(
    <div>
        <ThemedBorderBackground>
            Hello!
        </ThemedBorderBackground>
        <ThemedButton label='Click me!'>
        </ThemedButton>

        <ThemedDialog title='Dialog title here' message='Dialog message here'>
        </ThemedDialog>
    </div>,
    document.getElementById('react-context'));


// ReactDOM.render(
//     <div>
//         <ThemeContext.Provider value="dark">
//             <ThemedBorderBackground>
//                 Hello!
//             </ThemedBorderBackground>
//            <ThemedButton label='Click me!'>
//            </ThemedButton>

//            <ThemedDialog title='Dialog title here' message='Dialog message here'>
//            </ThemedDialog>

//         </ThemeContext.Provider>
//     </div>,
//     document.getElementById('react-context'));


// ReactDOM.render(
//     <div>
//         <ThemedBorderBackground>
//             Hello!
//         </ThemedBorderBackground>

//         <ThemedButton label='Click me!'>
//         </ThemedButton>

//         <ThemeContext.Provider value="dark">
//             <ThemedDialog title='Dialog title here' message='Dialog message here'>
//             </ThemedDialog>
//         </ThemeContext.Provider>
//     </div>,
//     document.getElementById('react-context'));


// ReactDOM.render(
//     <div>
//         <ThemeContext.Provider value="dark">
//             <ThemedBorderBackground>
//                 Hello!
//             </ThemedBorderBackground>
//         </ThemeContext.Provider>

//         <ThemedButton label='Click me!'>
//         </ThemedButton>

//         <ThemedDialog title='Dialog title here' message='Dialog message here'>
//         </ThemedDialog>
//     </div>,
//     document.getElementById('react-context'));







