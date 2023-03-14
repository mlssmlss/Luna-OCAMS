import React from "react";
import { Link } from "react-router-dom";
import { Button, TextField } from "@mui/material";
import Footer from "../../Components/Footer/Footer";
import "./FacultyProfile.css";

const FacultyPassword = () => {
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

      <div className="new-password">
        <div className="input-password">
          <h3>Current Password</h3>
          <div className="current-password">
            <TextField
              className="currPassword"
              name="currentPassword"
              type="password"
              label="Current Password"
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
          <h3>Enter New Password</h3>
          <div className="new-password">
            <TextField
              className="nPassword"
              name="newPassword"
              type="password"
              label="New Password"
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
          <h3>Confirm New Password</h3>
          <div className="confirm-password">
            <TextField
              className="conPassword"
              name="confirmPassword"
              type="password"
              label="Confirm Password"
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
          <Button
              variant="contained"
              component="label"
            >
                Save
          </Button>
        </div>
      </div>
      <Footer />
    </div>
  );
};

export default FacultyPassword;