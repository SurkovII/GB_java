import java.util.logging.*;
public class Log {
    public static void main(String[] args) {
    Logger logger = Logger.getLogger(Log.class.getName());
    logger.setLevel(Level.INFO);
    ConsoleHandler ch = new ConsoleHandler();
    logger.addHandler(ch);
    XMLFormatter xml = new XMLFormatter();
    ch.setFormatter(xml);
    }

    public void info(String string) {
        System.out.println(string);
    }

    public void log(Level WARNING, String string) { 
        System.out.printf("WARNING! " + string + "\n");
    }

    public void addHandler(ConsoleHandler ch) {
    }
}
