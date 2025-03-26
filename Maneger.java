package com.inheritance;

class Maneger extends Employee
{
    float bonus;
    
    public void getData(int id,string nm,float sal,float b)
    {
        this.id=id;
        this.name=nm;
        this.salary=sal;
        this.bouns=b;
    }
    public void putData()
    {
        System.out.println("Employee id Employee name salary");
        System.out.println(this.id+"\t\t"+this.name+"\t\t"+this.salary);
        
    }
    
}
    public class NewSingleInherit{
        public static void main(String[]arg){
            Maneger mob = new Maneger();
            mob.getData(102,"pranali",50000);
            mob.putData();
        
            
        }
    }