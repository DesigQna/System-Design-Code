package DesignPatterns.SIngletonDesignPattern;

public class Singleton {
      private static int counter=0;
      private static Singleton instance=null;

    // Constructor
   private  Singleton(){
     counter++;
        System.out.println("Instance created " +counter);
    }
    // some methods

   // public static  Singleton getInstance(){
//        Singleton instance = new Singleton();
//        return instance;

//        if(instance==null){
//            instance= new Singleton();
//        }
//        return instance;
  //  }


    // handle multi threads

    public static  Singleton getInstance(){

       if(instance==null){
           synchronized (Singleton.class){
               if(instance==null){
                   instance=new Singleton();
               }
           }
       }
       return instance;
    }
    public void  printMessage(String message){

        System.out.println(message);
    }
}
