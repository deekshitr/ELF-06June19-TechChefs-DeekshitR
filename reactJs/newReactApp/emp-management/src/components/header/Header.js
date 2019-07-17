import React, { Component } from 'react'
import Axios from 'axios';
import { withRouter } from "react-router-dom";

class Header extends Component {

    constructor() {
        super();
    }

    logout = (event) => {
        event.preventDefault();
        Axios.get('http://localhost/empspringrest/employee-portal/logout').then((response) => {
            console.log("response", response);
            if (response.data.statusCode === 201) {                
                this.props.history.push('/login');
            } else {

            }
        }).catch((error) => {
            console.log("error", error);
        })
    }

    render() {
        return (
            <div>
                <nav className="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
                    <a className="navbar-brand" href="./home.html">EMP</a>
                    <button className="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false"
                        aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>

                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav ml-5">
                            <li className="nav-item active"><a className="nav-link"
                                href="./home.html">Home </a></li>

                        </ul>
                        <form className="form-inline my-2 my-lg-0 ml-auto mx-5">
                            <div className="dropdown">

                                <input className="form-control search-box mr-sm-2" type="text"
                                    placeholder="Search with emp id or emp name" name="empSearch"
                                    aria-label="Search" />

                            </div>

                            <button className="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
                        </form>
                        
                        <a className="navbar-brand" href="" onClick={this.logout}> Logout </a>

                    </div>
                </nav>
            </div>
        )
    }
}

export default withRouter(Header);