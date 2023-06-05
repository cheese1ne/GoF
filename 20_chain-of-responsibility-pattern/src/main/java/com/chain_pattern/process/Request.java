package com.chain_pattern.process;

/**
 * @author sobann
 */
public class Request {
    private String requestType;
    private int number;
    private String requestContent;

    public String getRequestType() {
        return this.requestType;
    }

    public int getNumber() {
        return number;
    }

    public String getRequestContent() {
        return this.requestContent;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }
}
