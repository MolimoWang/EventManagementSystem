package org.work1.eventmanagement.exception;


public class ServiceException extends Exception {
    private String msg;
    public ServiceException(String msg) {
        super(msg);
    }

    public String getMsg() {
        return msg;
    }
}
