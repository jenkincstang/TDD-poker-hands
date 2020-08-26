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
}