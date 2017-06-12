package ejemploprecedencia;

/**
 *
 * @author JUAN
 */
public class EjemploPrecedencia {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 2;
        int c = 3;
        
        int r = a+b*c;
           System.out.println("r vale: "+r);
           
           r = (a+b)*c;
           System.out.println("r vale: "+r);
    }
    
}
