package log;

/**
 * Created by mohammad hosein on 6/29/2015.
 */
public class Log {
    private static Log log = null;
    public static Log createLog(){
        log = new Log();
        return this.log;
    };
    public static void print(String s)
    {
        log.printLog(s);
//        System.out.println(s);
    }

    public void printLog(String s){
        // System.out.println(s);
    }
}
