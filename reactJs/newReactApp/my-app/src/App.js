import React from 'react';
import logo from './logo.svg';
import './App.css';
import  TodoList  from './components/toDoList';
import TodoItems from './components/toDoItems';
import BootstrapComponent from './components/bootstrapComponent';
import CorousalComponent from './components/corousalComponent';

class App extends React.Component{

  inputElement = React.createRef();
  
  constructor(props) {
    super(props) 
    this.state = {
      items: [],
      currentItem: {text: '',key:''},
      color: 'green',
      inputColor: 'yellow'
    }
  }
  handleInput = (e) => {
    console.log("handleInput event", e);
    const itemText = e.target.value;
    const currentItem = { text: itemText, key: Date.now()}
    this.setState({
      currentItem,
      inputColor: 'orange'
    })
    if (e.target.value.length === 0) {
      this.setState({
      inputColor: 'yellow'
      });


    }
  }
  addItem = e => {
    console.log("addItem");
    e.preventDefault();
    const newItem = this.state.currentItem
    if (newItem.text !== '') {
      console.log(newItem); 
      const items = [...this.state.items, newItem]
      this.setState({
        items: items,
        currentItem: {text: '',key:''},
        color: 'red',
        inputColor: 'yellow'
      })
    }
  }
  deleteItem = key => {
    const filteredItems = this.state.items.filter(item => {
      return item.key !== key
    })
   
    this.setState({
      items: filteredItems
    })
    console.log("this.state.items",this.state.items);
    
  }
  render() {
    console.log("render this.state.items",this.state.items);
    if (this.state.items.length === 0) {
      this.state.color = 'green';
    }

    return (
      <div className="App" style={{background: this.state.color}}>
       <div>
         <CorousalComponent />
             <h2>Welcome to React JS</h2>
             <TodoList  addItem={this.addItem}
                        inputElement={this.inputElement}
                        handleInput={this.handleInput}
                        currentItem={this.state.currentItem}
                        inputColor={this.state.inputColor}
                        />  

              <TodoItems entries={this.state.items} deleteItem={this.deleteItem}/>

              {/* <BootstrapComponent /> */}
        </div>
      </div>
    );
  }
  
}

export default App;
