package ua.com.juja.study.core.presentation.exception;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 11/4/14
 * Time: 12:07 PM
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        validateCmdOptionSystemExit(new String[] {"-u"});
        // continue valid program flow
        System.out.println("continue valid program flow");
    }

    private static int validateCmdOptionWithErrorCode(String[] args) {
        boolean[] argumentsPresent = new boolean[4];
        for (int i = 0; i < args.length; i++) {
            if ("-u".equals(args[i])) {
                argumentsPresent[0] = true;
            } else if ("-p".equals(args[i])) {
                argumentsPresent[1] = true;
            } else if ("-url".equals(args[i])) {
                argumentsPresent[2] = true;
            } else if ("-d".equals(args[i])) {
                argumentsPresent[3] = true;
            }
        }

        int errorCode = 0;
        for (int i = 0; i < argumentsPresent.length; i++) {
            if (!argumentsPresent[i]) {
                errorCode = i + 1;
                break;
            }
        }
        return errorCode;
    }

    private static void validateCmdOptionSystemExit(String[] args) {

        for (int i = 0; i < args.length; i++) {
            if ("-u".equals(args[i])) {
                throw new IllegalArgumentException("Absent argument user");
            } else if ("-p".equals(args[i])) {
                throw new IllegalArgumentException("Absent argument password");
            } else if ("-url".equals(args[i])) {
                throw new IllegalArgumentException("Absent argument db url");
            } else if ("-d".equals(args[i])) {
                throw new IllegalArgumentException("Absent argument driver");
            }
        }
    }

}
