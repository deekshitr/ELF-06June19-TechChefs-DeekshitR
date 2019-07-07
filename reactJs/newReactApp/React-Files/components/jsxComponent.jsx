// const text = "This is JSX";
// const element = <h1>{text}</h1>

function Demo(props) {
    return (
        <div>
            <h1 style={{ color: 'red' }}>{props.name}</h1>
            {/* <button onClick={()=>alert('Button')}>click</button> */}
            <button onClick={alert.bind(this, 'Button')}>click</button>
        </div>

    )
}

class Message extends React.Component {

    constructor() {
        super();
        this.state = {
            name : "Akshay"
        }
    }
    click = () => {
        this.setState({
            name: "Roshni"
        })
    }
    clickLink = (event) => {
        event.preventDefault();
    }
    render() {
        return (
            <div>
            <h1>{this.state.name}</h1>
            <button onClick={this.click}>click</button>
            <a href="https://www.google.com" onClick={this.clickLink}>Google link</a>
            </div>
            
        )
    }

}

ReactDOM.render(<div><Message /> <Demo name="Akshay"/></div>, document.getElementById("app"));