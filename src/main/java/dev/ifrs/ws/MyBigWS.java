package dev.ifrs.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService (name = "Big", serviceName = "Big")
public class MyBigWS {
    @WebMethod
    public int convert1(int a){

        return a*2;
    }

    @WebMethod
    public int convert2(int a){

        return a*3;
    }
    
}
