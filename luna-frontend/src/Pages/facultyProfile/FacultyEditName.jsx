import React from "react";
import { Link } from "react-router-dom";
import { Button, TextField } from "@mui/material";
import Footer from "../../Components/Footer/Footer";
import "./FacultyProfile.css";

const FacultyEditName = () => {
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

      <div className="new-name">
        <div className="input-name">
          <h3>Input New Name</h3>
          <div className="faculty-input">
            <TextField
              className="fName"
              name="firstName"
              type="text"
              label="First Name"
              color="success"
              size="small"
              variant="outlined"
              sx={{
                width: { sm: 200, md: 388 },

                mb: 2,
              }}
              required
            />

            <TextField
              className="mName"
              name="middleName"
              type="text"
              label="Middle Name"
              fullWidth
              variant="outlined"
              color="success"
              size="small"
              sx={{
                width: { sm: 200, md: 388 },

                mb: 2,
              }}
              required
            />

            <TextField
              className="lName"
              name="lastName"
              type="text"
              label="Last Name"
              fullWidth
              color="success"
              size="small"
              variant="outlined"
              sx={{
                width: { sm: 200, md: 388 },

                mb: 2,
              }}
              required
            />

            <Button
              variant="contained"
              component="label"
            >
                Save
            </Button>
          </div>
        </div>
      </div>
      <Footer />
    </div>
  );
};

export default FacultyEditName;