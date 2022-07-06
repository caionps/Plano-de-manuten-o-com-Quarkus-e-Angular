package org.caio.dto;

public class MsgRetorno {

    private String msg;
    private Object data;
    private String cause;

    public MsgRetorno (String msg) {
        this.msg = msg;
    }

    public MsgRetorno (String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }
}
