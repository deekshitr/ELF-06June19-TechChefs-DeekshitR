import React, { Component } from 'react';
import '../styles/toDoList.css';

class TodoList extends Component {
    componentDidUpdate () {
        this.props.inputElement.current.focus()
    }
    render () {
        return (
            <div className="mt-4">
                <div className="header">
                    <form onSubmit={this.props.addItem}>
                        <input  type="text" placeholder="Task" 
                                ref={this.props.inputElement}
                                value={this.props.currentItem.text}
                                onChange={this.props.handleInput}
                                style={{background: this.props.inputColor}}/>
                        <button type="submit">Add Task</button>
                    </form> 
                </div>
            </div>
        )
           
    }
}

export default TodoList;