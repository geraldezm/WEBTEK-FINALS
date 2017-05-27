var mysql = require('mysql');


var conn = mysql.createConnection({
	host: 'localhost',
	user: 'root',
	password: '',
	database: 'petcare' 
});

conn.connect(function(error){
	if(!!error)
	{
		console.log('error');
	}
	else
	{
		console.log('connected');
	}
})


var express = require('express');
var path = require('path');
var app = express();
var router = express.Router();
var bodyParser = require('body-parser');
var path = require('path');
var fs = require('fs');
var multipart = require('connect-multiparty');
var multipartMiddleware = multipart({ uploadDir: './uploads' });


app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));
app.set('view engine', 'ejs');
app.use('/public', express.static(__dirname + '/public'));

app.use(express.static(__dirname + '/css'));


app.get('/logout', function(req, resp){
	resp.redirect('http://10.10.22.177/AM/splogin.php');
});

app.get('/', function(req, resp){
	resp.redirect('/PettyBoard');
});


app.get('/PettyBoard', function(req, resp){
   

	 var sp_id = '1';
	 var result =   [];
	

    
	 conn.query('SELECT customer_id AS ID, CONCAT(customerFirstName,", ", customerLastName) AS customerName, pet_type, status FROM customer', 
            function(error, rows, fields){
	 		result = rows;
		    resp.render('PettyBoard', {result: result}); 

		      
	 	})
	 		
});

app.get('/servicenotif', function(req, resp){
   

	 var sp_id = '1';
	 var result =   [];
	

    
	 conn.query('SELECT customer_id AS id, CONCAT(customer.customerFirstName,", ",customer.customerLastName) AS customerName, customer.status , servicerequest.servicerequest_id AS reqID, customer.customer_id AS id FROM customer NATURAL JOIN servicerequest where customer_id  = servicerequest.servicereq_customerId;', 
            function(error, rows, fields){
	 		result = rows;
		    resp.render('servicenotif', {result: result});

		      
	 	})
	 		
});

app.get('/services', function(req, resp){
   

	 var sp_id = '1';
	 var result =   [];
	

    
	 conn.query('SELECT servicecategory_id AS ID, services as SERVICE from servicecategory', 
            function(error, rows, fields){
	 		result = rows;
		    resp.render('services', {result: result});  

		      
	 	})
	 		
});

app.get('/accepted', function(req, resp){
	var id = req.query.id;

	conn.query("UPDATE customer SET status='Accepted'  WHERE customer_id='"+id+"'", function(error, rows, fields){
		resp.status(200).send();
	})
});

app.get('/declined', function(req, resp){
	var id = req.query.id;

	conn.query("UPDATE customer SET status='Rejected' WHERE customer_id='"+id+"'", function(error, rows, fields){
		resp.status(200).send();
	})

});


app.get('/servicenotif', function(req, resp){


	var id = req.query.id;
	console.log(id);

	conn.query("UPDATE customer SET status='Accepted' WHERE customer_id='"+id+"'", function(error, rows, fields){
		resp.status(200).send();
		resp.redirect('/servicenotif');
	});

});

app.listen('1111', function(){
	console.log('Server start at port: 1111');
}); 