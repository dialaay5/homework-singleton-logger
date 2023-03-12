package com.exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Logger implements Loggerable{

    public enum LogLevel {
        ERROR,
        WARNING,
        INFO,
        VERBOSE,
        DEBUG
    }
    HashMap<LogLevel, Integer> counter = new HashMap<>();

    private static Logger INSTANCE;
    private Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            synchronized (Logger.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Logger();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void log_message(LogLevel log_level, String message) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myFormatedDate = date.format(formatDate);
        if (!counter.containsKey(log_level)) {
            counter.put(log_level, 0);
        }
        counter.replace(log_level, counter.get(log_level) + 1);

        System.out.printf("Thread name: %s , %s %s , Time: %s\n" ,Thread.currentThread().getName(),message,log_level,myFormatedDate);
    }

    @Override
    public int get_level_messages_count(LogLevel log_level) {
        if (!counter.containsKey(log_level)) {
            return 0;
        }
        return counter.get(log_level);
    }

    public String log_message1(LogLevel log_level, String message) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myFormatedDate = date.format(formatDate);
        if (!counter.containsKey(log_level)) {
            counter.put(log_level, 0);
        }
        counter.replace(log_level, counter.get(log_level) + 1);
        return ("Thread name is:" + Thread.currentThread().getName() + "," + message + log_level + ", time: " + myFormatedDate);
    }
}

