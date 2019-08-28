/*
var http = require('http');
var fs = require('fs');

var server = http.createServer(function(request, response){

    console.log(request.url);

    //  http://localhost:8000/index
        if((request.url == '/index')){
            fs.readFile('index.html', function(error, data){
              
                response.write(data);
                response.end(' -- mesaj bitti');

            });
        }

        //  http://localhost:8000/login
        if((request.url == '/login')){
            fs.readFile('login.html', function(error, data){
              
                response.write(data);
                response.end(' -- mesaj bitti');

            });      
            
         }
    
});

server.listen(8000);
*/

var express = require('express')
var app = express()
 
app.get('/', function (req, res) {
  res.send('Hello World')
})
 
app.listen(3000)