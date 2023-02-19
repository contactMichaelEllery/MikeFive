package org.example;

import org.apache.log4j.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {


        System.out.println("Hello world from Michael!");
        log.error("Hello World Logger from Michael");
    }

}