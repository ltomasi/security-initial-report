package models.exception;

public class InvalidW3afReportException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidW3afReportException(String message) {
        super(message);
    }

    public InvalidW3afReportException(String message, Throwable cause) {
        super(message, cause);
    }
}
