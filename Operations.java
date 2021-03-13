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
    
    public double[] convertToPolar(){
        double theta = Math.atan(super.y/super.x) * (180.0/Math.PI);
        double radius = Math.sqrt( Math.pow(super.x,2) + Math.pow(super.y, 2) );
         if(super.x > 0){
             if(super.y < 0){
                    theta = theta + 360;
                }
         } else {
             theta = theta + 180;
         }
         
         double[] polar = {radius,theta};
         return polar;
    }
}
