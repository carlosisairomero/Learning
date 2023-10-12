const currencyNames = {
  d: 'Dollars',
  r: 'Rupees'
};


function Millionaire(props) {
  if (props.networth > 1000000) {
    return <p className = "millionaire">A millionaire!</p>;
  }
  
  return <p className = "not-millionaire">Net yet a millionaire...</p>;
}


class NetWorthInput extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      local_networth: 0
    }
  }

  handleChange = (e) => {
    this.setState({
      local_networth: parseFloat(e.target.value) || 0
    });
  }

  render() {
    const currency = this.props.currency;

    return (
        <fieldset className = "networth">
          <legend>Enter net worth in {currencyNames[currency]}:</legend>

          <input className='input'
                 defaultValue={this.state.local_networth}
                 onChange={this.handleChange} />

          <Millionaire networth={this.state.local_networth} />
        </fieldset>
    );
  }
}

class MillionaireCalculator extends React.Component {

  constructor(props) {
    super(props);

  }

  // TODO recording: First show only the networth input in dollars
  // then add the rupees
  // <NetWorthInput currency={'r'}/>

  render() {
    return (
      <div className="contents">
        <NetWorthInput currency={'d'}/>

      </div>
    );
  }
}

ReactDOM.render(
  <MillionaireCalculator />,
  document.getElementById('outer')
);
