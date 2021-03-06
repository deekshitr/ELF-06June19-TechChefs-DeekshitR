import React, { Component } from 'react'
import Axios from 'axios';

const txtFieldState = {
    value: "",
    valid: true,
    typeMismatch: false,
    errMsg: "" //this is where our error message gets across
};

export class CreateAccount extends Component {

    state = {
        email: { ...txtFieldState, fieldName: "Email", required: true, requiredTxt: "Email is required", formatErrorTxt: "Incorrect email format" },
        firstname: { ...txtFieldState, fieldName: "First Name", required: true, requiredTxt: "First Name is required" },
        lastname: { ...txtFieldState, fieldName: "Last Name", required: false, requiredTxt: "Last Name is required" },
        allFieldsValid: false
    };
    
    constructor() {
        super();
        this.state = {
            name: '',
            email: '',
            phoneno: '',
            password: '',
            isSuccess: null
        }
    }

    postData = (event) => {
        event.preventDefault();
        console.log("Post Data", this.state);
        let accountData = this.state;
        Axios.post('https://emp-app-89e5e.firebaseio.com/accounts.json', accountData).then((response) => {
            console.log("response", response);
            if (response.status === 200) {
                this.setState({
                    name: '',
                    email: '',
                    phoneno: '',
                    password: '',
                    isSuccess: true
                })

                alert("Record added successfully");
            } else {
                this.setState({
                    isSuccess: false
                });
            }
            
        }).catch((error) => {
            console.log("error", error);
        });
    }

    render() {
        return (
            <div className="mx-auto mt-5 w-75">
                {/* <div class="alert alert-success" role="alert">
                   
                </div> */}

                <form onSubmit={this.postData} noValidate>
                    <div className="row">
                        <div className="col">
                            <input type="text" className="form-control" placeholder="Name" value={this.state.name}
                            onChange={(event)=>{this.setState({name: event.target.value})}} required/>
                        </div>
                            <div className="col">
                                <input type="email" className="form-control" placeholder="Email" value={this.state.email}
                                onChange={(event)=>{this.setState({email: event.target.value})}} required/>
                            </div>
                    </div>
                    <div className="row mt-4">
                        <div className="col">
                            <input type="number" className="form-control" placeholder="Phone Number" value={this.state.phoneno}
                            onChange={(event)=>{this.setState({phoneno: event.target.value})}} required/>
                        </div>
                            <div className="col">
                                <input type="password" className="form-control" placeholder="Password" value={this.state.password}
                                onChange={(event)=>{this.setState({password: event.target.value})}} required/>
                            </div>
                    </div>

                    <button type="submit" className="btn btn-primary float-right mt-4">Submit</button>
                </form>
            </div>
        )
    }
}
            
export default CreateAccount
