package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long averageSalesSum(long[] sales) {
        long averageSale = 0;
        averageSale = sumAllSales(sales) / sales.length;
        return averageSale;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int saleBellowAverage(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale < averageSalesSum(sales)) {
                count++;
            }
        }
        return count;
    }

    public int saleOverAverage(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale > averageSalesSum(sales)) {
                count++;
            }
        }
        return count;
    }

}
