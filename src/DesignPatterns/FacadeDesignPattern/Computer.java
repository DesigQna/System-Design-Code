package DesignPatterns.FacadeDesignPattern;



// Facade class
public class Computer {

    private  CPU cpu ;
    private  Memory memory ;
    private  HardDrive hardDrive ;

    public  Computer (){
        this.cpu = new CPU();
        this.memory=new Memory();
        this.hardDrive= new HardDrive();
    }

    public  void  start(){
        cpu.start();
        memory.start();
        hardDrive.start();
        System.out.println( "Computer Started");
    }

    public  void  running(){

        System.out.println( "Computer running ");
    }

    public  void  stop(){

        cpu.stop();
        memory.stop();
        hardDrive.stop();

        System.out.println( "Computer stopped ");
    }
}
