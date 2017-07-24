package com.humandaily.www.common.freamwork;

import org.apache.log4j.Logger;

/**
 * Created by datadriver on 2017/7/16.
 */
public class HLoger {
    public static Class aClass = HLoger.class;

    public static void error(String message) {
        Logger.getLogger(aClass).error(message);
    }

    public static void info(String message) {
        Logger.getLogger(aClass).info(message);
    }

    public static void error(String message, Throwable e) {
        Logger.getLogger(aClass).error(message, e);
    }

    public static void info (String message, Throwable e) {
        Logger.getLogger(aClass).info(message, e);
    }
}
