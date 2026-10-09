Check these three steps
1. Login and generate a token

Send POST http://localhost:8080/api/auth/login

Body → raw → JSON:

{
"username": "sumanth",
"password": "user123"
}

Expected: 200 OK with a response similar to:

{
"accessToken": "eyJhbGciOiJIUzI1NiJ9...",
"tokenType": "Bearer"
}
2. Pass the token to the protected API

Send GET http://localhost:8080/api/protected

In Postman:

Open Authorization.

Select Bearer Token.

Paste the accessToken value from Step 1 (without quotation marks).

Send the request.

Expected: 200 OK.

3. If it still returns 401

Check that you're using the token from the latest successful login and that it hasn't expired. Our token currently expires after 15 minutes.

Also, make sure your JwtService and JwtDecoder use the same signing key and algorithm.