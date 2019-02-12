package task2;

import java.util.ArrayList;
import java.util.List;

public class ManagerCommand {
    List<Command> commandList = new ArrayList<>();

    private String nameC;
    private String nameA;

    public ManagerCommand(String nameC, String nameA){
        this.nameC = nameC;
        this.nameA = nameA;
    }

    public void switchCommands(){
        switch (nameC){
            case "lambda" :
                commandList.add( n -> System.out.println("labmda :"+n));
                break;
            case "anonymous" :
                commandList.add(new Command() {
                    @Override
                    public void execute(String nameA) {
                        System.out.println("anonymous :"+nameA);
                    }
                });
                break;
            case "method" :
                commandList.add(new Functional("method")::execute);
                break;
            case "class":
                commandList.add(new Functional("class"));
        }
    }
    public void run(){
        for(Command command:commandList){
            command.execute(nameA);
        }
    }
}
