package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public int avgMonth(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    // Номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // Нколичество месяцев в котором продажи были ниже среднего
    public int minAvgSales(int[] sales) {
        int month = 0;
        int avgMonth = sumSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale < avgMonth) {
                month++;
            }
        }
        return month;
    }

    // Нколичество месяцев в котором продажи были выше среднего
    public int maxAvgSales(int[] sales) {
        int month = 0;
        int avgMonth = sumSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale > avgMonth) {
                month++;
            }
        }
        return month;
    }
}
