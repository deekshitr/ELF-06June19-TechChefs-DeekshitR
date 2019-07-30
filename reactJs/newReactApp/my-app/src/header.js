import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Navbar, Nav, NavDropdown } from 'react-bootstrap';
import { Form, FormControl } from 'react-bootstrap';
import { Button } from 'react-bootstrap';

class Header extends React.Component {

  render() {
    return (
      <Navbar fixed="top" bg="dark" variant="dark">
        <Navbar.Brand href="#home">Demo</Navbar.Brand>
        <Nav className="mr-auto">
          <Nav.Link href="#home">Home</Nav.Link>
          <Nav.Link href="#features">About</Nav.Link>
          <Nav.Link href="#pricing">Contact Us</Nav.Link>
        </Nav>
        <Form inline>
          <FormControl type="text" placeholder="Search" className="mr-sm-2" />
          <Button variant="outline-info">Search</Button>
        </Form>
        <Nav className="ml-auto">
          <Nav.Link href="#home">Logout</Nav.Link>
        </Nav>
      </Navbar>
    );
  }

}

export default Header;
