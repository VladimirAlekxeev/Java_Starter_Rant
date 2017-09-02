public class C01_Variables {

    public static void main(String[] args) {
        int a = 2;
        System.out.println("a=" + a);
        Cat cat = new Cat();
        String text = "Cat is" + cat;
        System.out.println(text);
        float d = 250.3f;
        System.out.println("d=" + d);
        a = (int)d;
        System.out.println("a=" + a);
        System.out.println(++a);
        System.out.println(a);
        byte f = 5;
        System.out.println("f=" + f);
        f += 5000;
        System.out.println("f=" + f);



    }

    public static class  Cat {
        public String name;
    }
}
