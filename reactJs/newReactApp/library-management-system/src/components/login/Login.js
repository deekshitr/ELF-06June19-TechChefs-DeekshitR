import React, { Component } from 'react';
import './Login.css';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';

export default class Login extends Component {

    constructor() {
        super();
        this.state = {
            id: '',
            password: ''
        }
    }

    render() {
        return (
            <div className="col-4 offset-4 mt-5 mb-5 login-container">

                <div className="form-container pt-5">
                    <form rol="login" noValidate onSubmit={this.login}>
                        <legend className="text-center">Login</legend>

                        <div className="mt-5">
                            <div className="form-group">
                                <input type="email" name="emailId" className="form-control" value={this.state.id}
                                    onChange={(event) => { this.setState({ id: event.target.value }) }} placeholder="Enter Username" required />
                                <div className="email err-msg"></div>
                            </div>

                            <div className="form-group">
                                <input id="password" type="password" name="password" placeholder="Enter Password"
                                    className="form-control" value={this.state.password}
                                    onChange={(event) => { this.setState({ password: event.target.value }) }} required />
                                <i className="fa fa-eye eye-icon" onClick={this.onPassEyeClick}></i>
                                <div className="password err-msg"></div>
                            </div>
                            <div className="d-block pt-3">
                                <button name="mybutton" type="submit"
                                    id="loginbtn" className="btn btn-primary login-up-btn w-100">Login</button>
                            </div>
                        </div>

                    </form>

                </div>

            </div>
        )
    }
}
