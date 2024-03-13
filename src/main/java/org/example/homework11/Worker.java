package org.example.homework11;

//Worker.getBaseSalary должен быть финальным
public class Worker extends Employee {


    @Override
    public final double getSalary(){
        return super.getBaseSalary();
    }
}
