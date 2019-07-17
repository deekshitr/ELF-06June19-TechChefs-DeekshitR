import React, { Component } from 'react'
import './HomePage.css';

export default class EmployeeInfo extends Component {

    constructor(props) {
        super(props)
    }
    
    render() {
        return (
            <div className="card mx-2">
                <div className="d-flex m-3">
                    <h2 className="card-title">Employee Info</h2>
                    <a href="./update-emp-form" className="btn btn-primary w-25 login-up-btn ml-auto" >Edit</a>
                </div>
                <div className="card-body">
                    <div>

                        <div className="d-flex">
                            <p className="card-text">EMP ID : </p>
                            <div className="ml-2">{this.props.empInfo.id}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP First Name : </p>
                            <div className="ml-2">{this.props.empInfo.name}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP AGE : </p>
                            <div className="ml-2">{this.props.empInfo.age}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP GENDER : </p>
                            <div className="ml-2">{this.props.empInfo.gender}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP PHONE :</p>
                            <div className="ml-2">{this.props.empInfo.phone}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP JOINING DATE :</p>
                            <div className="ml-2">{this.props.empInfo.joiningDate}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP ACCOUNT NUM :</p>
                            <div className="ml-2">{this.props.empInfo.accNum}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP DESIGNATION :</p>
                            <div className="ml-2">{this.props.empInfo.designation}</div>
                        </div>

                        <div className="d-flex">
                            <p className="card-text">EMP DOB :</p>
                            <div className="ml-2">{this.props.empInfo.dob}</div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}
