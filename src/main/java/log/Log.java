package log;

/**
 * Created by mohammad hosein on 6/29/2015.
 */
public class Log {
    private Log log;
    public static Log createLog(){
        this.log = new Log();
        return this.log;
    };
    public static void print(String s)
    {
        this.log.printLog(s);
//        System.out.println(s);
    }

    public void printLog(String s){
        // System.out.println(s);
    }
}
