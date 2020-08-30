package com.example;

public class Pair {
  private String key;
  private Integer value;
  private Integer count;

  public Pair(String key, Integer count) {
    this.key = key;
    this.value = count;
  }

  public Integer getValue() {
    switch (this.key) {
      case "J":
        return 10;
      case "Q":
        return 11;
      case "K":
        return 12;
      case "A":
        return 13;
      default:
        return Integer.parseInt(this.key);
    }

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

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Pair pair = (Pair) o;

    if (key != null ? !key.equals(pair.key) : pair.key != null) {
      return false;
    }
    return count != null ? count.equals(pair.count) : pair.count == null;
  }

  @Override
  public int hashCode() {
    int result = key != null ? key.hashCode() : 0;
    result = 31 * result + (count != null ? count.hashCode() : 0);
    return result;
  }
}
