//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.24 at 05:09:22 PM CEST 
//


package com.dejanblog.hrm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dejanblog.hrm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployeeResponse_QNAME = new QName("http://dejanblog.com/hrm", "GetEmployeeResponse");
    private final static QName _GetEmployeeRequest_QNAME = new QName("http://dejanblog.com/hrm", "GetEmployeeRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dejanblog.hrm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeRequest }
     * 
     */
    public GetEmployeeRequest createGetEmployeeRequest() {
        return new GetEmployeeRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dejanblog.com/hrm", name = "GetEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dejanblog.com/hrm", name = "GetEmployeeRequest")
    public JAXBElement<GetEmployeeRequest> createGetEmployeeRequest(GetEmployeeRequest value) {
        return new JAXBElement<GetEmployeeRequest>(_GetEmployeeRequest_QNAME, GetEmployeeRequest.class, null, value);
    }

}