package com.example;

import java.util.List;

public class CompareInputNumber {
  private static CheckNumber checkNumber = new CheckNumber();

  public static String compareHighCard(List<InputNumber> blackInputNumber, List<InputNumber> whiteInputNumber) {
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


  public static String comparePair(List<Pair> blackPairs, List<Pair> whitePairs) {
    String winner = "";
    String highCard = "";
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
    return "Tie";
  }
}
