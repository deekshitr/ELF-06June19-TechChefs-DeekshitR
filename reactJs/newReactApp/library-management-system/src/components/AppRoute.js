import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';

import Login from './login/Login';

export default class AppRoute extends Component {
    render() {
        return (
            <Router>
                <Route exact path='/' component={Login}></Route>

            </Router>
        )
    }
}
