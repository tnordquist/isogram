package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class IsogramTest {

  @ParameterizedTest(name = "[{index}] input = {0}; expected = {1}")
  @CsvFileSource(resources = "test.csv")
  @DisplayName("Check for isogram")
  void isIsoGram(String input, boolean expected) {

    boolean actual = Isogram.isIsogram(input);
    assertEquals(expected, actual);
  }
}