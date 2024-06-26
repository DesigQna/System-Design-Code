package DesignPatterns.PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("Prototype design pattern..");


//        networkConnection.setIp("198.55.55.22");
//        networkConnection.loadImportantData();
//
//        System.out.println(networkConnection);
//
//// Shallow copy
//
//        NetworkConnection nc2= (NetworkConnection) networkConnection.Clone();
//
//
//        nc2.getDomainList().remove(0);
//        System.out.println(nc2);
//
//        System.out.println(networkConnection);



        // Deep copy

        NetworkConnection object1 = new NetworkConnection();

        object1.setIp("198.55.55.22");
        object1.loadImportantData();
        System.out.println("Before making changes ");
        System.out.println(object1);

        System.out.println("Object 2 ");

        NetworkConnection object2=(NetworkConnection) object1.Clone();

        System.out.println(object2);

        System.out.println("after  making changes ");
        object2.getDomainList().remove(0);
        System.out.println(object1);
        System.out.println(object2);

        object1.getDomainList().remove(1);
        System.out.println(object1);
        System.out.println(object2);







    }
}
