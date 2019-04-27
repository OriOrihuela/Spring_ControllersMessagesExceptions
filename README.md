# Spring_ControllersMessagesExceptions
## This unit is about:
- How to handle the requests that arrive to our web application and redirect them to the appropriate controller.
- Collect parameters and pass them to the method responsible for the request.
- Determine what type of message we should send to the browser: JSON, XML, Body, etc.
### Controllers
- **MVC**: Model View Controller.
- `@Controller` or what is a `controller` to attend requests to our web application, in the url `http://localhost:8080`.
- `@RequestMapping()` and `path` to redirect requests to the method responsible for handling the request.
- `method = RequestMethod.GET` to set the response to **http** requests `GET` and `POST` of the browser.
- `@RequestParam` or how to collect **parameters** sent in the URL by the browser.
- `@PathVariable` to collect **variables** in the URL sent by the browser.
### Messages
- **Formats of messages** accepted by a browser: `html`, `xhtml`, `xml`, etc.
- `REST` services.
- How the message format received by the browser is negotiated.
- `Jackson` library for XML.
- `produces = {MediaType.APPLICATION_XML_VALUE}` to produce XML messages.
- How to control the conversion to `JSON`.
### Exceptions
- From Spring you can also perform error control and exception handling: from the **404** to the **500**, and all spiced up with a bit of HTML.
