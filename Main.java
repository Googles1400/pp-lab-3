import Geometry.Point;
import Geometry.Circle;

public class Main {
            public static void main(String[] args) {
                Point point = new Point(3.9, 3.1);
                Point center = new Point(3.0, 4.0);
                Circle circle = new Circle(center, 5.0);

                point.setX(4.1);
                point.setY(2.2);
                
                System.out.println("Współrzędne punktu: (x:" + point.getX() + ", y:" + point.getY() + ")");
                System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
                System.out.println("Promień koła: " + circle.getRadius());
                System.out.println("Obwód koła: " + circle.calculatePerimeter());
                System.out.println("Pole powierzchni koła: " + circle.getArea());
            }
        }
