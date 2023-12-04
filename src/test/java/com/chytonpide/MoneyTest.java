package com.chytonpide;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

  /*
  TODO
  $5 + 10CHF = $10(환율이 2:1일 경우)
  $5 x 2 = $10 ✅
  amount 를 private 로 만들기
  Dollar 부작용?
  Money 반올림?
   */

  @Test
  public void testMultiple() {
    Dollar five = new Dollar(5);

    five.times(2);

    assertEquals(10, five.amount);
  }
}
