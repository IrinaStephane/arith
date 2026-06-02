package com.hei.school.service.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DivideServiceTest {

  private final DivideService subject = new DivideService();

  @Test
  void divide_positive_numbers() {
    assertEquals(2.0, subject.operate(6, 3));
  }

  @Test
  void divide_by_zero_throws() {
    assertThrows(ArithmeticException.class, () -> subject.operate(5, 0));
  }

  @Test
  void divide_negative_numbers() {
    assertEquals(-2.0, subject.operate(-6, 3));
  }
}
