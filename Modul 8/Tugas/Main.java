package shape;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Circle circle = new Circle(5.0f, 10);
        circle.draw();
        circle.setRadius(7.0f);
        System.out.println("Circle area: " + circle.area());

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Window window = new Window();
        window.open();

        Event event = new Event();
        event.trigger();
    }
}
