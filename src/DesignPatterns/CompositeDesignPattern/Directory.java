package DesignPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements  FileSystemComponent{

    private  String name;
    private List<FileSystemComponent> components;

    public  Directory (String name){
        this.name= name;
        components = new ArrayList<>();
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {

        int totalSize=0;
        for (FileSystemComponent component: components) {
                   totalSize+=component.getSize();
        }
        return totalSize;
    }
   public  void  addComponent(FileSystemComponent component){
        components.add(component);
   }

}
