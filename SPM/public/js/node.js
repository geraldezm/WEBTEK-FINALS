const http = require('http');
const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((request, respond) =>{
    respond.statusCode = 200;
    respond.setHeader('Content-Type', 'text/plain');
    respond.end('Hello World\n');
    
});

server.listen(port, hostname, () => {
    console.log('Server running at http://${hostname}:${port}/');
});
