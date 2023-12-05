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
  5CHF x 2 = 10CHF ✅
  Dollar/Franc 중복
  공용 equals ✅
  공용 times
  Franc 와 Dollar 비교하기 ✅
  통화?
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
    assertTrue(new Franc(5).equals(new Franc(5)));
    assertFalse(new Franc(6).equals(new Franc(5)));
    assertFalse(new Franc(5).equals(new Dollar(5)));
  }

  @Test
  public void testFrancMultiplication() {
    Franc five = new Franc(5);
    assertEquals(new Franc(10), five.times(2));
    assertEquals(new Franc(15), five.times(3));
  }
}
