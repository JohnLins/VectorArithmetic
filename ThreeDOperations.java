
public class ThreeDOperations extends ThreeDVector
{
    
    public ThreeDOperations(int xI, int yI, int zI)
    {
        super(zI, yI, zI);
    }

   
    public ThreeDVector cross(ThreeDVector a)
    {
        return new ThreeDVector(a.y*super.z - a.z*super.y, a.z*super.x - a.x*super.z, a.x*super.y - a.y*super.x);
    }
}
