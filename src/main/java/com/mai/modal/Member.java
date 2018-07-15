package com.mai.modal;

public class Member {
    private int idNum;  // 学号，忘了不能在前面加0... 所以显示的时候自己加个0
    private String name;  // 名字
    private int gender;  // 性别 男为0，女为1
    private String birthday; // 生日 为方便字符串型
    private String nativePlace;  // 籍贯
    private String nation;    // 民族
    private String idCardNum;  // 身份证号
    private String admissionTime;  // 确定成为党员时间
    private String educationBackground;  // 教育背景
    private String startTime;  //入学时间

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime;
    }

    public String getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(String educationBackground) {
        this.educationBackground = educationBackground;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String toString(){
        return "{"+"idNum:"+String.valueOf(idNum)+
                    "name:"+name+
                    "gender:"+String.valueOf(gender)+
                    "birthday:"+birthday+
                    "nativePlace:"+nativePlace+
                    "nation:"+nation+
                    "idCardNum:"+idCardNum+
                    "admissionTime:"+admissionTime+
                    "educationBackground:"+educationBackground+
                    "startTime:"+startTime+"}";

    }
}
//    private int idNum;
//    private String name;
//    private int gender;
//    private String birthday;
//    private String nativePlace;
//    private String nation;
//    private String idCardNum;
//    private String admissionTime;
//    private String educationBackground;
//    private String startTime;