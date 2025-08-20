package com.xworkz.passportseva.user;

public class PassportUser {
    private String cpvLocation;

    public String getCpvLocation() {
        return cpvLocation;
    }
        public void  setCpvLocation(String cpvLocation){
            this.cpvLocation=cpvLocation;
        }
    private String address;

    public String getAddress() {
        return address;
    }
    public void  setAddress(String address){
        this.address=address;
    }

    private String givenName;

    public String getGivenName(){
        return givenName;
    }
    public void setGivenName(String givenName){
        this.givenName=givenName;
    }
    private String emailId;

    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }
    private boolean isSameEmailId;
    public boolean getIsSameEmailId(){
        return isSameEmailId;
    }
    public void setIsSameEmailId(boolean isSameEmailId){
        this.isSameEmailId=isSameEmailId;
    }
    private String password;

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    private String cPassword;

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }
    private String hintQues;

    public String getHintQues() {
        return hintQues;
    }

    public void setHintQues(String hintQues) {
        this.hintQues = hintQues;
    }
    private String hintAns;

    public String getHintAns() {
        return hintAns;
    }

    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}



