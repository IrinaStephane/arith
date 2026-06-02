package com.hei.school.service.arith;

import org.springframework.stereotype.Service;

@Service
public class SubtractService {
  public double operate(double a, double b) {
    return a - b;
  }
}
