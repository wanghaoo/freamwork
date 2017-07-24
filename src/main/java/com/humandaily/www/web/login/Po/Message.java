package com.humandaily.www.web.login.Po;

/**
 * Created by datadriver on 2017/7/13.
 */
public class Message {
    private String messageBody;

    public Message() {}

    public Message(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
