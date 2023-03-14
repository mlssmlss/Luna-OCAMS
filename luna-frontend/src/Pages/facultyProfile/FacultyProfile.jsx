import React from "react";
import { Link } from "react-router-dom";
import Footer from "../../Components/Footer/Footer";
import "./FacultyProfile.css";

const FacultyProfile = () => {
  return (
    <div className="facultyContainer">
      <div className="hero-reg">
        <video
          className="reg-video"
          src="/videos/video-3.mp4"
          autoPlay
          loop
          muted
        />
      </div>

      <div className="profile">
        <ul className="sidebar">
            <h4>Name:</h4>
            <h4>ID:</h4>
            <h4>Birthday:</h4>
            <h4>Gender:</h4>
            <h4>Status:</h4>
            <h4>Home Address:</h4>
            <h4>No. of Courses:</h4>
            <div className="edit-name">
                <Link 
                    to="/facultyEditName"
                    style={{
                        color: "black",
                    }}>Edit Name
                </Link>
            </div>
            <div className="edit-password">
                <Link 
                    to="/facultyPassword"
                    style={{
                        color: "black",
                    }}>Change Password
                </Link>
            </div>
        </ul>
      </div>
      <Footer />
    </div>
  );
};

export default FacultyProfile;