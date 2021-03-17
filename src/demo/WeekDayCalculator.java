package demo;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * WeekDayCalculator测试类
 *
 * @author great
 * @since 2021-03-10
 */

public class WeekDayCalculator {
    public static String calcDay(int y, int m, int d) {
        String[] days = {"THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY"};
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dy = (y - 1998) % 400;
        int sum = dy + d - 1;
        for (int i = 1998; i < dy + 1996; i += 4) {
            sum += (i + 2) % 400 == 0 || (i + 2) % 100 > 0 ? 1 : 0;
        }
        dayOfMonth[1] += y % 400 == 0 || (y % 4 == 0 && y % 100 > 0) ? 1 : 0;
        sum += Arrays.stream(dayOfMonth).limit(m - 1).reduce(0, Integer::sum);
        return y < 1998 || m < 1 || m > 12 || d < 1 || d > dayOfMonth[m - 1] ? "Invalid date input!" : days[sum % 7];
    }

    public static void main(String[] args) {
//        for (int k = 1998; k < 1002010; k++) {
//            if (!calcDay(k, 5, 31).equals(LocalDate.of(k, 5, 31).getDayOfWeek().toString())) {
//                System.out.println(k);
//            }
//        }

        System.out.println(calcDay(1999, 3, 13));
        System.out.println(LocalDate.of(1999, 3, 13).getDayOfWeek());
    }
}
