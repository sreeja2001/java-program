public class CMYKtoRGB {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double e = 1-d;
        double f = 255*e*(1-a);
        double g = 255*e*(1-b);
        double h = 255*e*(1-c);
        System.out.println("red= "+ Math.round(f));
                System.out.println("green= "+ Math.round(g));
                        System.out.println("blue= "+ Math.round(h));




    }
}
