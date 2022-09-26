public class Point {
    public int x;
    public int y;
    public int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int CalcHeight(Point pt) {
        int val;
        if(y > pt.y) {
            val = y - pt.y;
        } else {
            val = pt.y - y;
        }
        return val;
    }

    public int CalcWidth(Point pt) {
        int val;
        if(x > pt.x) {
            val = x - pt.x;
        } else {
            val = pt.x - x;
        }
        return val;
    }

    public int CalcLength(Point pt) {
        int val;
        if(z > pt.z) {
            val = z - pt.z;
        } else {
            val = pt.z - z;
        }
        return val;
    }
}
