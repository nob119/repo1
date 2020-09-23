package pers.fzm.studentevaluation.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String dateToStr(Date date,String patten){
        SimpleDateFormat sdf = new SimpleDateFormat(patten);
        String format = sdf.format(date);
        return format;
    }

    public static Date strToDate(String date,String patten) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patten);
        Date parse = sdf.parse(date);
        return parse;
    }
}
