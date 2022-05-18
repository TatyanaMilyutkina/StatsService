package ru.netology.stats;

public class StatsService {

    public long sum(long[] proceeds) {

        long sum = 0;
        for (long proceed : proceeds) {
            sum += proceed;
        }
        return sum;
    }

    public long mean(long[] means) {

        long check = means.length;
        long sum1 = 0;
        for (long mean : means) {
            sum1 += mean;
        }
        long numMean = sum1 / check;
        return numMean;
    }


    public long maxMonth(long[] max) {
        int maxMonth = 0;
        int month = 0;
        for (long l : max) {
            if (l >= max[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public long minMonth(long[] min) {
        int minMonth = 0;
        int month = 0;
        for (long l : min) {
            if (l <= min[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }


    public long lowMean(long[] low) {
        int minMonthLow = 0;
        long check = low.length;
        long sum = 0;
        for (long l : low) {
            sum += l;
        }
        long numMean = sum / check;

        for (long j : low) {

            if (numMean > j) {
                minMonthLow++;
            }
        }
        return minMonthLow;
    }


    public long highMean(long[] high) {
        int maxMonthHigh = 0;
        long check = high.length;
        long sum = 0;
        for (long h : high) {
            sum += h;
        }
        long numMean = sum / check;

        for (long j : high) {

            if (numMean < j) {
                maxMonthHigh++;
            }
        }
        return maxMonthHigh;
    }

}



