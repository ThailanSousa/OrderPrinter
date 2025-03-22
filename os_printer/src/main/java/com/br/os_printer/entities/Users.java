package main.java.com.br.os_printer.entities;

public abstract class  Users {
    
    String username;
    String password;
    UserRole role;


    public Users(){}
    
    public Users(String username, String password, UserRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserRole getRole() {
        return role;
    }
    public void setRole(UserRole role) {
        this.role = role;
    }
    

    
}
