public class RightTriangle {

    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int e = Integer.parseInt(args[1]);
        int f = Integer.parseInt(args[2]);
        boolean isTriangle;
        int a = d*d;
        int b = e*e;
        int c = f*f;

        isTriangle = (a + b == c) || (b + c == a) || (a + c == b);
        System.out.println(isTriangle);
    }

}
