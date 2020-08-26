package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckNumber {

  public boolean isContinue(List<InputNumber> inputNumbers) {
    inputNumbers.sort((preObject, laterObject) -> (preObject.getValue() - laterObject.getValue()));
    int maxDifference = inputNumbers.get(4).getValue() - inputNumbers.get(0).getValue();
    return maxDifference == 4;
  }

  public Pair checkPair(List<InputNumber> inputNumbers) {
    Map<String, Integer> map = getKeyCountMap(inputNumbers);

    List<Map.Entry<String,Integer>> list = new ArrayList(map.entrySet());
    list.sort((preObject, laterObject) -> (preObject.getValue() - laterObject.getValue()));

    int count = list.get(list.size()-1).getValue();
    String key = list.get(list.size()-1).getKey();

    return new Pair(key,count);
  }

  private Map<String, Integer> getKeyCountMap(List<InputNumber> inputNumbers) {
    Map<String,Integer> map = new HashMap<String, Integer>();

    for (InputNumber inputNumber : inputNumbers) {
      if(map.containsKey(inputNumber.getKey())) {
        map.put(inputNumber.getKey(), map.get(inputNumber.getKey()).intValue()+1);
      }else {
        map.put(inputNumber.getKey(), new Integer(1));
      }
    }
    return map;
  }
}
