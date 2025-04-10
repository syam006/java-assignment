 import static java.lang.System.*;
 abstract class Bird {
    abstract void fly();
    abstract void makesound();
}
class Eagle extends Bird {
    void fly() {
        out.println("Eagle flies at a heighto of 1000 meters");
    }
    void makesound() {
        out.println("Eagle makes a loud screeching sound");


    }   
}
class Hawk extends Bird {
    void fly() {
        out.println("Hawk flies at a height of 500 meters");
        }
        void makesound() {
            out.println("Hawk makes a high-pitched chirping sound");
        }
    }
    class main{
        public static void main(String []chaitu){
            Bird eagle = new Eagle();
            Bird hawk = new Hawk();
            out.println("BATCHU SYAM SUNDER,"+'\n'+"AV.SC.U4CSE24023"+'\n'+"CSE-A");
            eagle.fly();
            eagle.makesound();
            hawk.fly();
            hawk.makesound();

        }

    }
            

