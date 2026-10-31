package enums;

public enum Shape {
    SQUARE {
        @Override
        public double calculateArea(double a, double b) {
            return a*a;
        }
    },

    RECTANGLE {
        @Override
        public double calculateArea(double a, double b) {
            return a*b;
        }
    },

    TRIANGLE {
        @Override
        public double calculateArea(double a, double b) {
            return (a*b)/2;
        }
    };

    public abstract double calculateArea(double a, double b);
}
