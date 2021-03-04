
public class Operations extends Vector
{
    public Operations(int xI, int yI){
        super(xI, yI);
    }
    
    public int dot(Vector a)
    {
        return (super.x * a.x) + (super.y * a.y);
    }
}
