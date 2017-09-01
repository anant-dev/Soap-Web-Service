<%-- 
    Document   : index
    Created on : Sep 1, 2017, 12:05:16 PM
    Author     : anants
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>Calculator Service Called</h1>  
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.mindfire.calculator.CalWebService_Service service = new com.mindfire.calculator.CalWebService_Service();
	com.mindfire.calculator.CalWebService port = service.getCalWebServicePort();
	 // TODO initialize WS operation arguments here
	float a = 5.0f;
	float b = 6.0f;
	// TODO process result here
	float result = port.add(a, b);
	out.println("Add Result [ "+a+ " + "+b+" ] = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.mindfire.calculator.CalWebService_Service service = new com.mindfire.calculator.CalWebService_Service();
	com.mindfire.calculator.CalWebService port = service.getCalWebServicePort();
	 // TODO initialize WS operation arguments here
	float a = 8.0f;
	float b = 5.0f;
	// TODO process result here
	float result = port.mul(a, b);
	out.println("Multiply Result [ "+a+ " * "+b+" ] = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
