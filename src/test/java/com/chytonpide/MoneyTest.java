package com.chytonpide;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

  /*
  TODO
  $5x2 = $10
  환율계산이 되어야 한다.

   */

  @Test
  public void testMultiple() {
    Dollar five = new Dollar(5);

    five.times(2);

    assertEquals(10, five.amount);
  }
}
