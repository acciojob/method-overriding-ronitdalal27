package com.driver;

class a{
    public String meth(){
        return "Invoking method from class A";
    }
}

class b extends a{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}

public class Main {
    public static void main(String[] args) {
        b obj = new b();
        obj.meth();
    }
}