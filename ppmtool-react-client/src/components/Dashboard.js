import React, { Component } from "react";
import ProjectItem from "./Project/ProjectItem";
import Header from "./Layout/Header";

export default class Dashboard extends Component {
  render() {
    return (
      <div>
        <Header />
        <h1>Welcome to Dashboard</h1>
        <ProjectItem />
        <ProjectItem />
      </div>
    );
  }
}
