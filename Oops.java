class Employee{
    int salary = 34;
    String name = "Abhinav";
    public void getSalary(){
        System.out.println("My salary is" +salary);
    }
    public void getName(){
        System.out.println("My name is"+name);
    }
}
public  class Oops{
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.getSalary();
        obj.getName();
        

    }

}