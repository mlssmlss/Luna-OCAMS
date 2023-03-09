import React from "react";
import Footer from "../../Components/Footer/Footer";
import "./Register.css";
import { TextField } from "@mui/material";

const Register = () => {
  return (
    <div className="register-container">
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
        <div className="givenName">
          <TextField
            name="givenName"
            type="text"
            label="First Name"
            color="success"
            size="small"
            variant="outlined"
            sx={{
              width: { sm: 100, md: 190 },

              mb: 2,
            }}
            required
          />
        </div>

        <div className="surName">
          <TextField
            name="surname"
            color="success"
            size="small"
            variant="outlined"
            type="text"
            label="Last Name"
            sx={{
              width: { sm: 100, md: 190 },

              mb: 2,
            }}
            required
          />
        </div>

        <div className="uNamePhoneContainer">
          <div className="userName">
            <TextField
              name="username"
              type="text"
              label="username"
              color="success"
              size="small"
              variant="outlined"
              sx={{
                width: { sm: 100, md: 190 },

                mb: 2,
              }}
              required
            />
          </div>

          <div className="phone">
            <TextField
              name="phoneNumber"
              type="text"
              label="Phone Number(+63)"
              color="success"
              size="small"
              variant="outlined"
              sx={{
                width: { sm: 100, md: 190 },

                mb: 2,
              }}
            />
          </div>
        </div>

        <div>
          <TextField
            name="email"
            type="text"
            label="Email"
            fullWidth
            variant="outlined"
            color="success"
            size="small"
            sx={{
              width: { sm: 200, md: 388 },

              mb: 2,
            }}
            InputLabelProps={{ style: { fontSize: 15 } }}
            required
          />
        </div>

        <div className="brgyCityContainer">
          <div className="brgy">
            <TextField
              name="brgy"
              type="text"
              label="Brgy"
              fullWidth
              color="success"
              size="small"
              variant="outlined"
              sx={{
                width: { sm: 100, md: 190 },

                mb: 2,
              }}
              required
            />
          </div>

          <div className="city">
            <TextField
              name="city"
              type="text"
              label="City"
              color="success"
              size="small"
              variant="outlined"
              sx={{
                width: { sm: 100, md: 190 },

                mb: 2,
              }}
              required
            />
          </div>
        </div>

        <div className="provinceBDateContainer">
          <div className="province">
            <TextField
              name="province"
              type="text"
              label="Province"
              color="success"
              size="small"
              variant="outlined"
              sx={{
                width: { sm: 100, md: 190 },

                mb: 2,
              }}
              required
            />
          </div>

          <div className="bDateContainer">
            <div className="bDateInput">
              <TextField
                name="dot"
                type="date"
                label="Birthdate"
                color="success"
                size="small"
                variant="outlined"
                sx={{
                  width: { sm: 100, md: 190 },

                  mb: 2,
                }}
                required
              />
            </div>
          </div>
        </div>
      </div>
      <Footer />
    </div>
  );
};

export default Register;
