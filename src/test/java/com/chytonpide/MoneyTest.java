package com.chytonpide;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoneyTest {

  /*
  TODO
  $5 + 10CHF = $10(환율이 2:1일 경우)
  $5 x 2 = $10 ✅
  amount 를 private 로 만들기 ✅
  Dollar 부작용? ✅
  Money 반올림?
  equals() ✅
  hasCode()
  Equal null
  Equal Object
   */

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(6).equals(new Dollar(5)));
  }
}
