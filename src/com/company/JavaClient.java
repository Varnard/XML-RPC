package com.company;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.URL;
import java.util.Vector;

public class JavaClient {
    public static void main (String [] args) {

        try {
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("http://localhost:8000"));
            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);

            Vector params = new Vector();

            params.addElement(17.0);
            params.addElement(13.0);

            Object result = client.execute("handler.sum", params);

            double sum = (Double)result;
            System.out.println("Suma: "+ sum);

            params.clear();
            params.addElement(true);

            try {
                Object result2 = client.execute("handler.isException", params);
                String isException = (String) result2;
                System.out.println("Wszystko spoko");
            } catch (XmlRpcException rpce){
                System.out.println("Error code: "+rpce.code);
            }

        } catch (Exception exception) {
            System.err.println("JavaClient: " + exception);
        }
    }
}