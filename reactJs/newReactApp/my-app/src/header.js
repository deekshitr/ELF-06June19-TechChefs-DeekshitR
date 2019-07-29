import React from 'react';
import logo from './logo.svg';
import './App.css';


class Header extends React.Component{

  render() {
    return (
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
        <ul class="navbar-nav">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact Us</a>
          </li>
        </ul>
    
        <form class="form-inline ml-4" action="/action_page.php">
          <input class="form-control mr-sm-2" type="text" placeholder="Search" />
          <button class="btn btn-success" type="submit">Search</button>
        </form>
        
        <div  class="ml-auto text-white">
          <a href="#">Logout</a>
        </div>
        
      </nav>
    );
  }
  
}

export default Header;
