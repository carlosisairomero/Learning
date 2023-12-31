package com.cromero._05_chapter._03_rick_guitars_cohesive;

public enum Builder {

  FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

  public String toString() {
    switch(this) {
      case FENDER:   return "Fender";
      case MARTIN:   return "Martin";
      case GIBSON:   return "Gibson";
      case COLLINGS: return "Collings";
      case OLSON:    return "Olson";
      case RYAN:     return "Ryan";
      case PRS :     return "PRS";
      default:       return "Unspecified";
    }
  }
}
