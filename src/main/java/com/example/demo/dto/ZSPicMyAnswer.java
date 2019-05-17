package com.example.demo.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ZSPicMyAnswer {
    private String askUserName;
    private String subject;
    private String ok;
    private String introduce;
    private String answerTime;
    private int picAnswerId;




    public String getAskUserName() {
        return askUserName;
    }

    public void setAskUserName(String askUserName) {
        this.askUserName = askUserName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date appTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        this.answerTime = simpleDateFormat.format(appTime);
    }

    public int getPicAnswerId() {
        return picAnswerId;
    }

    public void setPicAnswerId(int picAnswerId) {
        this.picAnswerId = picAnswerId;
    }



}
