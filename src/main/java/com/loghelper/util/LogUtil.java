package com.loghelper.util;

import com.loghelper.handler.LogHelperTraceHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * Description:
 * Author: cth
 * Created Date: 2024/12/17
 */
@Slf4j
public class LogUtil {
    /**
     * 获取logger
     *
     * @return log name
     */
    public static String getName() {
        return log.getName();
    }

    /**
     * is trace enabled
     *
     * @return is trace enabled
     */
    public static boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    /**
     * trace
     *
     * @param message message
     */
    public static void trace(String message) {
        if (log.isTraceEnabled())
            log.trace(LogHelperTraceHandler.getTraceLog() + message);
    }

    /**
     * trace
     *
     * @param format format
     * @param arg
     */
    public static void trace(String format, Object arg) {
        if (log.isTraceEnabled())
            log.trace(LogHelperTraceHandler.getTraceLog() + format, arg);
    }

    /**
     * @param format format
     * @param arg1   arg1
     * @param arg2   arg2
     */
    public static void trace(String format, Object arg1, Object arg2) {
        if (log.isTraceEnabled())
            log.trace(LogHelperTraceHandler.getTraceLog() + format, arg1, arg2);
    }

    public static void trace(String format, Object... arguments) {
        if (log.isTraceEnabled())
            log.trace(LogHelperTraceHandler.getTraceLog() + format, arguments);
    }

    public static void trace(String msg, Throwable t) {
        if (log.isTraceEnabled())
            log.trace(LogHelperTraceHandler.getTraceLog() + msg, t);
    }

    public static boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    public static void debug(String message) {
        if (log.isDebugEnabled())
            log.debug(LogHelperTraceHandler.getTraceLog() + message);
    }

    public static void debug(String format, Object arg) {
        if (log.isDebugEnabled())
            log.debug(LogHelperTraceHandler.getTraceLog() + format, arg);
    }

    public static void debug(String format, Object arg1, Object arg2) {
        if (log.isDebugEnabled())
            log.debug(LogHelperTraceHandler.getTraceLog() + format, arg1, arg2);
    }

    public static void debug(String format, Object... arguments) {
        if (log.isDebugEnabled())
            log.debug(LogHelperTraceHandler.getTraceLog() + format, arguments);
    }

    public static void debug(String msg, Throwable t) {
        if (log.isDebugEnabled())
            log.debug(LogHelperTraceHandler.getTraceLog() + msg, t);
    }

    public static boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    public static void info(String message) {
        log.info(LogHelperTraceHandler.getTraceLog() + message);
    }

    public static void info(String format, Object arg) {
        log.info(LogHelperTraceHandler.getTraceLog() + format, arg);
    }

    public static void info(String format, Object arg1, Object arg2) {
        log.info(LogHelperTraceHandler.getTraceLog() + format, arg1, arg2);
    }

    public static void info(String format, Object... arguments) {
        log.info(LogHelperTraceHandler.getTraceLog() + format, arguments);
    }

    public static void info(String msg, Throwable t) {
        log.info(LogHelperTraceHandler.getTraceLog() + msg, t);
    }

    public static boolean isWarnEnabled() {
        return log.isWarnEnabled();
    }

    public static void warn(String message) {
        log.warn(LogHelperTraceHandler.getTraceLog() + message);
    }

    public static void warn(String format, Object arg) {
        log.warn(LogHelperTraceHandler.getTraceLog() + format, arg);
    }

    public static void warn(String format, Object arg1, Object arg2) {
        log.warn(LogHelperTraceHandler.getTraceLog() + format, arg1, arg2);
    }

    public static void warn(String format, Object... arguments) {
        log.warn(LogHelperTraceHandler.getTraceLog() + format, arguments);
    }

    public static void warn(String msg, Throwable t) {
        log.warn(LogHelperTraceHandler.getTraceLog() + msg, t);
    }

    public static boolean isErrorEnabled() {
        return log.isErrorEnabled();
    }

    public static void error(String message) {
        log.error(LogHelperTraceHandler.getTraceLog() + message);
    }

    public static void error(String format, Object arg) {
        log.error(LogHelperTraceHandler.getTraceLog() + format, arg);
    }

    public static void error(String format, Object arg1, Object arg2) {
        log.error(LogHelperTraceHandler.getTraceLog() + format, arg1, arg2);
    }

    public static void error(String format, Object... arguments) {
        log.error(LogHelperTraceHandler.getTraceLog() + format, arguments);
    }

    public static void error(String msg, Throwable t) {
        log.error(LogHelperTraceHandler.getTraceLog() + msg, t);
    }
}