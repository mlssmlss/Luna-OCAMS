import { TextField, InputBase, makeStyles } from "@mui/material";
import React from "react";
import Footer from "../../Components/Footer/Footer";
import "./Login.css";

export const Login = () => {
  return (
    <div className="loginContainer">
      <div className="hero-login">
        <video
          className="login-video"
          src="/videos/video-1.mp4"
          autoPlay
          loop
          muted
        />

        <form>
          <div className="login">
            <h1>WELCOME!</h1>
            <div className="login-input">
              <InputBase
                className="userName"
                name="username"
                type="text"
                placeholder="Enter username"
                size="small"
                variant="outlined"
                fullWidth
                sx={{
                  color: "white",
                  height: "6vh",
                  padding: "15px",
                  border: "1px solid white",
                  borderRadius: "0.5em",
                  mb: 2,
                }}
                required
              />

              <InputBase
                className="pWord"
                name="password"
                type="password"
                placeholder="Enter Password"
                size="small"
                variant="outlined"
                color="success"
                fullWidth
                sx={{
                  color: "white",
                  height: "6vh",
                  padding: "15px",
                  border: "1px solid white",
                  borderRadius: "0.5em",
                  mb: 2,
                }}
                required
              />
              <div className="forgot-pass">
                <a href="#">Forgot Password?</a>
              </div>
              <button type="submit" class="btn btn-primary">
                SIGN IN
              </button>
            </div>
          </div>
        </form>
      </div>
      <Footer />
    </div>
  );
};
