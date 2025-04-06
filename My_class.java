
class My_class{
    static int count=0;
    final double pi=3.143;
    My_class(){
        count=++count;
    }
    public void display(){
        System.out.println("value of count:"+count+'\n'+"value of pi is:"+pi);
    }
}
class main{
    public static void main(String[]args){
        My_class obj1=new My_class();
        obj1.display();
        My_class obj2=new My_class();
        obj2.display();
        My_class obj3 = new My_class();
        obj3.display();
    }
}