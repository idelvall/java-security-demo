package org.brutusin.security.test1;

import java.io.FileOutputStream;
import java.security.ProtectionDomain;

public class CreateFileTest {

  public static void main(String[] args) throws Exception {
    System.out.println(CreateFileTest.class.getProtectionDomain().getCodeSource());
    FileOutputStream fos = new FileOutputStream("/tmp/out.txt");
    fos.write("Hello".getBytes());
    fos.close();

  }
}
