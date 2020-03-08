package Ans200222;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//Calendar 사용
public class p126 {
    //토,일 인가?
    public static boolean isRest(Calendar tod) {
        boolean isRest = false;
        if (tod.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || tod.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            isRest = true;
        }
        return isRest;
    }

    //포멧에 맞게 문자열로 변환
    public static String toYMD(Calendar dd) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dd.getTime());
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //캘린더 생성
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 이번달의 마지막날을 넣는다 28~31의 값
        for (int i = 1; i < lastDay; i++) {
            cal.set(Calendar.DAY_OF_MONTH, i);
            if (isRest(cal)) {
                System.out.println(toYMD(cal) + " is Rest Day");
            }
        }
    }
}
