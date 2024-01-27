// https://exercism.org/tracks/java/exercises/log-levels/

public class LogLevels {
    
    public String message(String logLine) {
        String msg = logLine.split(":")[1].trim();
        return msg;
    }

    public String logLevel(String logLine) {
        String lvl = logLine.split(":")[0];
        String formattedLvl = lvl.substring(1, lvl.length() - 1).toLowerCase();
        return formattedLvl;
    }
    
    public String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    } 

    public static void main (String[] args) {
        LogLevels logger = new LogLevels();
        System.out.println(logger.message("[WARNING]:  Disk almost full\r\n"));
        System.out.println(logger.logLevel("[WARNING]:  Disk almost full\r\n"));
        System.out.println(logger.reformat("[WARNING]:  Disk almost full\r\n"));
    }
}