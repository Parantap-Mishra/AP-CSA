public class Main{
    public static class Performer{
        String name;
        int age;
        Performer(String name, int age){
            this.name=name;
            this.age=age;
        }
        Performer(){
            name="Unknown";
            age=16;
        }
        public void perform(){
            System.out.println("Performer class");
        }
    }
    public static class Musician extends Performer{
        String instrument;
        Musician(String instrument, String name, int age){
            super(name, age);
            this.instrument=instrument;
        }
        public void perform(){
            System.out.println("Musician class");
            super.perform();
            System.out.println(super.name);
        }
    }
    public static void main(String[] args){
       double b=6;
       int i=2;
       double b2=i;
       int r = b+b2;

    }
}