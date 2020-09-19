## Getting JWT

```
curl --location --request POST 'https://[AUTH0_DOMAIN]/oauth/token' \
--header 'Content-Type: application/json' \
--data-raw '{
    "grant_type": "client_credentials",
    "client_id": "{CLIENT_ID_FROM_API}",
    "client_secret": "{CLIENT_SECRET_FROM_API}",
    "audience" : "{IDENTIFIER_FROM_API}"
}'
```
