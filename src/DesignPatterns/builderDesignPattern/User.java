package DesignPatterns.builderDesignPattern;

public class User {


    private final  String userId;
    private final String userName;
    private final String email;
    private final String city;
    private final String  state;


    // Cons & getters

    private  User ( UserBuilder builder){
        this.userId= builder.userId;
        this.userName= builder.userName;
        this.email= builder.email;
        this.city= builder.city;
        this.state= builder.state;

    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    // Inner class to create object

    public  static  class UserBuilder{
        private   String userId;
        private  String userName;
        private  String email;
        private String city;
        private  String  state;

        public  UserBuilder(){

        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return  this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return  this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return  this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setState(String state) {
            this.state = state;
            return  this;
        }
        public  User build(){

            User user= new User(this);
            return  user;
        }
    }



}
