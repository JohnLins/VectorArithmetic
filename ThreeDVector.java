
public class ThreeDVector extends Vector
{
    int z;

    
    public ThreeDVector(int xI, int yI, int zI)
    {
        super(xI, yI);
        z=zI;
    }

   
   public void display()
    {
        System.out.println("------------------");
        System.out.println("X: " + x + "\nY: " + y + "\nZ:" + z);
        System.out.println("------------------");
    }
        
    
    public static void main(String args[]){
        
      ThreeDVector vec = new ThreeDVector(6, 4, 9);
      vec.display();
      
      ThreeDOperations vec2 = new ThreeDOperations(3, 7, 1);
      
      vec2.cross(vec);
      
      vec2.display();
        
    }
}
