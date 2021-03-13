import java.lang.Math;
public class Polar
{
    private int radius;
    private int theta;
    public Polar(int r, int t)
    {
        radius = r;
        theta = t;
    }

    
    public Vector convert2Rec()
    {
        return new Vector((int)(radius * Math.cos(theta)), (int)(radius * Math.sin(theta)));
    }
}
