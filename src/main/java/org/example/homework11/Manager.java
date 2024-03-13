package org.example.homework11;

//Коэффициенты для расчета ЗП у Manager и Director
//должны быть константами (коэффициенты из формулы расчета ЗП)
//Классы Manager и Director должны быть финальными
public final class Manager extends Employee {

    private final double salaryCoeff = 0.03;



    public Manager(int numberOfSubordinates) {
        super(numberOfSubordinates);
    }

    @Override
    public double getSalary(){
        return super.getBaseSalary() * (1 + super.getNumberOfSubordinates() * salaryCoeff);
    }
}
