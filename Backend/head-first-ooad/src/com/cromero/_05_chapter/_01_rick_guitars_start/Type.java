package com.cromero._05_chapter._01_rick_guitars_start;

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
