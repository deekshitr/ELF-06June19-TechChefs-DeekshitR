import React from 'react';
import logo from './logo.svg';
import './App.css';


class Footer extends React.Component{

  render() {
    return (
        <footer className="page-footer font-small blue bg-light">
        <div className="footer-copyright text-center py-3">© 2018 Copyright:
          <a href="https://mdbootstrap.com/education/bootstrap/"> MDBootstrap.com</a>
        </div>    
      </footer>
    );
  }
  
}

export default Footer;