package DesignPatterns.CompositeDesignPattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println( "Composite Design Pattern ");

        // Create the files
        FileSystemComponent file1 = new File("file1", 100);
        FileSystemComponent file2 = new File("file1", 200);
        FileSystemComponent file3 = new File("file1", 300);
        FileSystemComponent file4 = new File("file1", 500);

        //Create directory
        Directory root = new Directory("rootFolder");
        Directory directory1 = new Directory("folder1");
        Directory directory2 = new Directory("folder2");

        // Add files to directory1

        directory1.addComponent(file1);
        directory1.addComponent(file2);

        // Add files to directory2

        directory2.addComponent(file3);


        // adding directory2 to directory1

        directory1.addComponent(directory2);

      root.addComponent(directory1);
      root.addComponent(file4);
    // get total size
        int totalsize = root.getSize();

        System.out.println( "Total size of the root : " + totalsize);
        System.out.println( "Name  : " + root.getName());

        System.out.println( "name : " + directory2.getName() +" and size : "+directory2.getSize());
    }
}
