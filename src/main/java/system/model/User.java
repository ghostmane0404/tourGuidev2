package system.model;

public class User {

    private int id;
    private String name;
    private String surname;
    private String phone;
    private String mast;
    private String password;
    private String login;
    private boolean isWorking;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        return  "User:" + "\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Phone: " + phone + "\n" +
                "Mast: " + mast + "\n" +
                "Password: " + password + "\n" +
                "isWorking: " + isWorking + "\n";
    }
}
