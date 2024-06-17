public class overriding_1 {
    void show(){
        System.out.println("1");
    }
}
class overriding_2 extends overriding_1{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        overriding_2 t= new overriding_2();
        t.show();
    }
}

