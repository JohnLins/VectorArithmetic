public class Vector
{
    int x;
    int y;
    public Vector(int xI, int yI)
    {
        x = xI;
        y = yI;
    }
    
    
    public void display()
    {
        System.out.println("X: " + x + "\nY: " + y);
        System.out.println("------------------");
    }
        
    
    public static void main(String args[]){
        
        Arithmetic test = new Arithmetic(5, 8);
        test.multiply(3);
        test.display();
        
        Vector mine = new Vector(5, 7);
        Operations test2 = new Operations(2, 5);
        
        
        int value = test2.dot(mine);
        System.out.println(value);
    }
}
