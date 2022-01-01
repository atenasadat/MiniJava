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
    public void print(String s)
    {
//        System.out.println(s);
    }
}
