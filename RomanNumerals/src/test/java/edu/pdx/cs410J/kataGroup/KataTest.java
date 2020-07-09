package edu.pdx.cs410J.kataGroup;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void romanNumeralFor1IsI() {
    assertThat(Kata.getRomanNumeralFor(1), equalTo("I"));
  }


}
