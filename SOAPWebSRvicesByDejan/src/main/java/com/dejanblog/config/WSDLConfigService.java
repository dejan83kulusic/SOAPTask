package com.dejanblog.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.server.SoapEndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WSDLConfigService {
    //Request Handler - Servlet ->ServletRegistration Bean->MessageServlet
    //URL what is the pattern of URL /soap/*

    @Bean
    public ServletRegistrationBean requestDispacher(ApplicationContext context){
        MessageDispatcherServlet mds=new MessageDispatcherServlet();
        mds.setApplicationContext(context);
        mds.setTransformWsdlLocations(true);

        return new ServletRegistrationBean(mds, "/soap/*");

    }

    //Creating a schema
    @Bean
    public XsdSchema empyeeSchema(){
        return new SimpleXsdSchema(new ClassPathResource("employee.xsd"));
    }

    //Creating a request
    @Bean(name="empservice")
    public DefaultWsdl11Definition createWsdl(XsdSchema schema){
        DefaultWsdl11Definition wsdl=new DefaultWsdl11Definition();
        wsdl.setPortTypeName("EmployeePort");
        wsdl.setLocationUri("/soap");
        wsdl.setTargetNamespace("http://dejanblog.com/hrms");
        wsdl.setSchema(schema);
        return wsdl;

    }


}
