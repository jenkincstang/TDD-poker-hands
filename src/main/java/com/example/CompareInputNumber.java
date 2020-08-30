package com.example;

import java.util.Arrays;
import java.util.List;

public class CompareInputNumber {
  private final CheckNumber checkNumber = new CheckNumber();

  public String compareHighCard(List<InputNumber> blackInputNumber, List<InputNumber> whiteInputNumber) {
    String winner = "";
    String highCard = "";
    for (int i = blackInputNumber.size() - 1; i >= 0; i--) {
       if(blackInputNumber.get(i).getValue() > whiteInputNumber.get(i).getValue()){
         winner = "Black";
         highCard = blackInputNumber.get(i).getKey();
         return winner+" wins. - with high card: "+highCard;
       }else if(blackInputNumber.get(i).getValue() < whiteInputNumber.get(i).getValue()){
         winner = "White";
         highCard = whiteInputNumber.get(i).getKey();
         return winner+" wins. - with high card: "+highCard;
       }
    }
    return "Tie";
  }


  public  String comparePair(List<InputNumber> blackInputNumber, List<InputNumber> whiteInputNumber) {
    String winner = "";
    String highCard = "";
    List<Pair> blackPairs = checkNumber.checkPair(blackInputNumber);
    List<Pair> whitePairs = checkNumber.checkPair(whiteInputNumber);

    for (int i = blackPairs.size() - 1; i >= 0; i--) {
      if(blackPairs.get(i).getValue() > whitePairs.get(i).getValue()){
        winner = "Black";
        highCard = blackPairs.get(i).getKey();
        return winner+" wins. - with Pair of: "+highCard;
      }else if(blackPairs.get(i).getValue() < whitePairs.get(i).getValue()){
        winner = "White";
        highCard = whitePairs.get(i).getKey();
        return winner+" wins. - with Pair of: "+highCard;
      }
    }
    return compareHighCard(blackInputNumber,blackInputNumber);
  }




  public String compareNotEqualPriority(List<InputNumber> blackInputNumber, List<InputNumber> whiteInputNumber) {
    int blackPriority = checkNumber.checkPriority(blackInputNumber);
    int whitePriority = checkNumber.checkPriority(whiteInputNumber);
    return blackPriority > whitePriority ? "Black wins" : "White wins";
  }

  public String compareEqualPriority(List<InputNumber> blackInputNumber, List<InputNumber> whiteInputNumber) {
    Integer[] priorities1 = {2,3,4,7,8};
    Integer[] priorities2 = {1,5,6,9};
    int priority = checkNumber.checkPriority(blackInputNumber);
    if(Arrays.asList(priorities2).contains(priority)){
      return compareHighCard(blackInputNumber, whiteInputNumber);
    }else if (Arrays.asList(priorities1).contains(priority)){
      return comparePair(blackInputNumber,whiteInputNumber);
    }
    return "Tie";
  }
}
