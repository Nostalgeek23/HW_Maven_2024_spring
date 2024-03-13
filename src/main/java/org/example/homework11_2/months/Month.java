package org.example.homework11_2.months;

//Задача №2
//
//Необходимо реализовать задание из Tasks#9 со следующими условиями:
//Класс Month сделать неизменяемым (immutable)
//Статические поля с объектами месяцев должны быть финальными
//Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно),
// полугодия и год.
//Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
//Классы Employee и Manager должны быть финальными


public final class Month {

   private final String monthName;
   private final int daysAmount;
   private final int workDaysAmount;

    public Month(String monthName, int daysAmount, int workDaysAmount) {
        this.monthName = monthName;
        this.daysAmount = daysAmount;
        this.workDaysAmount = workDaysAmount;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public int getWorkDaysAmount() {
        return workDaysAmount;
    }


}
