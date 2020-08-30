package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckNumber {

  public boolean isContinue(List<InputNumber> inputNumbers) {
    inputNumbers.sort((preObject, laterObject) -> (preObject.getValue() - laterObject.getValue()));
    int maxDifference = inputNumbers.get(4).getValue() - inputNumbers.get(0).getValue();
    return maxDifference == 4;
  }

  public List<Pair> checkPair(List<InputNumber> inputNumbers) {
    Map<String,Integer> map = getKeyCountMap(inputNumbers);
    List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
    list.sort((preObject, laterObject) -> (preObject.getValue() - laterObject.getValue()));
    return getPairs(list);
  }

  private List<Pair> getPairs(List<Map.Entry<String, Integer>> list) {
    List<Pair> pairs = new ArrayList<>();

    list = list.stream().filter(item -> item.getValue() > 1).collect(Collectors.toList());
    list.forEach(item -> pairs.add(new Pair(item.getKey(), item.getValue())));

    return pairs;
  }

  private Map<String, Integer> getKeyCountMap(List<InputNumber> inputNumbers) {
    Map<String, Integer> map = new HashMap<>();
    for (InputNumber inputNumber : inputNumbers) {
      if (map.containsKey(inputNumber.getKey())) {
        map.put(inputNumber.getKey(), map.get(inputNumber.getKey()) + 1);
      } else {
        map.put(inputNumber.getKey(), 1);
      }
    }
    return map;
  }

  public boolean isFlush(List<InputNumber> inputNumbers) {
    String type = inputNumbers.get(0).getType();
    return inputNumbers.stream().allMatch(item -> item.getType().equals(type));
  }

  public boolean isStraightFlush(List<InputNumber> inputNumbers) {
    return isContinue(inputNumbers) && isFlush(inputNumbers);
  }

  public boolean isTwoPair(List<InputNumber> inputNumbers) {
     return checkPair(inputNumbers).size() == 2;
  }

  public boolean isThreeOfAKind(List<InputNumber> inputNumbers) {
    List<Pair> pairs = checkPair(inputNumbers);
    return pairs.size() == 1 && pairs.get(0).getCount() == 3;
  }

  public boolean isFullHouse(List<InputNumber> inputNumbers) {
    List<Pair> pairs = checkPair(inputNumbers);
    int sum = pairs.stream().mapToInt(Pair::getCount).sum();
    return pairs.size() == 2 && sum == inputNumbers.size() ;
  }
}
