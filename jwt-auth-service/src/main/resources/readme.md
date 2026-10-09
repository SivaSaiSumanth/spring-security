| Code                        | Purpose                                                              |
| --------------------------- | -------------------------------------------------------------------- |
| `getKey()`                  | Converts the Base64 secret into a cryptographic key.                 |
| `Jwts.builder()`            | Starts creating a JWT.                                               |
| `.subject(username)`        | Stores the username in the `sub` claim.                              |
| `.issuedAt(...)`            | Records when the token was issued.                                   |
| `.expiration(...)`          | Sets the token's expiration time to 15 minutes later.                |
| `.signWith(getKey())`       | Signs the token so unauthorized modifications can be detected.       |
| `.compact()`                | Produces the final JWT string.                                       |
| `Jwts.parser()`             | Starts parsing a JWT.                                                |
| `.verifyWith(getKey())`     | Configures signature verification using the specified key.           |
| `.parseSignedClaims(token)` | Parses the signed claims and validates the signature and expiration. |
| `.getSubject()`             | Returns the username stored in the `sub` claim.                      |
