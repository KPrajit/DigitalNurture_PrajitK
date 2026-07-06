public class Logger{
    private static Logger instant;
    private Logger() {
    }
    public static Logger getInstance(){
        if(instant == null){
            instant = new Logger();
        }
        return instant;
    }



    }
