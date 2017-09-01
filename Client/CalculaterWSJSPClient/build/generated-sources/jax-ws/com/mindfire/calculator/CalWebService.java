
package com.mindfire.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalWebService", targetNamespace = "http://calculator.mindfire.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalWebService {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mul", targetNamespace = "http://calculator.mindfire.com/", className = "com.mindfire.calculator.Mul")
    @ResponseWrapper(localName = "mulResponse", targetNamespace = "http://calculator.mindfire.com/", className = "com.mindfire.calculator.MulResponse")
    @Action(input = "http://calculator.mindfire.com/CalWebService/mulRequest", output = "http://calculator.mindfire.com/CalWebService/mulResponse")
    public float mul(
        @WebParam(name = "a", targetNamespace = "")
        float a,
        @WebParam(name = "b", targetNamespace = "")
        float b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://calculator.mindfire.com/", className = "com.mindfire.calculator.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calculator.mindfire.com/", className = "com.mindfire.calculator.AddResponse")
    @Action(input = "http://calculator.mindfire.com/CalWebService/addRequest", output = "http://calculator.mindfire.com/CalWebService/addResponse")
    public float add(
        @WebParam(name = "a", targetNamespace = "")
        float a,
        @WebParam(name = "b", targetNamespace = "")
        float b);

}
