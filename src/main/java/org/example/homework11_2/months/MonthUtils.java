package org.example.homework11_2.months;
//import java.lang.reflect.Array;

//Задача №2
//
//Необходимо реализовать задание из Tasks#9 со следующими условиями:
//Класс Month сделать неизменяемым (immutable)
//Статические поля с объектами месяцев должны быть финальными
//Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно),
// полугодия и год.
public class MonthUtils {

    public final static Month JANUARY = new Month("January", 31, 17);
    public final static Month FEBRUARY = new Month("February", 29, 20);
    public final static Month MARCH = new Month("March", 31, 20);
    public final static Month APRIL = new Month("April",30, 21);
    public final static Month MAY = new Month("May", 31, 20);
    public final static Month JUNE = new Month("June", 30, 19);
    public final static Month JULY = new Month("July", 31, 23);
    public final static Month AUGUST = new Month("August", 31, 22);
    public final static Month SEPTEMBER = new Month("September", 30, 21);
    public final static Month OCTOBER = new Month("October", 31, 23);
    public final static Month NOVEMBER = new Month("November", 30, 21);
    public final static Month DECEMBER = new Month("December", 31, 21);

    public final static Month[] ALL_MONTHS = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };
    public final static Month[] SUMMER = {JUNE, JULY, AUGUST};
    public final static Month[] firstQuater = {JANUARY, FEBRUARY, MARCH};
    public final static Month[] secondQuater = {APRIL, MAY, JUNE};
    public final static Month[] thirdQuater = {JULY, AUGUST, SEPTEMBER};
    public final static Month[] fourthQuater = {OCTOBER, NOVEMBER, DECEMBER};
    public final static Month[] firstHalf = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
    public final static Month[] secondHalf = {JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};


    public static Month[] getFirstQuater(){
        return firstQuater;
    }
    public static Month[] getSecondQuater(){
        return secondQuater;
    }
    public static Month[] getThirdQuater(){
        return thirdQuater;
    }
    public static Month[] getFourthQuater(){
        return fourthQuater;
    }
    public static Month[] getFirstHalf(){
        return firstHalf;
    }
    public static Month[] getSecondHalf(){
        return secondHalf;
    }
    public static Month[] getYear(){
        return ALL_MONTHS;
    }



}
