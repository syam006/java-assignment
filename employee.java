class employee{
public void work(){
System.out.println("Employee is working...");
}
public Double getsalary(Double salary){
return salary;
}
}
class HRManager extends employee{

public void work(){
System.out.println("Manager is handiling some new tasks");
}

public void addEmployee(String name){
System.out.println(name+"he is a new employee");
}
}
class main{
public static void main(String[]args){
HRManager e = new HRManager();
e.work();
System.out.println("salary:"+ e.getsalary(300000.00));
e.addEmployee("lohith");
System.out.println("salary:"+ e.getsalary(300000.00));


}
}