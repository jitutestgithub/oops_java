public class overloading_1 {
    public void eat(String a){
        System.out.println("dog running");

    }
    public void eat(int s){
        System.out.println("dog eatning");

    }

    public static void main(String[] args) {
        overloading_1 d=new overloading_1();
        d.eat("kl");
    }
}
