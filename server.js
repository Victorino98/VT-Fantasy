"use strict";

const http = require('http');
const express = require('express');
const postRoutes = require('./routes/post');
const getRoutes = require('./routes/get');

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(express.static(__dirname + '/public'));

// Routes

// GET Methods
app.get(['/', '/login'], getRoutes.login);

// POST Methods
app.get('/register', postRoutes.register);

// Start Server
app.listen(PORT, err => {
  if (err){
    console.log(err);
  }
  else {
    console.log(`Server listening on port: ${PORT} CNTL:-C to stop`);
  }
});
