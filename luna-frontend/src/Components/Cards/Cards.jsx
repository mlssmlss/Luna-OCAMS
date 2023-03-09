import React from "react";
import CardItem from "./CardItem";
import "./Cards.css";

function Cards() {
  return (
    <div className="cards">
      <h1>Check out our COURSES offered!</h1>
      <div className="cards__container">
        <div className="cards__wrapper">
          <ul className="cards__items">
            <CardItem
              src="images/computerScience.jpg"
              text="Computer Science gfgfgfgfgvhfghfghgfhgfhgfjghjhgjghjghjhg"
              label="Courses"
              path="/services"
            />
            <CardItem
              src="images/physicalEducation.jpg"
              text="Physical Education gfgfgfgfgvhfghfghgfhgfhgfjghjhgjghjghjhg"
              label="Courses"
              path="/services"
            />
          </ul>
          <ul className="cards__items">
            <CardItem
              src="images/generalMathematics.jpg"
              text="General Mathematics gfgfgfgfgvhfghfghgfhgfhgfjghjhgjghjghjhg"
              label="Courses"
              path="/services"
            />
            <CardItem
              src="images/physics.jpg"
              text="Physics gfgfgfgfgvhfghfghgfhgfhgfjghjhgjghjghjhg"
              label="Courses"
              path="/services"
            />
            <CardItem
              src="images/biology.jpg"
              text="Biology gfgfgfgfgvhfghfghgfhgfhgfjghjhgjghjghjhg"
              label="Courses"
              path="/sign-up"
            />
          </ul>
        </div>
      </div>
    </div>
  );
}

export default Cards;
