package ru.netology.stats;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sum(income);
        assertEquals(expected, actual);
    }

    @Test
    public void averageMonthlySales() {
        StatsService service = new StatsService();
        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.mean(income);
        assertEquals(expected, actual);
    }
    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxMonth(income);
        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minMonth(income);
        assertEquals(expected, actual);
    }

    @Test
    public void salesLowMean() {
        StatsService service = new StatsService();
        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.lowMean(income);
        assertEquals(expected, actual);
    }

    @Test
    public void salesHighMean() {
        StatsService service = new StatsService();
        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.highMean(income);
        assertEquals(expected, actual);
    }

}
