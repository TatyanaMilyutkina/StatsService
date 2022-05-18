package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sum = service.sum (income);
        System.out.println("Сумма всех продаж = " + sum);

        long numMean = service.mean(income);
        System.out.println("Средняя сумма продаж в месяц = " + numMean);

        long maxMonth = service.maxMonth(income);
        System.out.println("Номер месяца, в котором был пик продаж - " + maxMonth);

        long minMonth = service.minMonth(income);
        System.out.println("Номер месяца, в котором был минимум продаж - " + minMonth);

        long lowMean = service.lowMean(income);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего - " + lowMean);

        long highMean = service.highMean(income);
        System.out.println("Количество месяцев, в которых продажи были выше среднего - " + highMean);
    }

}
