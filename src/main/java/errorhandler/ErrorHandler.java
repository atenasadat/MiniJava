package errorhandler;

/**
 * Created by Alireza on 6/28/2015.
 */
public class ErrorHandler {
    public static boolean hasError = false;
    private static ErrorHandler errorhandler = null;

    private static ErrorHandler createErrorHandler(){
        errorhandler = new ErrorHandler();
        return errorhandler;
    }

    public static void printError(String msg) {
        errorhandler.printError(msg);
    }

    public void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}
