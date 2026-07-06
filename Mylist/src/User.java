//标准JavaBeen
public class User {
    //用户属性为id,username,password
    private String id;
    private String Username;
    private String password;

    public User(){}

    public User(String username, String id, String password) {
        Username = username;
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
