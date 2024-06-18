import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { TextField, MenuItem, Button, Container, Grid, Typography, Box, FormControl, InputLabel, Select, OutlinedInput, Chip, Checkbox, ListItemText } from '@mui/material';
import { ToastContainer, toast } from 'react-toastify';

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
    opsLocation: [],
    reportingManagerName: '',
    reportingManagerEmployeeId: '',
    reviewerManagerName: '',
    reviewerManagerEmployeeId: '',
    userRole: '',
    Status1: 1,
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
    axios.get('http://localhost:8080/credpro/role-master/abc/api/getDepartments')
      .then(response => setDepartments(response.data))
      .catch(error => console.error('Error fetching departments:', error));

    axios.get('http://localhost:8080/credpro/role-master/abc/api/getRegions')
      .then(response => setRegions(response.data))
      .catch(error => console.error('Error fetching regions:', error));

    axios.get('http://localhost:8080/credpro/role-master/abc/api/getBranches')
      .then(response => setBranchCodes(response.data))
      .catch(error => console.error('Error fetching branch codes:', error));

    axios.get('http://localhost:8080/credpro/role-master/abc/api/getLocations')
      .then(response => setOpsLocations(response.data))
      .catch(error => console.error('Error fetching OPS locations:', error));
  }, []);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleOpsLocationChange = (event) => {
    const { target: { value } } = event;
    setFormData({
      ...formData,
      opsLocation: typeof value === 'string' ? value.split(',') : value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const selectedOpsLocationCodes = formData.opsLocation.map(locationID => {
      const location = opsLocations.find(loc => loc.ID === locationID);
      return location ? location.ID : null;
    }).filter(id => id !== null);

    const payload = {
      ...formData,
      opsLocation: selectedOpsLocationCodes,
    };

    console.log('Form data submitted:', payload);
    axios.post('http://localhost:8080/credpro/role-master/abc/api/saveUserDetails', payload)
      .then(response => {
        console.log('Form data submitted successfully:', response);
        toast.success('Form data submitted successfully!', { position: "bottom-center" });
      })
      .catch(error => {
        console.error('Error submitting form data:', error);
        toast.error('Error submitting form data!', { position: "bottom-center" });
      });
  };

  return (
    <>
      <ToastContainer />
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
                    <MenuItem key={dept.ID} value={dept.Name}>{dept.Name}</MenuItem>
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
                    <MenuItem key={region.Regn_ID} value={region.RegionName}>{region.RegionName}</MenuItem>
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
                    <MenuItem key={code.ID} value={code.ID}>{code.Name}</MenuItem>
                  ))}
                </TextField>
              </Grid>
              <Grid item xs={12} sm={6}>
                <FormControl fullWidth>
                  <InputLabel>OPS-Location</InputLabel>
                  <Select
                    multiple
                    value={formData.opsLocation}
                    onChange={handleOpsLocationChange}
                    input={<OutlinedInput label="OPS-Location" />}
                    renderValue={(selected) => (
                      <Box sx={{ display: 'flex', flexWrap: 'wrap', gap: 0.5 }}>
                        {selected.map((value) => {
                          const location = opsLocations.find(loc => loc.ID === value);
                          return <Chip key={value} label={location ? location.Name : value} />;
                        })}
                      </Box>
                    )}
                  >
                    {opsLocations.map((location) => (
                      <MenuItem key={location.ID} value={location.ID}>
                        <Checkbox checked={formData.opsLocation.indexOf(location.ID) > -1} />
                        <ListItemText primary={location.Name} />
                      </MenuItem>
                    ))}
                  </Select>
                </FormControl>
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
    </>
  );
}

export default UserCreationForm;
