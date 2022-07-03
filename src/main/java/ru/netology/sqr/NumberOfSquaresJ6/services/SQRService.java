package ru.netology.sqr.NumberOfSquaresJ6.services;

public class SQRService {
    public int calcScrt(int minRangeLimit, int maxRangeLimit) {

        int counter = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i >= maxRangeLimit) {
                break;
            }
            if (i * i >= minRangeLimit) {
                counter++;
            }
        }
        return counter;
    }
}