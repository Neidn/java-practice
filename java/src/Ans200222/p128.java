package Ans200222;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//13일의 금요일 찾기
public class p128 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        int currentyear = cal.get(Calendar.YEAR);
        int cnt = 0;
        for (int year = 2000; year <= currentyear; year++) {
            for (int month = 0; month < 12; month++) {
                cal.set(year, month, 13);
                if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                    System.out.println((++cnt) + "\t" + sdf.format(cal.getTime()));
                }
            }
        }
    }
}
