import React, { Component } from 'react'
import Header from '../header/Header';
import './HomePage.css';
import Axios from 'axios';
import image from '../../assests/images/pic1.jpg';
import EmployeeInfo from './EmployeeInfo';

export default class HomePage extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             empInfo: [],
             isData: false
        }
    }

    componentDidMount = () => {
        let userId = localStorage.getItem("userId");
        Axios.get('http://localhost/empspringrest/employee-portal/getemployee?empSearch='+userId).then((response) => {
            console.log("response", response);
            if (response.data.statusCode === 201) {
               this.setState({
                    empInfo: response.data.empInfoBeans[0],
                    isData: true
               });
            }
        }).catch((error) => {
            console.log("error", error);
        })
    }

    render() {

        console.log("this.state.empInfo", this.state.empInfo);
        return (
            <div>
                <Header />

               
                    { 
                         this.state.isData ? (
                            <div className="d-flex mx-2 home-container">
                    <div className="w-25 left-container">
                        <div>
                            <a href="./profile">
                                <img src={image}
                                    className="img-responsive img-thumbnail img-rounded" alt="" />
                            </a>

                            <div className="m-5">
                                <p>EMP ID : {this.state.empInfo.id}</p>
                                <p>NAME : {this.state.empInfo.name}</p>
                                <p>AGE : {this.state.empInfo.gender}</p>
                                <p>GENDER : {this.state.empInfo.name}</p>
                            </div>

                        </div>
                    </div>

                    <div className="right-container mb-2">
                        <div className="card-group">
                            
                            <EmployeeInfo empInfo={this.state.empInfo} />


                            <div className="card mx-2">
                                <div className="d-flex m-3">
                                    <h2 className="card-title">Employee Other Info</h2>
                                    <button name="mybutton" type="button" id="loginbtn"
                                        className="btn btn-primary w-25 login-up-btn ml-auto">Edit</button>
                                </div>
                                <div className="card-body">
                                    <div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP First Name :</p>
                                            <div className="ml-2">Dhanush</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP Last Name :</p>
                                            <div className="ml-2">Gowda</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP AGE :</p>
                                            <div className="ml-2">28</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP GENDER :</p>
                                            <div className="ml-2">MALE</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP PHONE :</p>
                                            <div className="ml-2">9944556677</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP JOINING DATE :</p>
                                            <div className="ml-2">23/09/1992</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP ACCOUNT NUM :</p>
                                            <div className="ml-2">6677889933</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP DESIGNATION :</p>
                                            <div className="ml-2">Software Engineer</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP DOB :</p>
                                            <div className="ml-2">23/09/1992</div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div className="card-group mt-4">
                            <div className="card mx-2">
                                <div className="d-flex m-3">
                                    <h2 className="card-title">Employee Address Info</h2>
                                    <button name="mybutton" type="button" id="loginbtn"
                                        className="btn btn-primary w-25 login-up-btn ml-auto">Edit</button>
                                </div>
                                <div className="card-body">
                                    <div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP ID :</p>
                                            <div className="ml-2">1</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP First Name :</p>
                                            <div className="ml-2">Dhanush</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP Last Name :</p>
                                            <div className="ml-2">Gowda</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP AGE :</p>
                                            <div className="ml-2">28</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP GENDER :</p>
                                            <div className="ml-2">MALE</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP PHONE :</p>
                                            <div className="ml-2">9944556677</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP JOINING DATE :</p>
                                            <div className="ml-2">23/09/1992</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP ACCOUNT NUM :</p>
                                            <div className="ml-2">6677889933</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP DESIGNATION :</p>
                                            <div className="ml-2">Software Engineer</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP DOB :</p>
                                            <div className="ml-2">23/09/1992</div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <div className="card mx-2">
                                <div className="d-flex m-3">
                                    <h2 className="card-title">Employee Educational Info</h2>
                                    <button name="mybutton" type="button" id="loginbtn"
                                        className="btn btn-primary w-25 login-up-btn ml-auto">Edit</button>
                                </div>
                                <div className="card-body">
                                    <div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP ID :</p>
                                            <div className="ml-2">1</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP First Name :</p>
                                            <div className="ml-2">Dhanush</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP Last Name :</p>
                                            <div className="ml-2">Gowda</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP AGE :</p>
                                            <div className="ml-2">28</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP GENDER :</p>
                                            <div className="ml-2">MALE</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP PHONE :</p>
                                            <div className="ml-2">9944556677</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP JOINING DATE :</p>
                                            <div className="ml-2">23/09/1992</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP ACCOUNT NUM :</p>
                                            <div className="ml-2">6677889933</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP DESIGNATION :</p>
                                            <div className="ml-2">Software Engineer</div>
                                        </div>

                                        <div className="d-flex">
                                            <p className="card-text">EMP DOB :</p>
                                            <div className="ml-2">23/09/1992</div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                         ) : (
                            <div>
                                </div>
                         )}
               
                
            </div>
        );
    }
}
