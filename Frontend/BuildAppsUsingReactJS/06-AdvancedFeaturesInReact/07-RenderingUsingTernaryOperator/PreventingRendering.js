class Warning extends React.Component {
    render() {
        if (!this.props.warn) {
            return null;
        }

        return (
            <div className="comment">
                <span className="photo">
                    <img src="images/warning.png"/>
                </span>
                <span className="message">
                    Here is a warning to scare you!
                </span>
            </div>
        );
    }
}

class Display extends React.Component {
    state = {
       warn: true
    }

    toggle =() => {
      this.setState(function(prevState) {
          return {
              warn: !prevState.warn
          }
      });
    }


    render() {
        return (
            <div>
              <button className="button" onClick={this.toggle}>
                  {this.state.warn ? 'Hide' : 'Show'}
              </button>
              <Warning warn={this.state.warn}/>
            </div>
        );
    }
}

ReactDOM.render(<Display />, document.getElementById('outer'));
