package shape;

class Circle extends Shape {
    private float radius;
    private int center;

    public Circle(float radius, int center) {
        this.radius = radius;
        this.center = center;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }

    @Override
    public void move() {
        System.out.println("Moving Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }
}

