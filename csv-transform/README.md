Convert a JSON record into CSV
=============

This flow accepts a JSON message from an asynchronous messaging queue and converts it into a CSV message.

<p align="center">
  <img src="images/convert-csv-flow.png"/>
</p>

### Structure of JSON message (lead)

The `lead` JSON record is structured as follows:

```json
{
		"first_name": "Simon",
		"last_name": "Green",
		"company": "Red Hat",
		"source": "Partner Referral",
		"phone": "(212) 333-1234",
		"email": "sigreen@redhat.com",
		"status": "Closed Converted",
		"rating": "Warm"
	}
```

### Testing the flow

To test this flow, you can use the following curl statement:

```
curl --header "Content-Type: application/json" --data '[{"lead":{"first_name":"Simon","last_name":"Green","company":"Red Hat","source":"Partner Referral","phone":"(212) 333-1234","email":"sigreen@redhat.com","status":"Closed Converted","rating":"Warm"}},{"lead":{"first_name":"Josh","last_name":"Reagan","company":"Red Hat","source":"Partner Referral","phone":"(212) 333-9999","email":"jreagan@redhat.com","status":"Closed Converted","rating":"Cold"}}]' http://i-leads-api.fuse-66c3b847-5d25-11e9-ad61-0a580a010007.svc:8080/leads -X POST
```
