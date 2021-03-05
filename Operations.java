import java.lang.Math;
public class Operations extends Vector
{
    public Operations(int xI, int yI){
        super(xI, yI);
    }
    
    public int dot(Vector a)
    {
        return (super.x * a.x) + (super.y * a.y);
    }
    
    public double magnitude(){
        double len = Math.sqrt( Math.pow(super.x, 2)  + Math.pow(super.y, 2) );
        super.display();
        return len;
    }
}
