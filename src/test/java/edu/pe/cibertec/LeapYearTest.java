package edu.pe.cibertec;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("LeapYear - Unit Testing")

public class LeapYearTest {


    private LeapYear leapYear;

    @BeforeEach
    void setUp() {

        leapYear = new LeapYear();

    }

    @Test
    @DisplayName("Divisible by 4")
    void giveYearDivisibleBy4_whenIsLeapYEAR_thenTrue() {

        assertTrue(leapYear.isLeapYear(2024));

    }

    @Test
    @DisplayName("Divisible by 400")
    void giveYearDivisibleBy400_whenIsLeapYEAR_thenTrue() {

        assertTrue(leapYear.isLeapYear(2000));


    }

    @Test
    @DisplayName("Not Divisible by 4")
    void giveYearNotDivisibleBy4_whenIsLeapYEAR_thenFalse() {

        assertFalse(leapYear.isLeapYear(2025));

    }

    @Test
    @DisplayName("Negative Year Throws exceptions")
    void giveNegativeYear_whenIsLeapYEAR_thenThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> leapYear.isLeapYear(-20));

    }  }