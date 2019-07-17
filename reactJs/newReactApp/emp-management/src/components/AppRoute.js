import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';

import Login from './login/Login';
import CreateAccount from './createAccount/CreateAccount';
import HomePage from './homePage/HomePage';

export default class AppRoute extends Component {
    render() {
        return (
            <Router>
                <Route exact path='/login' component={Login}></Route>
                <Route exact path='/signup' component={CreateAccount}></Route>
                
                <Route exact path='/home' component={HomePage}></Route>
            </Router>
        )
    }
}
