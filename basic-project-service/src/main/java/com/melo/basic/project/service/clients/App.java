package com.melo.basic.project.service.clients;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void changeString(String a) {
        a = "new value";
    }

    public static void changeLista(List<String> lista) {
        String a = "new value";
        lista.add(a);
    }

    public static void changeDummyString(Dummy dummy) {
        dummy.a = "new value";
    }
    
    public static void changeDummy(Dummy dummy) {
        Dummy d = new Dummy();
        d.a = "new dummy";
        dummy = d;
    }
    
    public static void changeDummyAndString(Dummy dummy) {
        Dummy d = new Dummy();
        d.a = "new dummy";
        dummy = d;
        changeDummyString(dummy);
    }

    public static void main(String[] args) {
        String a = "value original";
        System.out.println(a);
        App.changeString(a);
        System.out.println(a);

        List<String> lista = new ArrayList<String>();
        lista.add("value original lista");
        System.out.println(lista);
        App.changeLista(lista);
        System.out.println(a);

        Dummy dummy = new Dummy();
        dummy.a = "value original";
        System.out.println(dummy.a);
        App.changeDummyString(dummy);
        System.out.println(dummy.a);
        
        Dummy dummy2 = new Dummy();
        dummy2.a = "value original";
        System.out.println(a);
        App.changeString(dummy2.getA());
        System.out.println(a);
        
        Dummy dummy3 = new Dummy();
        dummy3.a = "original dummy";
        System.out.println(dummy3.a);
        App.changeDummy(dummy3);
        System.out.println(dummy3.a);
        
        Dummy dummy4 = new Dummy();
        dummy4.a = "original dummy";
        System.out.println(dummy4.a);
        App.changeDummyAndString(dummy4);
        System.out.println(dummy4.a);
    }
}
