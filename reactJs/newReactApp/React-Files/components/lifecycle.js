class LifeCycle extends React.Component {

    constructor(props) {
        super(props);
        console.log("constructor");
        this.state = {
            name: 'Nitya',
            check: true
        }
    }

    static getDerivedStateFromProps() {
        console.log("getDerivedStateFromProps");
        return null;
    }

    componentDidMount() {
        console.log("componentDidMount");
    }

    shouldComponentUpdate() {
        console.log("shouldComponentUpdate");
        return true;
    }

    getSnapshotBeforeUpdate() {
        console.log("getSnapshotBeforeUpdate");
        return "Snapshot";
    }

    componentWillUnmount() {
        console.log("componentWillUnmount");
    }

    componentDidUpdate(props, state, snapshot) {
        console.log("componentDidUpdate");
        console.log("props", props);
        console.log("state", state);
        console.log("snapshot", snapshot);
    }

    clickCheck = () => {
        this.setState({
            name: "Janvi",
            check: false
        })
    }
    clickUncheck = () => {
        this.setState({
            name: 'Nitya',
            check: true
        })
    }
    render() {
        console.log("render");

        if (this.state.check) {
            return (
                <div>
                    <h1>Parent Component</h1>
                    <h1>{this.state.name}</h1>
                    <button onClick={this.clickCheck}>Click</button>
                    <ChildLifeCycle />
                </div>

            )

        } else {

            return (
                <div>
                    <h1>Parent Component</h1>
                    <h1>{this.state.name}</h1>
                    <button onClick={this.clickUncheck}>Click</button>
                </div>
            )
        }
    }
}

class ChildLifeCycle extends React.Component {
    constructor(props) {
        super(props);
        console.log("child constructor");
        this.state = {
            name: 'Janvi',
            check: false
        }
    }

    static getDerivedStateFromProps() {
        console.log("child getDerivedStateFromProps");
        return null;
    }

    componentDidMount() {
        console.log("child componentDidMount");
    }

    shouldComponentUpdate() {
        console.log("child shouldComponentUpdate");
        return true;
    }

    getSnapshotBeforeUpdate() {
        console.log("child getSnapshotBeforeUpdate");
        return "Snapshot";
    }

    componentWillUnmount() {
        console.log("child componentWillUnmount");
    }

    componentDidUpdate(props, state, snapshot) {
        console.log("child componentDidUpdate");
        console.log("child props", props);
        console.log("child state", state);
        console.log("child snapshot", snapshot);
    }

    clickCheck = () => {
        this.setState({
            name: "Janvi",
            check: false
        })
    }
    clickUncheck = () => {
        this.setState({
            name: 'Nitya',
            check: true
        })
    }
    render() {
        console.log("child render");

        if (this.state.check) {
            return (
                <div>
                    <h1>Child Component</h1>
                    <h1>{this.state.name}</h1>
                    <button onClick={this.clickCheck}>Click</button>
                </div>

            )

        } else {

            return (
                <div>
                    <h1>Child Component</h1>
                    <h1>{this.state.name}</h1>
                    <button onClick={this.clickUncheck}>Click</button>
                </div>
            )
        }
    }
}

ReactDOM.render(<div><LifeCycle /></div>, document.getElementById("app"))