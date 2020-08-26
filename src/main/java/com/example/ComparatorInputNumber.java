package com.example;

import java.util.Comparator;

public class ComparatorInputNumber implements Comparator {

  public int compare(Object o1, Object o2) {
    InputNumber number0 = (InputNumber) o1;
    InputNumber number1 = (InputNumber) o2;
    return number0.getValue().compareTo(number1.getValue());
  }

}
