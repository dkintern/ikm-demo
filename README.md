# ikm-demo

Interview demo project for IKM

This is a Spring web MVC module for interview demo.
This project expose an endpoint to create a coupon.
The endpoint has validations, 
  - coupon_code cannot be empty
  - expiration_date should be a future date
  - discount_amount should be within 1 to 100

the endpoint will return Http 201 when the validation pass otherwise return 400

open-api doc at : http://localhost:7890/v3/api-docs

doc ui at : http://localhost:7890/swagger-ui/index.html