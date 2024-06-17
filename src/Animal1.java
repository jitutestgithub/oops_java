public class Animal1 {
    void running(){
        System.out.println("animal running....");
    }
}
class dogs extends Animal1{
    void eating(){
        System.out.println("animal eating...");


    }

    public static void main(String[] args) {
        dogs m2=new dogs();
        m2.eating();
        m2.running();
        Animal1 m1=new Animal1();
        m1.running();

    }
}
