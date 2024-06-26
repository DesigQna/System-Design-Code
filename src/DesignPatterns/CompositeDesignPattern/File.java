package DesignPatterns.CompositeDesignPattern;


// Leaf
public class File implements  FileSystemComponent {

    private  String name;
    private  int size;


    // constructor


    public  File (String name , int size){
        this.name=name;
        this.size=size;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
