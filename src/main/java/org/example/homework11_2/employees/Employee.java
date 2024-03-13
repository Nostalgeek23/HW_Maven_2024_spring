package org.example.homework11_2.employees;
import org.example.homework11_2.months.Month;

//Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
//Классы Employee и Manager должны быть финальными

public final class Employee extends BaseEmployee{
    public Employee(String name, int age, String sex, double daySalary) {
        super(name, age, sex, daySalary);
    }

    public double getSalary(Month[] monthArray){
        double countSalary = 0.0;
        for (int i = 0; i < monthArray.length; i++) {
            countSalary += monthArray[i].getDaysAmount() * super.getDaySalary();
        }
        return countSalary;
    }
}
