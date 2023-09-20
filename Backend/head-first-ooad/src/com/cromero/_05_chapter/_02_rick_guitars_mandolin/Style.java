package com.cromero._05_chapter._02_rick_guitars_mandolin;

public enum Style {

  A, F;

  public String toString() {
    switch(this) {
      case A:   return "A style";
      case F:   return "F style";
      default:  return "Unspecified";
    }
  }
}
