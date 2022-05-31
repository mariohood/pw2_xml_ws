package dev.ifrs.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService (name = "Big", serviceName = "Big")
public class MyBigWS {
    @WebMethod
    public int convert(int a){

        return a;
    }
    
}
