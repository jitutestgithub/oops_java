public class Animal {
    void eat()
    {
        System.out.println("eating....");
    }
}
    class Dogs extends Animal
    {
        public static void main(String[] args)
            {
                Dogs d = new Dogs();
                d.eat();
            }
        }


