package com.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckNumberTest {

  private static Demo demo;

  @BeforeClass
  public static void setUp() {
    demo = new Demo();
  }

  @Test
  public void test01() {
    String result = demo.run();
    assertThat(result).isEqualTo("ABC");
  }

  @Test
  void should_return_false_when_check_input_numbers_continuous_given_AH_2S_4C_5D_KD() {
    //given
    InputNumber inputNumber1 = new InputNumber(14, "A", "H");
    InputNumber inputNumber2 = new InputNumber(2, "2", "S");
    InputNumber inputNumber3 = new InputNumber(4, "4", "C");
    InputNumber inputNumber4 = new InputNumber(5, "5", "D");
    InputNumber inputNumber5 = new InputNumber(13, "K", "D");
    List<InputNumber> inputNumbers = new ArrayList<InputNumber>();
    inputNumbers.add(inputNumber1);
    inputNumbers.add(inputNumber2);
    inputNumbers.add(inputNumber3);
    inputNumbers.add(inputNumber4);
    inputNumbers.add(inputNumber5);

    CheckNumber checkNumber = new CheckNumber();
    //when
    boolean result = checkNumber.isContinue(inputNumbers);
    //then
    Assert.assertEquals(result, false);
  }

  @Test
  void should_return_ture_when_check_input_numbers_continuous_given_2S_3H_4C_5D_6D() {
    //given
    InputNumber inputNumber1 = new InputNumber(2, "2", "S");
    InputNumber inputNumber2 = new InputNumber(3, "3", "H");
    InputNumber inputNumber3 = new InputNumber(4, "4", "C");
    InputNumber inputNumber4 = new InputNumber(5, "5", "D");
    InputNumber inputNumber5 = new InputNumber(6, "6", "D");
    List<InputNumber> inputNumbers = new ArrayList<InputNumber>();
    inputNumbers.add(inputNumber1);
    inputNumbers.add(inputNumber2);
    inputNumbers.add(inputNumber3);
    inputNumbers.add(inputNumber4);
    inputNumbers.add(inputNumber5);

    CheckNumber checkNumber = new CheckNumber();
    //when
    boolean result = checkNumber.isContinue(inputNumbers);
    //then
    Assert.assertEquals(result, true);
  }

  @Test
  void should_return_key_is_4_and_count_2_when_check_input_number_pair_given_AH_2S_4C_4H_KD() {
    //given
    InputNumber inputNumber1 = new InputNumber(14, "A", "H");
    InputNumber inputNumber2 = new InputNumber(2, "2", "S");
    InputNumber inputNumber3 = new InputNumber(4, "4", "C");
    InputNumber inputNumber4 = new InputNumber(4, "4", "H");
    InputNumber inputNumber5 = new InputNumber(13, "K", "D");
    List<InputNumber> inputNumbers = new ArrayList<InputNumber>();
    inputNumbers.add(inputNumber1);
    inputNumbers.add(inputNumber2);
    inputNumbers.add(inputNumber3);
    inputNumbers.add(inputNumber4);
    inputNumbers.add(inputNumber5);

    CheckNumber checkNumber = new CheckNumber();
    Pair expectPair = new Pair("4", 2);
    //when

    List<Pair> resultPairs = checkNumber.checkPair(inputNumbers);

    //then
    Assert.assertEquals(expectPair, resultPairs.get(0));
  }

  @Test
  void should_return_key_2_count_2_and_key_4_count_2_when_check_input_number_pair_given_2H_2S_4C_4H_KD() {
    //given
    InputNumber inputNumber1 = new InputNumber(2, "2", "H");
    InputNumber inputNumber2 = new InputNumber(2, "2", "S");
    InputNumber inputNumber3 = new InputNumber(4, "4", "C");
    InputNumber inputNumber4 = new InputNumber(4, "4", "H");
    InputNumber inputNumber5 = new InputNumber(13, "K", "D");
    List<InputNumber> inputNumbers = new ArrayList<InputNumber>();
    inputNumbers.add(inputNumber1);
    inputNumbers.add(inputNumber2);
    inputNumbers.add(inputNumber3);
    inputNumbers.add(inputNumber4);
    inputNumbers.add(inputNumber5);

    CheckNumber checkNumber = new CheckNumber();
    Pair expectPair1 = new Pair("2", 2);
    Pair expectPair2 = new Pair("4", 2);
    List<Pair> expectPairs = new ArrayList<>();
    expectPairs.add(expectPair1);
    expectPairs.add(expectPair2);

    //when
    List<Pair> resultPairs = checkNumber.checkPair(inputNumbers);

    //then
    Assert.assertEquals(resultPairs, expectPairs);
  }

  @Test
  void should_return_true_when_check_input_number_is_flush_given_2H_3H_4H_4H_KH() {
    //given
    InputNumber inputNumber1 = new InputNumber(2, "2", "H");
    InputNumber inputNumber2 = new InputNumber(3, "3", "H");
    InputNumber inputNumber3 = new InputNumber(4, "4", "H");
    InputNumber inputNumber4 = new InputNumber(4, "4", "H");
    InputNumber inputNumber5 = new InputNumber(13, "K", "H");
    List<InputNumber> inputNumbers = new ArrayList<InputNumber>();
    inputNumbers.add(inputNumber1);
    inputNumbers.add(inputNumber2);
    inputNumbers.add(inputNumber3);
    inputNumbers.add(inputNumber4);
    inputNumbers.add(inputNumber5);

    CheckNumber checkNumber = new CheckNumber();

    //when
    boolean result = checkNumber.isFlush(inputNumbers);

    //then
    Assert.assertEquals(result, true);
  }

  @Test
  void should_return_false_when_check_input_number_is_flush_given_2S_3H_4H_4H_KH() {
    //given
    InputNumber inputNumber1 = new InputNumber(2, "2", "S");
    InputNumber inputNumber2 = new InputNumber(3, "3", "H");
    InputNumber inputNumber3 = new InputNumber(4, "4", "H");
    InputNumber inputNumber4 = new InputNumber(4, "4", "H");
    InputNumber inputNumber5 = new InputNumber(13, "K", "H");
    List<InputNumber> inputNumbers = new ArrayList<InputNumber>();
    inputNumbers.add(inputNumber1);
    inputNumbers.add(inputNumber2);
    inputNumbers.add(inputNumber3);
    inputNumbers.add(inputNumber4);
    inputNumbers.add(inputNumber5);

    CheckNumber checkNumber = new CheckNumber();

    //when
    boolean result = checkNumber.isFlush(inputNumbers);

    //then
    Assert.assertEquals(result, false);
  }
}