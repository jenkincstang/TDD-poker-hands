package com.example;

import java.util.Collections;
import java.util.List;

public class CheckNumber {

  public boolean isContinue(List<InputNumber> inputNumbers) {
    ComparatorInputNumber comparatorInputNumber = new ComparatorInputNumber();
    Collections.sort(inputNumbers, comparatorInputNumber);
    int maxDifference = inputNumbers.get(4).getValue() - inputNumbers.get(0).getValue();
    return maxDifference == 4;
  }
}
