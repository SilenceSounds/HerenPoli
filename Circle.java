package herenpoli;

/**
 *
 * @author Sayad
 */
public class Circle implements Shape{

    double radio;
    
    public Circle(double radio){
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 3.1416*(radio*radio);
    }

    @Override
    public double getPerimeter() {
        return 3.1416*2*radio;
    }
    
}
