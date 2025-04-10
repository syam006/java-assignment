import  static java.lang.System.* ;

interface playable {
    void play();
}
class Football implements  playable {
    public void play() {
        out.println("Football is the national sport for the country named France ");
    }
}
class Volleyball implements playable {
     public void play() {
        out.println("volley ball is the national sport for the  country named china");
    }
}
class Basketball implements  playable{
   public void play() {
        out.println("basket ball is the national sport the counrty named Lithuania");
    }
}
class main{
    public static void main(String []args){
        out.println("BATCHU SYAM SUNDER,"+'\n'+"AV.SC.U4CSE24023"+'\n'+"CSE-A");
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();

    }
}