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
  통화? ✅
  testFrancMultiplication 을 지워야 할까?
   */

  @Test
  public void testMultiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2));
    assertEquals(Money.dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(6).equals(Money.dollar(5)));
    assertTrue(Money.franc(5).equals(Money.franc(5)));
    assertFalse(Money.franc(6).equals(Money.franc(5)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }

  @Test
  public void testFrancMultiplication() {
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }

  @Test
  public void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }
}
