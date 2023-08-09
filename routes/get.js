"use strict";

const path = require('path');
const url = require('url');
const sqlite3 = require('sqlite3').verbose();
const db = new sqlite3.Database('data/vt-fantasy_db');


module.exports.login = function(request, response){
  response.sendFile(path.resolve(__dirname + "/../views/login.html"));
};
