package com.hei.school.service.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplyServiceTest {

  private final MultiplyService subject = new MultiplyService();

  @Test
  void multiply_positive_numbers() {
    assertEquals(6.0, subject.operate(2, 3));
  }

  @Test
  void multiply_by_zero() {
    assertEquals(0.0, subject.operate(5, 0));
  }

  @Test
  void multiply_negative_numbers() {
    assertEquals(6.0, subject.operate(-2, -3));
  }
}
