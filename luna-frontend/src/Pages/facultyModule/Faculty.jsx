import React from "react";
import { Link } from "react-router-dom";
import Footer from "../../Components/Footer/Footer";
import "./Faculty.css";

const Faculty = () => {
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

      <div className="dashboard">
        <ul className="sidebar">
          <div className="faculty-profile">
            <Link 
                to="/facultyProfile"
                style={{
                    color: "black",
                }}>View Profile
            </Link>
          </div>
          <div className="assign-courses">
            <Link 
                to="/students"
                style={{
                    color: "black",
                }}>Assign Courses
            </Link>
          </div>
          <div className="create-evaluation">
            <Link 
                to="/students"
                style={{
                    color: "black",
                }}>Create Evaluation Sheet
            </Link>
          </div>
        </ul>
      </div>
      <Footer />
    </div>
  );
};

export default Faculty;