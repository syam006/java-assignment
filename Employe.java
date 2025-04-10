class Employe{
    public String name;
    public Double salary;
    public String address;
    public String jobtitle;
    Employe(String name,Double salary,String address,String jobtitle){
        this.name=name;
        this.salary=salary;
        this.address=address;
        this.jobtitle=jobtitle;
    }
    public void generatingperformancereports(){
        System.out.println("Generating performance reports for :"+name+"His role is:"+jobtitle+"his salary is :"+salary +"his address is :"+address);

    }
    public Double calculatingbonous(){
        return salary*0.1+salary;
    }
    public void managingprojects(int a){
        System.out.println("He is managing "+a+" projects");
    }

}
class Manger extends Employe{
    Manger(String name,Double salary,String address,String jobtitle){
        super(name,salary,address,jobtitle);
    }
    public Double calculatingbonous(){
        return salary*0.4 +salary;
    }
    public void generatingperformancereports(){
        System.out.println("Generating performance reports for :"+name+"His role is:"+jobtitle+"his salary is :"+salary +"his address is :"+address);
    }
    public void managingprojects(int a){
        System.out.println("He is managing "+a+" projects");
    }

}
class Developer extends Employe{
    Developer(String name,Double salary,String address,String jobtitle){
        super(name,salary,address,jobtitle);
    }
    public Double calculatingbonous(){
        return salary*0.6+salary;
    }
    public void generatingperformancereports(){
        System.out.println("Generating performance reports for :"+name+"His role is:"+jobtitle+"his salary is :"+salary +"his address is :"+address);
    }
    public void managingprojects(int a){
        System.out.println("He is managing "+a+" projects");
    }
}
class Programmer extends Developer{
    Programmer(String name,Double salary,String address,String jobtitle){
        super(name,salary,address,jobtitle);
    }
    public Double calculatingbonous(){
        return salary*0.8+salary;
    }
    public void generatingperformancereports(){
        System.out.println("Generating performance reports for :"+name+"His role is:"+jobtitle+"his salary is :"+salary +"his address is :"+address);
    }
    public void managingprojects(int a){
        System.out.println("He is managing "+a+" projects");
    }
}
class main{
    public static void main(String[]args){
        Manger m=new Manger("John",10000.0,"New York","Manager");
        Developer d=new Developer("John",10000.0,"USA","Developer");
        Programmer p=new Programmer("John",10000.0,"USA","Programmer");
        m.generatingperformancereports();
        System.out.println("bonus"+m.calculatingbonous());
        m.managingprojects(5);
        d.generatingperformancereports();
        System.out.println("bonus"+d.calculatingbonous());
        d.managingprojects(5);
        p.generatingperformancereports();
        System.out.println("bonus"+p.calculatingbonous());
        p.managingprojects(5);


    }
}

