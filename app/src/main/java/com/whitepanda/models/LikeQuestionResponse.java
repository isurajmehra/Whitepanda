package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ankit on 5/31/2017.
 */

public class LikeQuestionResponse {

    @Expose
    @SerializedName("done")
    public String done;
    @Expose
    @SerializedName("msg")
    public String msg;
    @Expose
    @SerializedName("code")
    public int code;

    public LikeQuestionResponse(String done, String msg, int code) {
        this.done = done;
        this.msg = msg;
        this.code = code;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "LikeQuestionResponse{" +
                "done='" + done + '\'' +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }
}
