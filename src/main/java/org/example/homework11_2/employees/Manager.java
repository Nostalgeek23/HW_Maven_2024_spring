package org.example.homework11_2.employees;
import org.example.homework11_2.months.Month;

//Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
//Классы Employee и Manager должны быть финальными



public final class Manager extends BaseEmployee {

    private final int subordinates;
    public Manager(String name, int age, String sex, double daySalary, int subordinates) {
        super(name, age, sex, daySalary);
        this.subordinates = subordinates;
    }

    public int getSubordinates() {
        return subordinates;
    }

    public double getSalary(Month[] monthArray){
        double countSalary = 0.0;
        for (int i = 0; i < monthArray.length; i++) {
            countSalary += monthArray[i].getDaysAmount() * getDaySalary();
        }
        return countSalary * (1 + getSubordinates() * 0.01);

    }
}


