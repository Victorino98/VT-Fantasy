"use strict";

const sqlite3 = require('sqlite3').verbose();
const db = new sqlite3.Database('data/vt-fantasy_db');

module.exports.register = function(request, response){
  console.log('here');
  return;
}
