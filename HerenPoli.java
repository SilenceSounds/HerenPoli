package herenpoli;
import java.util.Scanner;

/**
 *
 * @author Sayad
 */
public class HerenPoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner S = new Scanner(System.in);
        boolean Peri = false;
        double D;
        
        System.out.println("Favor de seleccionar la propiedad a calcular: ");
        System.out.println("1. Perimetro");
        System.out.println("2. Área \n");
        
        int E = S.nextInt();
        
        if (E == 1){
            Peri = true;
        }
        
        System.out.println("Favor de seleccionar la figura: ");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Cuadrado");
        
        E = S.nextInt();
        
        switch (E){
            case 1:
                System.out.print("Favor de ingresar el radio: ");
                D = S.nextDouble();
                Circle C = new Circle(D);
                if(Peri){
                    D = C.getPerimeter();
                }
                
                else{
                    D = C.getArea();
                    
                }
                System.out.print("El resultado es:" + D + "\n");
                break;
                
            case 2:
                System.out.print("Favor de ingresar el lado: ");
                D = S.nextDouble();
                Triangle T = new Triangle(D);
                if(Peri){
                    D = T.getPerimeter();
                }
                
                else{
                    D = T.getArea();
                }
                System.out.print("El resultado es:" + D + "\n");
                break;
                
            default:
                System.out.print("Favor de ingresar el lado: ");
                D = S.nextDouble();
                Square Sq = new Square(D);
                if(Peri){
                    D = Sq.getPerimeter();
                }
                
                else{
                    D = Sq.getArea();
                }
                
                System.out.print("El resultado es: " + D + "\n");
                break;
        }
        
    }
    
}
