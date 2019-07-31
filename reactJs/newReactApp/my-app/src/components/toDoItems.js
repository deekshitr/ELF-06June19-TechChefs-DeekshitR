import React, {Component} from 'react';

class TodoItems extends Component {

    constructor(props) {
        super(props);
        this.createTasks= this.createTasks.bind(this);
    }

    createTasks(item) {
        return (
            <div className="list-container d-flex">
                <li key={item.key}>{item.text}</li>
                <i class="fa fa-times ml-auto" aria-hidden="true" onClick={() => this.props.deleteItem(item.key)}></i>
            </div>
        
        )
    }
    render() {
        const todoEntries = this.props.entries
        const listItems = todoEntries.map(this.createTasks)
        return <ul className="theList mt-5">{listItems}</ul>

    }
}
export default TodoItems