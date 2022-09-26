import java.util.Scanner;

import static java.lang.System.out;

public class PrismRunner {
    // Point 1
    private static int ax;
    private static int ay;
    private static int az;
    // Point 2
    private static int bx;
    private static int by;
    private static int bz;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        out.println("Input your first set of coordinates (x, y, z):");

        ax = in.nextInt();
        ay = in.nextInt();
        az = in.nextInt();

        out.println("Input your second set of coordinates (x, y, z):");

        bx = in.nextInt();
        by = in.nextInt();
        bz = in.nextInt();

        Prism prism = new Prism(new Point(ax, ay, az), new Point(bx, by, bz));
        out.print("Rectangle Diag: ");
        out.printf("%.3f", prism.DiagCalc());
        out.println(" ");
        out.println("Box Volume: " + prism.VolumeCalc());
        out.println("Box SA: " + prism.SurfaceCalc());
        out.println("Box Total Edge: " + prism.EdgeCalc());
        out.print("Sphere Volume: ");
        // Formatting (%.3f): % = All numbers before the decimal | 3f = 3 decimals after the decimal point
        out.printf("%.3f", prism.SphereCalc());
    }
}
