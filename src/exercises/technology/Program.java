package exercises.technology;

public class Program {

    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone("iPhone 13",50, 15.2, "AT&T");
        Laptop macbook = new Laptop("MacBook Air", 78, 15.8, 64);
        Laptop macbook2 = new Laptop("MacBook", 120, 15.6, 42 );

        iphone.findSignal();
        System.out.println(macbook2.isCharged());

        iphone.downloadMedia(23.1);
        System.out.println(iphone.getMemoryAvailable());


    }
}
