package com.hei.school.service.arith;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService {
  public double operate(double a, double b) {
    return a * b;
  }
}
