//* consider a software system for a company that manages its employees.the company categorizes its employees into two primary types : RegularEmployee and manager.both types of employees share common attributes such as name amd employee id ,but managers have  attribute such as bonous.you are tasked with desigining the java classes for this scenario and add up the salary for each type*//


class company{
private String name;
private int employeeid;
company(String name,int employeeid){
this.name=name;
this.employeeid=employeeid ;
}
public void display(){
System.out.println("the name of the employee is:"+name+"id of the employee is "+employeeid);
}
public Double getsalary(Double salary){
return salary;
}
}
class RegularEmployee extends company{
RegularEmployee(String name,int employeeid){
super(name,employeeid);
}
public Double getsalary(Double salary){
return salary;
}
}

class Manager extends company{
 private Double Bonous;

Manager(String name,int employeeid,Double Bonous){
super(name,employeeid);
this.Bonous=Bonous;
}
public Double getsalary(Double salary){
return salary+Bonous;
}
}

class main{
public static void main(String []args){
RegularEmployee employe = new RegularEmployee("chaitu",00000);
employe.display();
System.out.println("salary of a regular employee:"+employe.getsalary(30.0));
Manager manage = new Manager("siva",918753,30.0);
manage.display();
System.out.println("salary of a manager:"+manage.getsalary(30.0));
}
}


