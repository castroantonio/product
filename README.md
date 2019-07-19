# product
REST application using SpringBoot.

Available at: https://product-springboot.herokuapp.com/

This simple project was made in Java using SpringBoot, Eclipse IDE and Spring Tools 4 (aka Spring Tools Suite). The main purpose is to test the advantages of using SpringBoot, and integration with PostgreSQL.

It is consists on a REST service that can be used to create, retrive, delete and list all products (Product.java), this way:

 - create:
 
 URL: https://product-springboot.herokuapp.com/product
 
 method: POST
 
 request body: JSON containing product name and value, for example: {"name": "Gold", "value": 15000.00}
 
 returns: JSON containing product id, name and value, for example: {"id": 1, "name": "Gold", "value": 15000.00} with status CREATED (HTTP: 201).
 
 
 
 - retrive:
 
URL: https://product-springboot.herokuapp.com/product/{id}
 
 method: GET
 
 request body: N/A
 
 returns: JSON containing user id, name and value, for example: {"id": 1, "name": "Gold", "value": 15000.00} with status OK; or NOT FOUND.
 
 
 
 - update:
 
 URL: https://product-springboot.herokuapp.com/product
 
 method: PUT
 
 request body: JSON containing user id, new name and new value, for example: {"id": 1, "name": "Silver", "value": 1000.00}
 
 returns: JSON containing user id and name, for example: {"id": 1, "name": "Silver", "value": 1000.00} with status OK; or NOT FOUND.
 
 

 - delete:
 
 URL: https://product-springboot.herokuapp.com/product/{id}
 
 method: DELETE
 
 request body: N/A
 
 returns: OK or NOT FOUND.
 
 
  
 - list all:
 
 URL: https://product-springboot.herokuapp.com/product
 
 method: GET
 
 request body: N/A
 
 returns: JSON containing user array, for example: [{"id": 1, "name": "Gold", "value": 15000.00}, {"id": 1, "name": "Silver", "value": 1000.00}] with status OK.
