import React from "react";
import { TextField } from "@mui/material";
import Footer from "../../Components/Footer/Footer";
import "./Student.css";

const Student = () => {
  return (
    <div className="studentContainer">
      <div className="hero-reg">
        <video
          className="reg-video"
          src="/videos/video-1.mp4"
          autoPlay
          loop
          muted
        />
      </div>

      <div className="form-input">
        <div className="student-info">
          <h3>Student Information</h3>
          <div className="student-input">
            <TextField
              className="stdNo"
              name="studNumber"
              type="text"
              label="Student Number"
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
          </div>
        </div>
      </div>
      <Footer />
    </div>
  );
};

export default Student;
