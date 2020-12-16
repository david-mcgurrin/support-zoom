/* eslint-disable import/order */
const fs = require('fs');
const tools = require('./tools');
const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const port = 4567;

app.use(bodyParser.urlencoded({
  extended: true,
}));

app.get('/', (req, res) => {
  res.sendFile(`${__dirname}/index.html`);
});

app.get('/404', (req, res) => {
  res.sendFile(`${__dirname}/404.html`);
});

app.get('/*', (req, res) => {
  const fileString = fs.readFileSync('link.txt', {encoding: 'utf8', flag: 'r'});

  // Initial test with only first line
  const firstLine = JSON.parse(fileString.split(',{')[0]);
  const enteredURL = `http://localhost:4567${req.originalUrl}`;

  if (enteredURL === firstLine.newURL) {
    res.redirect(firstLine.originalUrl);
  } else {
    res.redirect('/404');
  }
});

app.post('/link', (req, res) => {
  req.body.newURL = `http://localhost:4567/${tools.makeid(5)}`;
  const data = JSON.stringify(req.body);

  fs.appendFile('link.txt', `${data},`, (err) => {
    if (err) {
      throw err;
    }
    console.log('Data is saved.');
    res.redirect('/');
  });
});

app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});
