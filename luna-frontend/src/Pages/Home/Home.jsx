import { React, Fragment } from "react";
import "../../App.css";
import Cards from "../../Components/Cards/Cards";
import Footer from "../../Components/Footer/Footer";
import HeroSection from "../../Components/heroSection/HeroSection";

function Home() {
  return (
    <Fragment>
      <HeroSection />
      <Cards />
      <Footer />
    </Fragment>
  );
}

export default Home;
