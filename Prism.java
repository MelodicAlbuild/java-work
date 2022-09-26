public class Prism {
    private Point pt1;
    private Point pt2;

    private double height;
    private double width;
    private double length;

    public Prism(Point pt1, Point pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;

        height = pt1.CalcHeight(pt2);
        width = pt1.CalcWidth(pt2);
        length = pt1.CalcLength(pt2);

        System.out.println("Height: " + height + " Width: " + width + " Length: " + length);
    }

    public double DiagCalc() {
        double val;
        val = Math.sqrt((Math.pow(height,2) + Math.pow(width,2) + Math.pow(length,2)));
        return val;
    }

    public double SphereCalc() {
        double smallest = SmallestValue((int) width, (int) length, (int) height);
        double radius = smallest / 2;
        return ((double)4/3) * Math.PI * Math.pow(radius,3);
    }

    public double VolumeCalc() {
        double val;
        val = width * height * length;
        return val;
    }

    public double SurfaceCalc() {
        double val;
        val = 2 * ((width * length) + (height * length) + (height * width));
        return val;
    }

    public int EdgeCalc() {
        int val;
        val = (int)(4 * (width + length + height));
        return val;
    }

    private int SmallestValue(int a, int b, int c) {
        int smallest;
        if(a<b && a<c) {
            smallest = a;
        } else if (b<c) {
            smallest = b;
        } else {
            smallest = c;
        }
        return smallest;
    }

}
