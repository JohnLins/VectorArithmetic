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
        System.out.println("------------------");
        System.out.println("X: " + x + "\nY: " + y);
        System.out.println("------------------");
    }
        
    
    public static void main(String args[]){
        
        Arithmetic vec1 = new Arithmetic(5, 8);
        
        vec1.multiplyByScalar(3);
        vec1.display();
        
        vec1.divideByScalar(3);
        vec1.display();
        
        vec1.addByVector(new Vector(6, 2));
        vec1.display();
        
        vec1.substractByVector(new Vector(5, 4));
        vec1.display();
        
        
       
        Operations vec2 = new Operations(2, -5);
        
        int value = vec2.dot(new Vector(2, 8));
        System.out.println(value);
        
        System.out.println(vec2.magnitude());
        
        
        System.out.println(vec2.convertToPolar()[0]);
        System.out.println(vec2.convertToPolar()[1]);
        
        Polar vec3 = new Polar(6, 100);
        Vector vec4 = vec3.convert2Rec();
        vec4.display();
        
    }
}
