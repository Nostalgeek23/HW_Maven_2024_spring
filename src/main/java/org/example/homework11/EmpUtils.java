package org.example.homework11;

//Задача №3
//
//Необходимо создать утилитарный класс со следующими методами:
//поиск сотрудника в массиве по его имени
//поиск сотрудника в массиве по вхождению указанной строки в его имени
//подсчет зарплатного бюджета для всех сотрудников в массиве
//поиск наименьшей зарплаты в массиве
//поиск наибольшей зарплаты в массиве
//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

public class EmpUtils {

    //поиск сотрудника в массиве по его имени
    public static Employee getEmployeeNameSearch(Employee[] employeeArray, String searchName){
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().equals(searchName)){
                return employeeArray[i];
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findEmployeeNameContainsString(Employee[] employeeArray, String nameContains){
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().contains(nameContains)){
                return employeeArray[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double countBudget(Employee[] employeeArray){
        double count = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            count += employeeArray[i].getSalary();
        }
        return count;
    }

    //поиск наименьшей зарплаты в массиве

    public static double minSalary(Employee[] employeeArray){
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < employeeArray.length; i++) {
            if (min > employeeArray[i].getSalary()){
                min = employeeArray[i].getSalary();
            }
        }
        return min;
    }

    //поиск наибольшей зарплаты в массиве

    public static double maxSalary(Employee[] employeeArray){
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < employeeArray.length; i++) {
            if (max < employeeArray[i].getSalary()){
                max = employeeArray[i].getSalary();
            }
        }
        return max;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minSubordinates(Manager[] managersArray){
        int min = managersArray[0].getNumberOfSubordinates();
        for (int i = 1; i < managersArray.length; i++) {
            if (min > managersArray[i].getNumberOfSubordinates()){
                min = managersArray[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int maxSubordinates(Manager[] managersArray){
        int max = managersArray[0].getNumberOfSubordinates();
        for (int i = 1; i < managersArray.length; i++) {
            if (max < managersArray[i].getNumberOfSubordinates()){
                max = managersArray[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static double maxSalaryDiff(Manager[] managersArray){
        double max = managersArray[0].getSalary() - managersArray[0].getBaseSalary();
        for (int i = 1; i < managersArray.length; i++) {
            if (max < managersArray[i].getSalary() - managersArray[i].getBaseSalary()){
                max = managersArray[i].getSalary() - managersArray[i].getBaseSalary();
            }
        }
        return max;
    }

    //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static double minSalaryDiff(Manager[] managersArray){
        double min = managersArray[0].getSalary() - managersArray[0].getBaseSalary();
        for (int i = 1; i < managersArray.length; i++) {
            if (min > managersArray[i].getSalary() - managersArray[i].getBaseSalary()){
                min = managersArray[i].getSalary() - managersArray[i].getBaseSalary();
            }
        }
        return min;
    }


}
