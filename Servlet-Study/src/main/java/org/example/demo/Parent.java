package org.example.demo;

public class Parent {

    public void init(){}

    public void service(String method){
        if("GET".equals(method))
            doGet();
        else if("POST".equals(method)){
            doPost();
        }
    }
    public void destroy(){}

    public void doGet(){
        System.out.println(405);
    }
    public void doPost(){
        System.out.println(405);
    }
}
