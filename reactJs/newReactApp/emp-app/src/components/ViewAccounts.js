import React, { Component } from 'react';
import Axios from 'axios';
import { Modal, Button} from 'react-bootstrap';

export class ViewAccounts extends Component {

    constructor(props) {
        super(props);
        this.state = {
            accounts: [],
            show: false,
            name: '',
            email: '',
            phoneno: '',
            password: '',
            id: ''
        }
    }

    getRecords = () => {
        Axios.get('https://emp-app-89e5e.firebaseio.com/accounts.json').then((response) => {
            console.log("response", response);
            if (response.status === 200) {
                let fetchedAccounts = [];
                for (let accountKey in response.data) {
                    fetchedAccounts.push({
                        id: accountKey,
                        ...response.data[accountKey]
                    })
                }
                console.log("fetchedAccounts", fetchedAccounts);
                this.setState({
                    accounts: fetchedAccounts
                })
            }
        }).catch((error) => {
            console.log("error", error);
        })
    }

    componentDidMount = () => {
        this.getRecords();
    }

    openModal = (account) => {

        this.setState({
            show: true,
            id: account.id,
            name: account.name,
            email: account.email,
            phoneno: account.phoneno,
            password: account.password,
        })

        //this.props.navigation.navigate('/', { account: account })
    }

    deleteRecord = (account) => {

        console.log('account', account);
        Axios.delete('https://emp-app-89e5e.firebaseio.com/accounts/' + account.id + '/.json').then((response) => {
            console.log("response", response);
            if (response.status === 200) {

                let updatedAccounts = this.state.accounts.filter((item) => {
                    return item.id != account.id;
                })
                this.setState({
                    accounts: updatedAccounts
                })
                alert("Delete Successfully");
            }
        }).catch((error) => {
            console.log("error", error);
        });
    }

    handleClose = () => {
        this.setState({
            show: !this.state.show,
            name: '',
            email: '',
            phoneno: '',
            password: ''
        })
    }

    updateData = () => {
        
        const {id, name, email, password, phoneno} = this.state;
        const account = {name, email, password, phoneno};

        console.log("account data", account);
        console.log("account id", id);
        Axios.put('https://emp-app-89e5e.firebaseio.com/accounts/'+id+'/.json', account).then((response) => {
            console.log("response", response);
            if (response.status === 200) {
                
                this.handleClose();
                this.getRecords();
            }
        }).catch((error) => {
            console.log("error", error);
        });
    }

    render() {

        return (
            <div>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone Num</th>
                            <th scope="col">Password</th>

                            <th scope="col">Edit</th>
                            <th scope="col">Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.accounts.map((account) => {

                                return (
                                    <tr key={account.id}>
                                        <th scope="row">{account.name}</th>
                                        <td>{account.email}</td>
                                        <td>{account.phoneno}</td>
                                        <td>{account.password}</td>
                                        <td><i className="fa fa-pencil-square-o" aria-hidden="true" onClick={() => this.openModal(account)}></i></td>
                                        <td><i className="fa fa-trash" aria-hidden="true" onClick={() => this.deleteRecord(account)}></i></td>
                                    </tr>
                                )
                            })
                        }

                    </tbody>
                </table>
                
                <div>
                    <Modal show={this.state.show} onHide={this.handleClose}>
                        <Modal.Header closeButton>
                            <Modal.Title>Edit Account</Modal.Title>
                        </Modal.Header>
                        <Modal.Body>

                        <div className="row">
                        <div className="col">
                            <input type="text" className="form-control" placeholder="Name" value={this.state.name}
                            onChange={(event)=>{this.setState({name: event.target.value})}}/>
                        </div>
                            <div className="col">
                                <input type="email" className="form-control" placeholder="Email" value={this.state.email}
                                onChange={(event)=>{this.setState({email: event.target.value})}}/>
                            </div>
                    </div>
                    <div className="row mt-4">
                        <div className="col">
                            <input type="number" className="form-control" placeholder="Phone Number" value={this.state.phoneno}
                            onChange={(event)=>{this.setState({phoneno: event.target.value})}}/>
                        </div>
                            <div className="col">
                                <input type="password" className="form-control" placeholder="Password" value={this.state.password}
                                onChange={(event)=>{this.setState({password: event.target.value})}}/>
                            </div>
                    </div>

                        </Modal.Body>
                        <Modal.Footer>
                            <Button variant="secondary" onClick={this.handleClose}>
                                Close
                            </Button>
                            <Button variant="primary" onClick={this.updateData}>
                                Save Changes
                            </Button>
                        </Modal.Footer>
                    </Modal>
               
                </div>
               
                    
            </div>
        )
    }
}

export default ViewAccounts
