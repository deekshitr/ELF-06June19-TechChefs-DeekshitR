class Header extends React.Component {
    constructor(props) {
        super(props);
        console.log("props header", this.props);
    }
    render () {
        console.log("props header in render", this.props);
        return React.createElement("h1", {className:"demo-style"}, "Header");
    }
}
class Content extends React.Component {
    constructor(props) {
        super(props);
        console.log("props content", this.props);
    }
    render () {
        return React.createElement("ul", {className:"demo-style"}, 
        this.props.items.map((item, key) => {
            return React.createElement("li",{className:"demo-style", key: key}, item);
        })
        );
    }
}
class Footer extends React.Component {
    
    render () {
        return React.createElement("h1", {className:"demo-style"}, "Footer");
    }
}
const items = ['bag', 'pen', 'book'];
const header = React.createElement(Header, {item: ['bag']});
const content = React.createElement(Content, {items: items});
const footer = React.createElement(Footer);
const myApp = React.createElement("div", null, header, content, footer);
ReactDOM.render(myApp, document.getElementById("app2"));