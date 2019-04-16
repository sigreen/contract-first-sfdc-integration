Lead SOAP Endpoint
=============

This flow accepts a lead XML record via SOAP.

### Structure of XML message (lead)

The `lead` JSON record is structured as follows:

```xml
      <red:lead>
         <!--Optional:-->
         <company>Red Hat</company>
         <!--Optional:-->
         <email>sigreen@redhat.com</email>
         <!--Optional:-->
         <first_name>Simon</first_name>
         <!--Optional:-->
         <last_name>Green</last_name>
         <!--Optional:-->
         <phone>6467053819</phone>
         <!--Optional:-->
         <rating>Hot</rating>
         <!--Optional:-->
         <source>Web</source>
         <!--Optional:-->
         <status>Hot</status>
      </red:lead>
```

### Deploying the SOAP server

Login to codeready workspaces and via the terminal, run the following commands:

```
oc login <blah>
oc new-app s2i-fuse71-spring-boot-camel -p GIT_REPO=https://github.com/sigreen/contract-first-sfdc-integration -p CONTEXT_DIR=/soap-endpoint -p APP_NAME=soap-endpoint -p GIT_REF=master -n <your Fuse Online namespace>

```

### Testing the flow

To test this flow, you can reference the WSL here: `http://<routeName>/ws/lead?wsdl`.
