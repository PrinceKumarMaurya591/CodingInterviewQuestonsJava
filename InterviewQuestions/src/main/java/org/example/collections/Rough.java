import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { TextField, MenuItem, Button, Container, Grid, Typography, Box } from '@mui/material';

function UserCreationForm() {
  const [formData, setFormData] = useState({
    firstName: '',
    middleName: '',
    lastName: '',
    employeeId: '',
    emailId: '',
    mobileNo: '',
    designation: '',
    department: '',
    segment: '',
    region: '',
    branchCode: '',
    opsLocation: '',
    reportingManagerName: '',
    reportingManagerEmployeeId: '',
    reviewerManagerName: '',
    reviewerManagerEmployeeId: '',
    userRole: '',
  });

  const [departments, setDepartments] = useState([]);
  const [segments] = useState(['Agri', 'BB']);
  const [regions, setRegions] = useState([]);
  const [branchCodes, setBranchCodes] = useState([]);
  const [opsLocations, setOpsLocations] = useState([]);
  const [userRoles] = useState([
    'RM', 'CBM', 'RBM', 'HOB', 'CM', 'CCM', 'RCM', 'NCM', 'CCT', 'LegalManager', 'RPC-Maker', 'RPC-Checker', 'CPC-Maker', 'CPC-Checker'
  ]);

  useEffect(() => {
    // Fetch departments from API
    axios.get('API_ENDPOINT_FOR_DEPARTMENTS')
      .then(response => setDepartments(response.data))
      .catch(error => console.error('Error fetching departments:', error));

    // Fetch regions from API
    axios.get('API_ENDPOINT_FOR_REGIONS')
      .then(response => setRegions(response.data))
      .catch(error => console.error('Error fetching regions:', error));

    // Fetch branch codes from API
    axios.get('API_ENDPOINT_FOR_BRANCH_CODES')
      .then(response => setBranchCodes(response.data))
      .catch(error => console.error('Error fetching branch codes:', error));

    // Fetch OPS locations from API
    axios.get('API_ENDPOINT_FOR_OPS_LOCATIONS')
      .then(response => setOpsLocations(response.data))
      .catch(error => console.error('Error fetching OPS locations:', error));
  }, []);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log('Form data submitted:', formData);
    // Submit form data to backend API
  };

  return (
    <Container maxWidth="md">
      <Box mt={5} mb={5}>
        <Typography variant="h4" component="h1" gutterBottom>
          User Creation Form
        </Typography>
        <form onSubmit={handleSubmit}>
          <Grid container spacing={2}>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="First Name"
                name="firstName"
                value={formData.firstName}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Middle Name"
                name="middleName"
                value={formData.middleName}
                onChange={handleChange}
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Last Name"
                name="lastName"
                value={formData.lastName}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Employee ID"
                type="number"
                name="employeeId"
                value={formData.employeeId}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Email ID"
                type="email"
                name="emailId"
                value={formData.emailId}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Mobile No."
                type="number"
                name="mobileNo"
                value={formData.mobileNo}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Designation"
                name="designation"
                value={formData.designation}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                select
                fullWidth
                label="Department"
                name="department"
                value={formData.department}
                onChange={handleChange}
                required
              >
                <MenuItem value=""><em>Select Department</em></MenuItem>
                {departments.map((dept) => (
                  <MenuItem key={dept} value={dept}>{dept}</MenuItem>
                ))}
              </TextField>
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                select
                fullWidth
                label="Segment"
                name="segment"
                value={formData.segment}
                onChange={handleChange}
                required
              >
                <MenuItem value=""><em>Select Segment</em></MenuItem>
                {segments.map((seg) => (
                  <MenuItem key={seg} value={seg}>{seg}</MenuItem>
                ))}
              </TextField>
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                select
                fullWidth
                label="Region"
                name="region"
                value={formData.region}
                onChange={handleChange}
                required
              >
                <MenuItem value=""><em>Select Region</em></MenuItem>
                {regions.map((region) => (
                  <MenuItem key={region} value={region}>{region}</MenuItem>
                ))}
              </TextField>
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                select
                fullWidth
                label="Branch Code"
                name="branchCode"
                value={formData.branchCode}
                onChange={handleChange}
                required
              >
                <MenuItem value=""><em>Select Branch Code</em></MenuItem>
                {branchCodes.map((code) => (
                  <MenuItem key={code} value={code}>{code}</MenuItem>
                ))}
              </TextField>
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                select
                fullWidth
                label="OPS-Location"
                name="opsLocation"
                value={formData.opsLocation}
                onChange={handleChange}
                required
              >
                <MenuItem value=""><em>Select OPS-Location</em></MenuItem>
                {opsLocations.map((location) => (
                  <MenuItem key={location} value={location}>{location}</MenuItem>
                ))}
              </TextField>
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Reporting Manager Name"
                name="reportingManagerName"
                value={formData.reportingManagerName}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Reporting Manager Employee ID"
                type="number"
                name="reportingManagerEmployeeId"
                value={formData.reportingManagerEmployeeId}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Reviewer Manager Name"
                name="reviewerManagerName"
                value={formData.reviewerManagerName}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                fullWidth
                label="Reviewer Manager Emp. ID"
                type="number"
                name="reviewerManagerEmployeeId"
                value={formData.reviewerManagerEmployeeId}
                onChange={handleChange}
                required
              />
            </Grid>
            <Grid item xs={12} sm={6}>
              <TextField
                select
                fullWidth
                label="User Roles"
                name="userRole"
                value={formData.userRole}
                onChange={handleChange}
                required
              >
                <MenuItem value=""><em>Select User Role</em></MenuItem>
                {userRoles.map((role) => (
                  <MenuItem key={role} value={role}>{role}</MenuItem>
                ))}
              </TextField>
            </Grid>
            <Grid item xs={12}>
              <Button type="submit" variant="contained" color="primary" fullWidth>
                Submit
              </Button>
            </Grid>
          </Grid>
        </form>
      </Box>
    </Container>
  );
}

export default UserCreationForm;
