package module1week3.board;

public class UserRegister {
    private String name;
    private String email;

    public UserRegister(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}