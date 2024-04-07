        public class Main {
            public static void main(String[] args) {
                Point point = new Point(3.9, 3.1);

                point.setX(4.1);
                point.setY(2.2);
                
                System.out.println("Współrzędne punktu: (x:" + point.getX() + ", y:" + point.getY() + ")");
            }
        }
