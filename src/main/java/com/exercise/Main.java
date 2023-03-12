package com.exercise;

public class Main {
    public static void main(String[] args){
        Thread t1 = new Thread( () -> {
            Logger log1 = Logger.getInstance();
            log1.log_message(Logger.LogLevel.WARNING, "log level is:");
        });
        Thread t2 = new Thread(() -> {
            Logger log2 =  Logger.getInstance();
            log2.log_message(Logger.LogLevel.DEBUG, "log level is:");
        });
        Thread t3 = new Thread(() -> {
            Logger log3 =  Logger.getInstance();
            log3.log_message(Logger.LogLevel.ERROR, "log level is:");
        });
        Thread t4 = new Thread(() -> {
            Logger log4 =  Logger.getInstance();
            log4.log_message(Logger.LogLevel.INFO, "log level is:");
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
