package com.cromero._01_chapter._03_ricks_guitars_encapsulation;

public enum Type {

  ACOUSTIC, ELECTRIC;

  public String toString() {
    switch(this) {
      case ACOUSTIC: return "acoustic";
      case ELECTRIC: return "electric";
      default:       return "unspecified";
    }
  }
}
