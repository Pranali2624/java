public class Developer extends Inheritance {
    float appreciation;
    public void getData(int id, String name, Float salary, float bonus)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.appreciation = appreciation;
    }
    public void putData()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + appreciation);
    }
    
    public void totalsal(){
        float totalsal = (salary + appreciation);
        System.out.println("Total Salary: " + totalsal);
    }
}
    class NewSingleInheritance{
        public static void main(String[] args) {
            InheritanceSi is = new InheritanceSi();
            is.getData(1, "pranali", 50000.0f, 10000.0f);
            is.putData();
            is.totalsal();
        }
}