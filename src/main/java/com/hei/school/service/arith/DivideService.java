package com.hei.school.service.arith;

import org.springframework.stereotype.Service;

@Service
public class DivideService {
  public double operate(double a, double b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return a / b;
  }
}
