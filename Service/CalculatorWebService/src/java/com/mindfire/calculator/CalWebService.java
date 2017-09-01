/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindfire.calculator;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author anants
 */
@WebService(serviceName = "CalWebService")
@Stateless()
public class CalWebService {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public float Add(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
       float temp= a+b;
        return temp;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mul")
    public float mul(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        float temp= a*b;
        return temp;
    }

}
