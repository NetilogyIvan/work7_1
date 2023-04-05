package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i;// запомним его как минимальный

            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
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

    public long total(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long averageSales(long[] sales) {
        long totalSales = total(sales);
        long averageSales = totalSales / 12;
        return averageSales;
    }

    public int monthSalesBelowAverage(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int monthSalesHigherAverage(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}
