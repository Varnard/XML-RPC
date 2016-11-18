package com.company;

import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.webserver.WebServer;

public class JavaServer {

    public static void main(String[] args) {

        try {
            WebServer webServer = new WebServer(8000);
            XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();

            PropertyHandlerMapping phm = new PropertyHandlerMapping();
            phm.addHandler("handler", Handler.class);
            xmlRpcServer.setHandlerMapping(phm);

            webServer.start();

            System.out.println("Started successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
