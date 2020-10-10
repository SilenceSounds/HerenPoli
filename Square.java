package herenpoli;

/**
 *
 * @author Sayad
 */
public class Square implements Shape{
    
    double Base;
    
    public Square(double Base){
        this.Base = Base;
    }

    @Override
    public double getArea() {
        return Base*Base;
    }

    @Override
    public double getPerimeter() {
        return Base*4;
    }
    
}
