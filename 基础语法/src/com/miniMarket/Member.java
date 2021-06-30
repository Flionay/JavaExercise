package com.miniMarket;

public class Member {
    private String name;
    private int cardId;
    private String passwd;
    private int score;
    private String registDate;

    public Member(){}

    public Member(String name, int cardId, String passwd, int score, String registDate) {
        this.name = name;
        this.cardId = cardId;
        this.passwd = passwd;
        this.score = score;
        this.registDate = registDate;
    }

    public String getName() {
        return name;
    }

    public int getCardId() {
        return cardId;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getScore() {
        return score;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }
}
