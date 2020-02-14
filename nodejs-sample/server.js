const express = require('express');
const app = express();

app.get('/api/v1/messages', (req, res) => {
  res.send('Hello BCX!');
});

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}...`);
});