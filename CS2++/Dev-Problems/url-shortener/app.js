/* eslint-disable import/order */
const fs = require('fs');
const tools = require('./tools');
const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const port = 4567;

// Use bodyparser to format the content sent from the HTML form post request
app.use(bodyParser.urlencoded({
  extended: true,
}));

// Use express to serve up the homepage
app.get('/', (req, res) => {
  res.sendFile(`${__dirname}/index.html`);
});

// Use express to serve up the 404 page
app.get('/404', (req, res) => {
  res.sendFile(`${__dirname}/404.html`);
});

app.get('/*', (req, res) => {
  const fileString = fs.readFileSync('link.txt', {encoding: 'utf8', flag: 'r'});

  // Initial test with only first line
  const firstLine = JSON.parse(fileString.split(',{')[0]);
  const enteredURL = `http://localhost:4567${req.originalUrl}`;

  // If we find a match in the link.txt file we redirect to the original url, otherwise we go to the 404 page
  if (enteredURL === firstLine.newURL) {
    res.redirect(firstLine.originalUrl);
  } else {
    res.redirect('/404');
  }
});

// Use express to handle the post request and save the url to the link.txt file
app.post('/link', (req, res) => {
  req.body.newURL = `http://localhost:4567/${tools.makeid(5)}`;
  const data = JSON.stringify(req.body);

  // Add the data to the txt file
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
