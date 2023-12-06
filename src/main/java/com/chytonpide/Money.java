package com.chytonpide;

public class Money {
  protected int amount;
  protected String currency;

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  protected Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && currency().equals(money.currency());
  }

  public String currency() {
    return currency;
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  public String toString() {
    return amount + " " + currency;
  }
}
