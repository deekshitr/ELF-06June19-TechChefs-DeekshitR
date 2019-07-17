import React, { Component } from 'react';
import './Login.css';
import Axios from 'axios';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';

export default class Login extends Component {

    constructor() {
        super();
        this.state = {
            id: '',
            password: ''
        }
    }

    onPassEyeClick = () => {

    }

    login = (event) => {
        event.preventDefault();
        console.log("Post Data", this.state);
        let loginData = this.state;
        Axios.post('http://localhost/empspringrest/employee-portal/login',null, {params: {
            id: this.state.id,
            password: this.state.password
        }}).then((response) => {
            console.log("response", response);
            if (response.data.statusCode === 201) {
                localStorage.setItem('userId', response.data.empInfoBeans[0].id);
                this.props.history.push('/home');
               
            } else {
                alert("login failed");
            }
            
        }).catch((error) => {
            console.log("error", error);
        });
    }

    render() {
        return (
            <div className="col-4 offset-4 mt-5 mb-5 login-container">

                <div className="form-container pt-5">
                    <form rol="login" noValidate onSubmit={this.login}>
                        <legend className="text-center">Login</legend>
                        <div className="form-group">
                            <label>Emp ID: </label>
                            <input type="number" name="id" className="form-control" value={this.state.id}
                            onChange={(event)=>{this.setState({id: event.target.value})}} required />
                            <div className="email err-msg"></div>
                        </div>

                        <div className="form-group">
                            <label>Password : </label>
                            <input id="password" type="password" name="password"
                                className="form-control" value={this.state.password}
                                onChange={(event)=>{this.setState({password: event.target.value})}} required />
                            <i className="fa fa-eye eye-icon" onClick={this.onPassEyeClick}></i>
                            <div className="password err-msg"></div>
                        </div>
                        <div className="d-block">
                            <button name="mybutton" type="submit"
                                id="loginbtn" className="btn btn-primary login-up-btn float-right">Login</button>
                        </div>
                    </form>

                </div>

                <div className="d-block">
                    <Link className="btn btn-primary login-up-btn" to="/signup">Create Account</Link>
                    <a className="btn btn-primary login-up-btn float-right" href="">Forgot Password</a>
		        </div>

            </div>
        )
    }
}

