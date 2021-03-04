
public class Arithmetic extends Vector
{
    public Arithmetic(int xI, int yI){
        super(xI, yI);
    }
    

    public void multiply(int a)
    {
        super.x = super.x*a;
        super.y = super.y*a;
    }
}
