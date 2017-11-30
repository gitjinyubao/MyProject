package com.augmentum.oes.model;

import java.io.Serializable;

public class Questions implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String idNumber;
    private String queScore;
    private String queTitle;
    private String queA;
    private String queB;
    private String queC;
    private String queD;
    private String queAnswer;
    private String queCreateTime;
    private String queEditTime;
    private String queUpdateTime;
    private int contSysId;
    private int status;

    public String getQueUpdateTime() {
        return queUpdateTime;
    }

    public void setQueUpdateTime(String queUpdateTime) {
        this.queUpdateTime = queUpdateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Questions(int id, String idNumber, String queScore,
            String queA, String queB,
            String queC, String queD, String queAnswer,
            String queCreateTime, String queEditTime, int contSysId,
            String queTitle) {
        super();
        this.id = id;
        this.idNumber = idNumber;
        this.queScore = queScore;
        this.queA = queA;
        this.queB = queB;
        this.queC = queC;
        this.queD = queD;
        this.queAnswer = queAnswer;
        this.queCreateTime = queCreateTime;
        this.queEditTime = queEditTime;
        this.contSysId = contSysId;
        this.queTitle = queTitle;
    }

    public Questions(String idNumber,
            String queA, String queB,
            String queC, String queD, String queAnswer,
            int contSysId,
            String queTitle) {
        super();
        this.idNumber = idNumber;
        this.queA = queA;
        this.queB = queB;
        this.queC = queC;
        this.queD = queD;
        this.queAnswer = queAnswer;
        this.contSysId = contSysId;
        this.queTitle = queTitle;
    }

    public Questions() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getQueScore() {
        return queScore;
    }

    public void setQueScore(String queScore) {
        this.queScore = queScore;
    }

    public String getQueTitle() {
        return queTitle;
    }

    public void setQueTitle(String queTitle) {
        this.queTitle = queTitle;
    }

    public String getQueA() {
        return queA;
    }

    public void setQueA(String queA) {
        this.queA = queA;
    }

    public String getQueB() {
        return queB;
    }

    public void setQueB(String queB) {
        this.queB = queB;
    }

    public String getQueC() {
        return queC;
    }

    public void setQueC(String queC) {
        this.queC = queC;
    }

    public String getQueD() {
        return queD;
    }

    public void setQueD(String queD) {
        this.queD = queD;
    }

    public String getQueAnswer() {
        return queAnswer;
    }

    public void setQueAnswer(String queAnswer) {
        this.queAnswer = queAnswer;
    }

    public String getQueCreateTime() {
        return queCreateTime;
    }

    public void setQueCreateTime(String queCreateTime) {
        this.queCreateTime = queCreateTime;
    }

    public String getQueEditTime() {
        return queEditTime;
    }

    //@JsonDeserialize(using = FullDate2StringSerialize.class)
    public void setQueEditTime(String queEditTime) {
        this.queEditTime = queEditTime;
    }

    public int getContSysId() {
        return contSysId;
    }

    public void setContSysId(int contSysId) {
        this.contSysId = contSysId;
    }

}
