import React, { Component } from 'react';
import './CreateAccount.css';
import EmployeeInfo from './EmployeeInfo';
import EmployeeOtherInfo from './EmployeeOtherInfo';
import EmployeeAddressInfo from './EmployeeAddressInfo';

export default class CreateAccount extends Component {
    render() {
        return (
            <div class="col-md-10 offset-1 mt-5 mb-5 signup-container">
                <form class="form-container">
                    <EmployeeInfo />
                    <EmployeeOtherInfo />
                    <EmployeeAddressInfo />
                </form>
            </div>
        )
    }
}

