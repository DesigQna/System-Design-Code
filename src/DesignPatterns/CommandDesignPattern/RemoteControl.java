package DesignPatterns.CommandDesignPattern;

import java.util.Stack;

public class RemoteControl {

    private  Command command;
    private Stack<Command> commandsHistory;


    public  RemoteControl (){
        commandsHistory= new Stack<>();
    }

    public  void setCommand (Command command){
        this.command= command;

    }


    public  void pressButton(){
        command.execute();
        commandsHistory.push(command);
    }
    public  void pressUndoButton(){

        if(!commandsHistory.isEmpty()){
            Command lastCommand= commandsHistory.pop();
            lastCommand.undo();
        }else{
            System.out.println( "NO Commands to Undo ....");
        }
    }
}
