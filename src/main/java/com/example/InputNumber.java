package com.example;

public class InputNumber {
  private Integer value;
  private String key;
  private String type;

  public InputNumber(Integer value, String key, String type) {
    this.value = value;
    this.key = key;
    this.type = type;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
