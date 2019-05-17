package com.example.demo.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SpecificPicAnswer {
    //pic界面显示信息
    private int picAnswerId;
    private String subject;
    private String originUserId;

    private String originUserName;
    private String answerUserId;
    private String answerUserName;
    private String askTime;
    private String answerTIme;
    private List<String> imgs;
    private int count;
    private int sum;



    public int getPicAnswerId() {
        return picAnswerId;
    }

    public void setPicAnswerId(int picAnswerId) {
        this.picAnswerId = picAnswerId;
    }

    public String getAnswerUserName() {
        return answerUserName;
    }

    public void setAnswerUserName(String answerUserName) {
        this.answerUserName = answerUserName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOriginUserId() {
        return originUserId;
    }

    public void setOriginUserId(String originUserId) {
        this.originUserId = originUserId;
    }

    public String getAnswerUserId() {
        return answerUserId;
    }

    public void setAnswerUserId(String answerUserId) {
        this.answerUserId = answerUserId;
    }

    public String getOriginUserName() {
        return originUserName;
    }

    public void setOriginUserName(String originUserName) {
        this.originUserName = originUserName;
    }



    public String getAskTime() {
        return askTime;
    }

    public void setAskTime(Date askTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        this.askTime = simpleDateFormat.format(askTime);
    }

    public String getAnswerTIme() {
        return answerTIme;
    }

    public void setAnswerTIme(Date answerTIme) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        this.answerTIme = simpleDateFormat.format(answerTIme);
    }

    public List<String> getImgs() {
        return imgs;
    }

    public void setImgs(List<String> imgs) {
        this.imgs = imgs;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }




}
