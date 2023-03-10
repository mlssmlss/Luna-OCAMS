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
import Admin from "./Pages/admin/Admin";
import FacultyProfile from "./Pages/facultyProfile/FacultyProfile";
import FacultyEditName from "./Pages/facultyProfile/FacultyEditName";
import FacultyPassword from "./Pages/facultyProfile/FacultyPassword";

function App() {
  return (
    <Fragment>
      <Router>
        <Navbar />
        <Routes>
          <Route path="/" exact element={<Home />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/admin" element={<Admin />} />
          <Route path="/student" element={<Student />} />
          <Route path="/parent" element={<Parent />} />
          <Route path="/courses" element={<Course />} />
          <Route path="/faculty" element={<Faculty />} />
          <Route path="/facultyProfile" element={<FacultyProfile />} />
          <Route path="/facultyEditName" element={<FacultyEditName />} />
          <Route path="/facultyPassword" element={<FacultyPassword />} />
        </Routes>
      </Router>
    </Fragment>
  );
}

export default App;
