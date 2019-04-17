Lead SOAP Client
=============

This flow accepts a JSON JMS message from a queue and forwards it to a remote SOAP service.

### Structure of XML message (lead)

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

### Deploying the SOAP client

Login to codeready workspaces and via the terminal, run the following commands:

```
oc login <blah>
oc new-app s2i-fuse71-spring-boot-camel -p GIT_REPO=https://github.com/sigreen/contract-first-sfdc-integration -p CONTEXT_DIR=/forward-soap -p APP_NAME=soap-client -p GIT_REF=master -n <your Fuse Online namespace>

```
