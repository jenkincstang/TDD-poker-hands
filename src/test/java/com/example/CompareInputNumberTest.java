package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CompareInputNumberTest {

  @Test
  void should_return_white_wins_when_compare_two_input_number_given_black_2H_4D_4S_2C_4D_and_white_2S_3S_4S_8S_AS(){
    //given
    InputNumber inputNumber1 = new InputNumber(2, "2", "H");
    InputNumber inputNumber2 = new InputNumber(4, "4", "D");
    InputNumber inputNumber3 = new InputNumber(4, "4", "S");
    InputNumber inputNumber4 = new InputNumber(2, "2", "C");
    InputNumber inputNumber5 = new InputNumber(4, "4", "D");
    List<InputNumber> blackInputNumber = new ArrayList<InputNumber>();
    blackInputNumber.add(inputNumber1);
    blackInputNumber.add(inputNumber2);
    blackInputNumber.add(inputNumber3);
    blackInputNumber.add(inputNumber4);
    blackInputNumber.add(inputNumber5);

    InputNumber inputNumber11 = new InputNumber(2, "2", "S");
    InputNumber inputNumber22 = new InputNumber(3, "3", "S");
    InputNumber inputNumber33 = new InputNumber(4, "4", "S");
    InputNumber inputNumber44 = new InputNumber(8, "8", "S");
    InputNumber inputNumber55 = new InputNumber(14, "A", "S");
    List<InputNumber> whiteInputNumber = new ArrayList<InputNumber>();
    whiteInputNumber.add(inputNumber11);
    whiteInputNumber.add(inputNumber22);
    whiteInputNumber.add(inputNumber33);
    whiteInputNumber.add(inputNumber44);
    whiteInputNumber.add(inputNumber55);


    CompareInputNumber compareInputNumber = new CompareInputNumber();
    String expectResult = "White wins. - with high card: A";
    //when
    String result = compareInputNumber.compareHighCard(blackInputNumber,whiteInputNumber);
    //then
    Assert.assertEquals(result,expectResult);
  }


  @Test
  void should_return_tie_when_compare_two_input_number_given_black_2H_4D_4S_2C_4D_and_white_2H_4D_4S_2C_4D(){
    //given
    InputNumber inputNumber1 = new InputNumber(2, "2", "H");
    InputNumber inputNumber2 = new InputNumber(4, "4", "D");
    InputNumber inputNumber3 = new InputNumber(4, "4", "S");
    InputNumber inputNumber4 = new InputNumber(2, "2", "C");
    InputNumber inputNumber5 = new InputNumber(4, "4", "D");
    List<InputNumber> blackInputNumber = new ArrayList<InputNumber>();
    blackInputNumber.add(inputNumber1);
    blackInputNumber.add(inputNumber2);
    blackInputNumber.add(inputNumber3);
    blackInputNumber.add(inputNumber4);
    blackInputNumber.add(inputNumber5);

    InputNumber inputNumber11 = new InputNumber(2, "2", "H");
    InputNumber inputNumber22 = new InputNumber(4, "4", "D");
    InputNumber inputNumber33 = new InputNumber(4, "4", "S");
    InputNumber inputNumber44 = new InputNumber(2, "2", "C");
    InputNumber inputNumber55 = new InputNumber(4, "4", "D");
    List<InputNumber> whiteInputNumber = new ArrayList<InputNumber>();
    whiteInputNumber.add(inputNumber11);
    whiteInputNumber.add(inputNumber22);
    whiteInputNumber.add(inputNumber33);
    whiteInputNumber.add(inputNumber44);
    whiteInputNumber.add(inputNumber55);

    String expectResult = "Tie";

    CompareInputNumber compareInputNumber = new CompareInputNumber();
    //when
    String result = compareInputNumber.compareHighCard(blackInputNumber,whiteInputNumber);
    //then
    Assert.assertEquals(result,expectResult);
  }


  @Test
  void should_return_white_wins_when_compare_two_input_number_given_black_5H_5D_6S_7C_4D_and_white_2S_3S_8S_8S_AS(){
    //given
    InputNumber inputNumber1 = new InputNumber(5, "5", "H");
    InputNumber inputNumber2 = new InputNumber(5, "5", "D");
    InputNumber inputNumber3 = new InputNumber(6, "6", "S");
    InputNumber inputNumber4 = new InputNumber(7, "7", "C");
    InputNumber inputNumber5 = new InputNumber(4, "4", "D");
    List<InputNumber> blackInputNumber = new ArrayList<InputNumber>();
    blackInputNumber.add(inputNumber1);
    blackInputNumber.add(inputNumber2);
    blackInputNumber.add(inputNumber3);
    blackInputNumber.add(inputNumber4);
    blackInputNumber.add(inputNumber5);

    InputNumber inputNumber11 = new InputNumber(2, "2", "S");
    InputNumber inputNumber22 = new InputNumber(3, "3", "S");
    InputNumber inputNumber33 = new InputNumber(8, "8", "S");
    InputNumber inputNumber44 = new InputNumber(8, "8", "S");
    InputNumber inputNumber55 = new InputNumber(14, "A", "S");
    List<InputNumber> whiteInputNumber = new ArrayList<InputNumber>();
    whiteInputNumber.add(inputNumber11);
    whiteInputNumber.add(inputNumber22);
    whiteInputNumber.add(inputNumber33);
    whiteInputNumber.add(inputNumber44);
    whiteInputNumber.add(inputNumber55);
    CheckNumber checkNumber = new CheckNumber();
    String expectResult = "White wins. - with Pair of: 8";
    CompareInputNumber compareInputNumber = new CompareInputNumber();
    //when
    String result = compareInputNumber.comparePair(blackInputNumber,whiteInputNumber);
    //then
    Assert.assertEquals(result,expectResult);
  }

  @Test
  void should_return_white_wins_when_compare_two_input_number_not_equal_priority_given_black_2H_3D_5S_9C_KD_and_white_2C_2H_4S_8C_AH(){
    //given
    InputNumber inputNumber1 = new InputNumber(2, "2", "H");
    InputNumber inputNumber2 = new InputNumber(3, "3", "D");
    InputNumber inputNumber3 = new InputNumber(5, "5", "S");
    InputNumber inputNumber4 = new InputNumber(9, "9", "C");
    InputNumber inputNumber5 = new InputNumber(13, "K", "D");
    List<InputNumber> blackInputNumber = new ArrayList<InputNumber>();
    blackInputNumber.add(inputNumber1);
    blackInputNumber.add(inputNumber2);
    blackInputNumber.add(inputNumber3);
    blackInputNumber.add(inputNumber4);
    blackInputNumber.add(inputNumber5);

    InputNumber inputNumber11 = new InputNumber(2, "2", "C");
    InputNumber inputNumber22 = new InputNumber(2, "2", "H");
    InputNumber inputNumber33 = new InputNumber(4, "4", "S");
    InputNumber inputNumber44 = new InputNumber(8, "8", "C");
    InputNumber inputNumber55 = new InputNumber(14, "A", "H");
    List<InputNumber> whiteInputNumber = new ArrayList<InputNumber>();
    whiteInputNumber.add(inputNumber11);
    whiteInputNumber.add(inputNumber22);
    whiteInputNumber.add(inputNumber33);
    whiteInputNumber.add(inputNumber44);
    whiteInputNumber.add(inputNumber55);

    String expectResult = "White wins";

    CompareInputNumber compareInputNumber = new CompareInputNumber();
    //when
    String result = compareInputNumber.compareNotEqualPriority(blackInputNumber,whiteInputNumber);
    //then
    Assert.assertEquals(result,expectResult);
  }

  @Test
  void should_return_white_wins_when_compare_two_input_number_not_equal_priority_given_black_3H_3H_3H_3H_5D_and_white_2H_3H_4H_5H_6H(){
    //given
    InputNumber inputNumber1 = new InputNumber(3, "3", "H");
    InputNumber inputNumber2 = new InputNumber(3, "3", "H");
    InputNumber inputNumber3 = new InputNumber(3, "3", "H");
    InputNumber inputNumber4 = new InputNumber(3, "3", "H");
    InputNumber inputNumber5 = new InputNumber(5, "5", "D");
    List<InputNumber> blackInputNumber = new ArrayList<InputNumber>();
    blackInputNumber.add(inputNumber1);
    blackInputNumber.add(inputNumber2);
    blackInputNumber.add(inputNumber3);
    blackInputNumber.add(inputNumber4);
    blackInputNumber.add(inputNumber5);


    InputNumber inputNumber11 = new InputNumber(2, "2", "H");
    InputNumber inputNumber22 = new InputNumber(3, "3", "H");
    InputNumber inputNumber33 = new InputNumber(4, "4", "H");
    InputNumber inputNumber44 = new InputNumber(5, "5", "H");
    InputNumber inputNumber55 = new InputNumber(6, "6", "H");
    List<InputNumber> whiteInputNumber = new ArrayList<InputNumber>();
    whiteInputNumber.add(inputNumber11);
    whiteInputNumber.add(inputNumber22);
    whiteInputNumber.add(inputNumber33);
    whiteInputNumber.add(inputNumber44);
    whiteInputNumber.add(inputNumber55);

    String expectResult = "White wins";

    CompareInputNumber compareInputNumber = new CompareInputNumber();
    //when
    String result = compareInputNumber.compareNotEqualPriority(blackInputNumber,whiteInputNumber);
    //then
    Assert.assertEquals(result,expectResult);
  }

  @Test
  void should_return_white_wins_when_compare_two_input_number_equal_priority_given_black_3H_3H_3H_3H_5D_and_white_4H_4H_4H_4H_6D(){
    //given
    InputNumber inputNumber1 = new InputNumber(3, "3", "H");
    InputNumber inputNumber2 = new InputNumber(3, "3", "H");
    InputNumber inputNumber3 = new InputNumber(3, "3", "H");
    InputNumber inputNumber4 = new InputNumber(3, "3", "H");
    InputNumber inputNumber5 = new InputNumber(5, "5", "D");
    List<InputNumber> blackInputNumber = new ArrayList<InputNumber>();
    blackInputNumber.add(inputNumber1);
    blackInputNumber.add(inputNumber2);
    blackInputNumber.add(inputNumber3);
    blackInputNumber.add(inputNumber4);
    blackInputNumber.add(inputNumber5);


    InputNumber inputNumber11 = new InputNumber(4, "4", "H");
    InputNumber inputNumber22 = new InputNumber(4, "4", "H");
    InputNumber inputNumber33 = new InputNumber(4, "4", "H");
    InputNumber inputNumber44 = new InputNumber(4, "4", "H");
    InputNumber inputNumber55 = new InputNumber(6, "6", "D");
    List<InputNumber> whiteInputNumber = new ArrayList<InputNumber>();
    whiteInputNumber.add(inputNumber11);
    whiteInputNumber.add(inputNumber22);
    whiteInputNumber.add(inputNumber33);
    whiteInputNumber.add(inputNumber44);
    whiteInputNumber.add(inputNumber55);

    String expectResult = "White wins. - with Pair of: 4";

    CompareInputNumber compareInputNumber = new CompareInputNumber();
    //when
    String result = compareInputNumber.compareEqualPriority(blackInputNumber,whiteInputNumber);
    //then
    Assert.assertEquals(result,expectResult);
  }
}
