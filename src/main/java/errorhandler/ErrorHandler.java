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
        if (errorhandler == null){
            createErrorHandler();
        }
        errorhandler.printError(msg);
    }

    public void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}
