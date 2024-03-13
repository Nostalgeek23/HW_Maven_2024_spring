package org.example.homework11_2.employees;

//Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
//Классы Employee и Manager должны быть финальными

public abstract class BaseEmployee {
    private final String name;
    private int age;
    private final String sex;
    private final double daySalary;

    public BaseEmployee(String name, int age, String sex, double daySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daySalary = daySalary;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected String getSex() {
        return sex;
    }

    protected double getDaySalary() {
        return daySalary;
    }
}
