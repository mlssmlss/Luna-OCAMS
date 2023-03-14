import React from "react";
import "../../App.css";
import { Button } from "../Button/Button";
import { ButtonRegister } from "../Button/ButtonRegister";
import "./HeroSection.css";

function HeroSection() {
  return (
    <div className="hero-container">
      <video src="/videos/video-3.mp4" autoPlay loop muted />
      <h1>ENROLL NOW!</h1>
      <p>What are you waiting for?</p>
      <div className="hero-btns">
        <Button
          className="btns"
          buttonStyle="btn--outline"
          buttonSize="btn--large"
        >
          GET STARTED
        </Button>
        <ButtonRegister
          className="btns"
          buttonStyle="btn--primary"
          buttonSize="btn--large"
        >
          REGISTER NOW <i className="far fa-play-circle" />
        </ButtonRegister>
      </div>
    </div>
  );
}

export default HeroSection;
