API Endpoint
=============

This flow takes a Swagger (OpenAPI) contract and exposes it as a RESTful endpoint.  During this process, it splits the incoming JSON array (sent as an HTTP POST) and publishes the message to an asynchronous messaging queue.

![](images/api-endpoint-flow.png "API Endpoint API Flow")
