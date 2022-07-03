package ru.netology.sqr.NumberOfSquaresJ6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/values.csv")

    public void testnumone(int expected, int minRangeLimit, int maxRangeLimit) {
        SQRService service = new SQRService();

        int actual = service.calcScrt(minRangeLimit, maxRangeLimit);

        Assertions.assertEquals(expected, actual);
    }
}