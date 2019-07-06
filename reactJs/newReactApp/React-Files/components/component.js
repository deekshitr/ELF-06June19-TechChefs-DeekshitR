function Header(props) {
    console.log("props header", props);
    return React.createElement("h1", {className:"demo-style"}, "Header");
}
function Content() {
    return React.createElement("p", {className:"demo-style"}, "content");
}
function Footer() {
    return React.createElement("h1", {className:"demo-style"}, "Footer");
}
const header = React.createElement(Header, {item: ['bag']});
const content = React.createElement(Content);
const footer = React.createElement(Footer);
const myApp = React.createElement("div", null, header, content, footer);
ReactDOM.render(myApp, document.getElementById("app1"));