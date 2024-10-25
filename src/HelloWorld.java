public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Its friday today!");
        double y = 0;
        y += (Math.random() * 10)+1;
        if ( y > 0) {
            y++;
            System.out.println(y);
        } else {
            y--;
            System.out.println(y);
        }
        System.out.println("Goodbye!");
        System.out.println("See you on monday!");
    }
}
