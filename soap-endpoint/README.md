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

### Testing the flow

To test this flow, you can reference the WSL here: `http://<routeName>/ws/lead?wsdl`.
