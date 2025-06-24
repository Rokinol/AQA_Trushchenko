package Lesson_4;

interface GeometricFigures {
    double calculateArea();

    String getFillColor();

    String getBorderColor();

    default double calculatePerimeter() {
        return 0.0;
    }

    default void printInfo() {
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("------");
    }

    class Circle implements GeometricFigures {
        private double radius;
        private String fillColor;
        private String borderColor;

        public Circle(double radius, String fillColor, String borderColor) {
            this.radius = radius;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public String getFillColor() {
            return fillColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }

    class Rectangle implements GeometricFigures {
        private double width;
        private double height;
        private String fillColor;
        private String borderColor;

        public Rectangle(double width, double height, String fillColor, String borderColor) {
            this.width = width;
            this.height = height;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }

        @Override
        public String getFillColor() {
            return fillColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }

    class Triangle implements GeometricFigures {
        private double sideA;
        private double sideB;
        private double sideC;
        private String fillColor;
        private String borderColor;

        public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double calculateArea() {
            //Формула Герона(известны все стороны)
            double p = calculatePerimeter() / 2;
            return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        }

        @Override
        public double calculatePerimeter() {
            return sideA + sideB + sideC;
        }

        @Override
        public String getFillColor() {
            return fillColor;
        }

        @Override
        public String getBorderColor() {
            return borderColor;
        }
    }
}
