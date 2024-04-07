        class Point {
            private double x;
            private double y;
        
            public Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
        
            public double getX() {
                return x;
            }
        
            public double getY() {
                return y;
            }
        
            public void setX(double x) {
                this.x = x;
            }
        
            public void setY(double y) {
                this.y = y;
            }
        }
        
        public class Main {
            public static void main(String[] args) {
                Point point = new Point(3.9, 3.1);
                System.out.println("Współrzędne punktu: (" + point.getX() + ", " + point.getY() + ")");
            }
        }
