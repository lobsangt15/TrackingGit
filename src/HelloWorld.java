public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        double x = 0;
        x += (Math.random() * 10)+1;
        if ( x > 0) {
            x++;
        } else {
            x--;
        }
        System.out.println(x);
    }
}
