package tugas;

public class User {
    private String name;
    private java.time.LocalDateTime registrationDate;

    public User(String name, java.time.LocalDateTime registrationDate) {
        this.name = name;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public java.time.LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
}

