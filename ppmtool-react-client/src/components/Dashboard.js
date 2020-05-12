import React, { Component } from "react";
import ProjectItem from "./Project/ProjectItem";
import Header from "./Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";

export default class Dashboard extends Component {
  render() {
    return (
      <div>
        <Header />
        <h1 className="alert alert-warning">Welcome to Dashboard</h1>
        <ProjectItem />
        <ProjectItem />
      </div>
    );
  }
}
