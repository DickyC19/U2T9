public class CircleRunner {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getInfo());
        circle1.setRadius(9.2);
        System.out.println(circle1.getInfo());

        Circle circle2 = new Circle(6);
        System.out.println(circle2.getInfo());
        circle2.setRadius(10);
        System.out.println(circle2.getInfo());
    }
}
