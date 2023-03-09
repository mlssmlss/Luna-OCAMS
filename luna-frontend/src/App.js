import "./App.css";
import Navbar from "./Components/IntroNavbar/Navbar";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { Fragment } from "react";
import Home from "./Pages/Home/Home";
import { Login } from "./Pages/login/Login";
import Register from "./Pages/register/Register";
import Student from "./Pages/studentModule/Student";
import Parent from "./Pages/parentalModule/Parent";
import Course from "./Pages/courseModule/Course";
import Faculty from "./Pages/facultyModule/Faculty";

function App() {
  return (
    <Fragment>
      <Router>
        <Navbar />
        <Routes>
          <Route path="/" exact element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/student" element={<Student />} />
          <Route path="/parent" element={<Parent />} />
          <Route path="/courses" element={<Course />} />
          <Route path="/faculty" element={<Faculty />} />
        </Routes>
      </Router>
    </Fragment>
  );
}

export default App;
