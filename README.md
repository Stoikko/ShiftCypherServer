## Shift Cypher Encoder

This is a basic spring-boot app that will spin up a small webserver exposed on port 23456.

The available endpoint is /api/encode accepting post requests with JSON bodies.

The request body should be structured as follows:

```
{
    "Shift": 2,
    "Message": "message here"
}

```

The body should include a shift integer, and a message string.
The request will return a json with the encoded message response. 
It will also save a file with the encoded message to the local root directory of the .jar file. 
It will require proper permissions to do to.

To run:

This project requires java 8 installed on the host machine.

```
$ java -jar spring-boot-restful.jar
```

