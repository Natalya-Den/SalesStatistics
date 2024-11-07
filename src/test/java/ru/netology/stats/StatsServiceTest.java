package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();

        long actual = service.sumAllSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesSum() {
        StatsService service = new StatsService();

        long actual = service.averageSalesSum(sales);
        long expected = 180 / sales.length;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBellowAverage() {
        StatsService service = new StatsService();

        long actual = service.saleBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOverAverage() {
        StatsService service = new StatsService();

        long actual = service.saleOverAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}