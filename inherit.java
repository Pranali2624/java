package com.inheritance;

public class Inherit {
        int id;
        String name;
        Float salary;

        public void getData(int id, String name, Float salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        public void putData()
        {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }
        class SingleInherit {
            public static void main(String[] args)
                {
                    Inherit emp = new Inherit();
                    emp.getData(1, "pranali", 50000.0f);
                    System.out.println("Employee Data: ");
                    emp.putData();
                }
    }