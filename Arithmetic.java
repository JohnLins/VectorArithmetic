
public class Arithmetic extends Vector
{
    public Arithmetic(int xI, int yI){
        super(xI, yI);
    }
    

    public void multiplyByScalar(int a)
    {
        super.x = super.x*a;
        super.y = super.y*a;
    }
    
    public void divideByScalar(int a)
    {
        super.x = (int)super.x/a;
        super.y = (int)super.y/a;
    }
    
    public void subtractByVector(Vector a)
    {
        super.x = super.x-a.x;
        super.y = super.y-a.y;
    }
    
    public void addByVector(Vector a)
    {
        super.x = super.x+a.x;
        super.y = super.y/+a.y;
    }
}
