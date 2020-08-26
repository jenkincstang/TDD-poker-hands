package com.example;

import java.util.Comparator;

public class ComparatorInputNumber implements Comparator {

  public int compare(Object preObject, Object laterObject) {
    InputNumber preNumber = (InputNumber) preObject;
    InputNumber laterNumber = (InputNumber) laterObject;
    return preNumber.getValue().compareTo(laterNumber.getValue());
  }

}
