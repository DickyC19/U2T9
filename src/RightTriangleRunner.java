public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle rightTriangle1 = new RightTriangle(3, 4);
        RightTriangle rightTriangle2 = new RightTriangle(6.5, 10.7);
        double hypotenuse1 = rightTriangle1.hypotenuse();
        double hypotenuse2 = rightTriangle2.hypotenuse();
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);

        RightTriangle rightTriangle3 = new RightTriangle(6, 8);
        RightTriangle rightTriangle4 = new RightTriangle(10, 10);
        double hypotenuse3 = rightTriangle3.hypotenuse();
        double hypotenuse4 = rightTriangle4.hypotenuse();
        System.out.println(hypotenuse3);
        System.out.println(hypotenuse4);
    }
}