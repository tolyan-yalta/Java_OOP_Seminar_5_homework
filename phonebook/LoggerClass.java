package phonebook;

import java.util.logging.*;

public class LoggerClass {
    public static Logger logger = Logger.getGlobal();
    static {
        try {
            LogManager.getLogManager().readConfiguration(
            Program.class.getResourceAsStream("log.config"));
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
}
