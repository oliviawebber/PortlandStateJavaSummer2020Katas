package edu.pdx.cs410J.kataGroup;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void romanNumeralFor1IsI() {
    assertThat(Kata.getRomanNumeralFor(1), equalTo("I"));
  }

  @Test
  public void romanNumeralFor2IsII() {
    assertThat(Kata.getRomanNumeralFor(2), equalTo("II"));
  }

  @Test
  public void romanNumeralFor3IsIII() {
    assertThat(Kata.getRomanNumeralFor(3), equalTo("III"));
  }

  @Test
  public void romanNumeralFor5IsV() {
    assertThat(Kata.getRomanNumeralFor(5), equalTo("V"));
  }

  @Test
  public void romanNumeralFor10IsX() {
    assertThat(Kata.getRomanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void romanNumeralFor4IsIV() {
    assertThat(Kata.getRomanNumeralFor(4), equalTo("IV"));
  }

  @Test
  public void romanNumeralFor7IsVII() {
    assertThat(Kata.getRomanNumeralFor(7), equalTo("VII"));
  }

  @Test
  public void romanNumeralFor9IsIX() {
    assertThat(Kata.getRomanNumeralFor(9), equalTo("IX"));
  }

  @Test
  public void romanNumeralFor36IsSomething() {
    assertThat(Kata.getRomanNumeralFor(9), equalTo("XXXVI"));
  }
}
