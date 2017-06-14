package com.deangerber.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterShould {
  private Greeter greeter;

  @BeforeEach
  void before() {
    greeter = new Greeter();
  }

  @Test
  void return_greeting_with_supplied_name() {
    assertEquals("Hello, World!", greeter.greet("World"));
  }
}