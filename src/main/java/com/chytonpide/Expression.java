package com.chytonpide;

public interface Expression {
  Money reduce(Bank bank, String to);
}
