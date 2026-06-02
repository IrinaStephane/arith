package com.hei.school.service.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubtractServiceTest {

  private final SubtractService subject = new SubtractService();

  @Test
  void subtract_positive_numbers() {
    assertEquals(1.0, subject.operate(3, 2));
  }

  @Test
  void subtract_gives_negative() {
    assertEquals(-1.0, subject.operate(2, 3));
  }

  @Test
  void subtract_zeros() {
    assertEquals(0.0, subject.operate(0, 0));
  }
}
