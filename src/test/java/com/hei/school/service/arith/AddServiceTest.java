package com.hei.school.service.arith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddServiceTest {

  private final AddService subject = new AddService();

  @Test
  void add_positive_numbers() {
    assertEquals(5.0, subject.operate(2, 3));
  }

  @Test
  void add_negative_numbers() {
    assertEquals(-1.0, subject.operate(-3, 2));
  }

  @Test
  void add_zeros() {
    assertEquals(0.0, subject.operate(0, 0));
  }
}
