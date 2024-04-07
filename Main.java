import Geometry.Point;
import Geometry.Rectangle;
import Geometry.Circle;
import Geometry.ColoredCircle;

public class Main {
            public static void main(String[] args) {

                Circle[] circles = new Circle[3];
                circles[0] = new Circle(new Point(1.0, 2.0), 3.0);
                circles[1] = new ColoredCircle(new Point(2.0, 3.0), 4.0, "red");
                circles[2] = new Circle(new Point(3.0, 4.0), 5.0);
                
                for (Circle circle : circles) {
                    double area = circle.getArea();
                    System.out.println("Pole powierzchni koła: " + area);
                
                    if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle; 
                System.out.println("Kolor koła: " + coloredCircle.getColor());
                    }
                }

                Point point = new Point(3.9, 3.1);
                Point center = new Point(3.0, 4.0);

                Circle circle = new Circle(center, 5.0);

                ColoredCircle coloredCircle = new ColoredCircle(center, 6.0, "blue");

                Rectangle rectangle = new Rectangle(3, 5);
                
                point.setX(4.1);
                point.setY(2.2);

                System.out.println(" ");
                System.out.println("Współrzędne punktu: (x:" + point.getX() + ", y:" + point.getY() + ")");
                System.out.println(" ");
                System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
                System.out.println("Promień koła: " + circle.getRadius());
                System.out.println("Obwód koła: " + circle.calculatePerimeter());
                System.out.println("Pole powierzchni koła: " + circle.getArea());
                System.out.println(" ");
                System.out.println("Właściwości kola:");
                System.out.println("Środek koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
                System.out.println("Promień koła: " + coloredCircle.getRadius());
                System.out.println("Kolor koła: " + coloredCircle.getColor());
                System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
                System.out.println("Pole powierzchni koła: " + coloredCircle.getArea());
                System.out.println(" ");
                System.out.println("Właściwości prostokąta:");
                System.out.println("Długość: " + rectangle.getLength());
                System.out.println("Szerokość: " + rectangle.getWidth());
                System.out.println("Pole: " + rectangle.calculateArea());
                System.out.println("Obwód: " + rectangle.calculatePerimeter());
            }
        }
