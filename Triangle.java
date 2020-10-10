package herenpoli;
/**
 *
 * @author Sayad
 */
public class Triangle implements Shape {

    double Lado;
    public Triangle(double Lado){
        this.Lado = Lado;
    }

    @Override
    public double getArea() {
        return ((Math.sqrt(3))/4)*(Lado*Lado);
    }

    @Override
    public double getPerimeter() {
        return Lado*3;
    }
    
}
