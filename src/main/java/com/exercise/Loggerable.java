package com.exercise;

public interface Loggerable {
     void log_message(Logger.LogLevel log_level, String message);
     int get_level_messages_count(Logger.LogLevel log_level);
}
