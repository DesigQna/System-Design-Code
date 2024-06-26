package DesignPatterns.builderDesignPattern;

public class Client {

    public static void main(String[] args) {



        User user1 = new User.UserBuilder()
                .setUserId("1")
                .setUserName("Kumar")
                .setEmail("k@gamil.com")
                .setCity("Mumbai")
                .setState("MH")
                .build();

        System.out.println( user1.toString());

        User user2= new User.UserBuilder()
                .setUserId("2")
                .setUserName("Raj")
                .setEmail("raj@gmail.com")


                .build();
        System.out.println(user2.toString());
    }
}
