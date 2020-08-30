package com.example;

import java.util.Collections;
import java.util.List;

public class CompareInputNumber {

  private  CheckNumber checkNumber;

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
}
