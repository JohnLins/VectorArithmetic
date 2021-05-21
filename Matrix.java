import java.lang.Math;
public class Matrix
{
    
    private Vector row1;
    private Vector row2;

    
    public Matrix(Vector one, Vector two)
    {
       row1 = one;
       row2 = two;
    }

    double[] eigenValues(){
        
        double[] ev = new double[2];
        
        
        int a =  (row1.getX() + row2.getY());
        
        double b = Math.sqrt( Math.pow((row1.getX() + row2.getY()), 2) - 4*(row1.getX()*row2.getY() - row2.getX()*row1.getY()) );
        
        
        
        ev[0] = (a + b) / 2;
        ev[1] = (a - b) / 2;
        
        
        return ev;
    }
    
    double det(){
     return (row2.getY() * row1.getX()) - (row2.getX() * row1.getY()); 
    }
}
