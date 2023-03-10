import React from "react";
import { TextField } from "@mui/material";

const Student = () => {
  return (
    <div className="form-input">
      <div className="studentNumber">
        <TextField
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
      </div>

      <div className="studentProgram">
        <TextField
          name="program"
          color="success"
          size="small"
          variant="outlined"
          type="text"
          label="Program"
          sx={{
            width: { sm: 200, md: 388 },

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
            label="Password"
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

        <div className="phone">
          <TextField
            name="phoneNumber"
            type="text"
            label="First Name"
            color="success"
            size="small"
            variant="outlined"
            sx={{
              width: { sm: 200, md: 388 },

              mb: 2,
            }}
          />
        </div>
      </div>

      <div>
        <TextField
          name="email"
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
          InputLabelProps={{ style: { fontSize: 15 } }}
          required
        />
      </div>

      <div className="brgyCityContainer">
        <div className="brgy">
          <TextField
            name="brgy"
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
                width: { sm: 200, md: 388 },

                mb: 2,
              }}
              required
            />
          </div>
        </div>

        <div className="city">
          <TextField
            name="city"
            type="text"
            label="Semester"
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

      <div className="provinceBDateContainer">
        <div className="province">
          <TextField
            name="province"
            type="text"
            label="Year Level"
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
      <div className="provinceBDateContainer">
        <div className="province">
          <TextField
            name="province"
            type="text"
            label="Academic Level"
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
      <div className="provinceBDateContainer">
        <div className="province">
          <TextField
            name="province"
            type="text"
            label="Status"
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
      <div className="provinceBDateContainer">
        <div className="province">
          <TextField
            name="province"
            type="text"
            label="Subject"
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
      <div className="provinceBDateContainer">
        <div className="province">
          <TextField
            name="province"
            type="text"
            label="Grades"
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
  );
};

export default Student;
