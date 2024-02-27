Feature: Validating Place APIs

scenario: Verify Place is being added using AddPlace API

Given AddPlace Payload
When user hit "AddPlace" APi with post request
Then API request is hit Successfully with Status Code 200
And "Status" in response body is "OK"