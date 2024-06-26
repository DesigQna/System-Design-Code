package DesignPatterns.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NetworkConnection implements Cloneable {

    private String ip;
    private  String importantData;

    List<String> domainList= new ArrayList<>();

    // getters and setter constructor


    public List<String> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<String> domainList) {
        this.domainList = domainList;
    }

    public NetworkConnection() {

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public  void loadImportantData() throws InterruptedException {

        Thread.sleep(5000);
        List<String > domains= new ArrayList<>();
        domains.add("www.google.com");
        domains.add("www.yt.com");
        domains.add("www.redbus.com");

        this.domainList= domains;
        this.importantData="Very very important ";
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domainList=" + domainList +
                '}';
    }

    protected Object Clone()throws CloneNotSupportedException{


        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp(this.getIp());

        networkConnection.setImportantData(this.getImportantData());
        for (String d:this.getDomainList()
             ) {
            networkConnection.getDomainList().add(d);
        }
        return networkConnection;
   }

}
