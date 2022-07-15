package com.leetCode.easyLevel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IndexOfTest {

  IndexOf indexOfObject = new IndexOf();

  @Test
  public void strStrTest() {
    Assertions.assertEquals("Hola".indexOf("Ho"), indexOfObject.strStr("Hola", "Ho"));
  }
}
