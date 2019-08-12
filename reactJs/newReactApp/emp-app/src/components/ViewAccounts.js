import React, { Component } from 'react';
import Axios from 'axios';

export class ViewAccounts extends Component {

    constructor() {
        super();
        this.state = {
            accounts: []
        }
    }

    componentDidMount = () => {
        Axios.get('https://emp-app-89e5e.firebaseio.com/accounts.json').then((response) => {
            console.log("response", response);
            if (response.status === 200) {
                let fetchedAccounts = [];
                for(let accountKey in response.data) {
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
                                        <td></td>
                                        <td></td>
                                    </tr>
                                )
                            })
                        }
                        
                    </tbody>
                </table>
            </div>
        )
    }
}

export default ViewAccounts
