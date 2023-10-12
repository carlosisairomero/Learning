
class CustomDialog extends React.Component{
    render() {

        var color = 'green';
        if (this.props.dialogtype == "warning") {
            color = 'orange';
        } else if (this.props.dialogtype == "error") {
            color = 'red';
        }

        return (
            <div className = {'bt bt-' + color + ' bg-' + color}>
                <h3 className = "dialog-title">{this.props.title}</h3>
                <div className = "dialog-message">{this.props.message}</div>
                <br/>
            </div>    
        );
    }
}

class OKDialog extends React.Component {
    render() {
        return (
            <div>
                <CustomDialog dialogtype = "ok" title="Success" 
                              message="Your operation was completed successfully">
                </CustomDialog>
            </div>
        );
    }
}


class WarningDialog extends React.Component {
    render() {
        return (
            <div>
                <CustomDialog dialogtype= 'warning' title="Warning!" 
                              message="Your operation was completed but there were a few issues">
                </CustomDialog>
            </div>
        );
    }
}


class ErrorDialog extends React.Component {
    render() {
        return (
            <div>
                <CustomDialog dialogtype= 'error' title="Error!" 
                              message="Your operation could not be completed">
                </CustomDialog>
            </div>
        );
    }
}


// TODO recording: Show each of the dialogs in turn

ReactDOM.render(<OKDialog />,
    document.getElementById('react-composition-specialization'));

// ReactDOM.render(<WarningDialog />,
//     document.getElementById('react-composition-specialization'));

// ReactDOM.render(<ErrorDialog />,
//     document.getElementById('react-composition-specialization'));








