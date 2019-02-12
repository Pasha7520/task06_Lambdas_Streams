package task2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter command");
        String nameC = scanner.nextLine();
        System.out.println("enter argument");
        String nameA = scanner.nextLine();

        ManagerCommand managerCommand = new ManagerCommand(nameC,nameA);
        managerCommand.switchCommands();
        managerCommand.run();
    }
}
