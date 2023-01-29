package phonebook;

import java.util.logging.*;

public class Program {
    public static void main(String[] args) {
        
        LoggerClass.logger.log(Level.INFO, "Start program");

        Menu.menu();

        LoggerClass.logger.log(Level.INFO, "Stop program");
    }
    
}
