package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    void numberMonthsMinSales() {
        StatsService service = new StatsService();

        long[] dataSalesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(dataSalesByMonths);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void numberMonthsMaxSales() {
        StatsService service = new StatsService();

        long[] dataSalesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(dataSalesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        long[] dataSalesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.total(dataSalesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();

        long[] dataSalesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(dataSalesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] dataSalesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthSalesBelowAverage(dataSalesByMonths);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthSalesHigherAverage() {
        StatsService service = new StatsService();

        long[] dataSalesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthSalesHigherAverage(dataSalesByMonths);

        Assertions.assertEquals(expected, actual);
    }
}
