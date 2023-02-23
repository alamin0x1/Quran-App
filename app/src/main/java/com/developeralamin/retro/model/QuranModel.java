package com.developeralamin.retro.model;

public class QuranModel {


     String  nameEnglish, nameBengali;

    public QuranModel() {
    }

    public QuranModel(String nameEnglish, String nameBengali) {
        this.nameEnglish = nameEnglish;
        this.nameBengali = nameBengali;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public String getNameBengali() {
        return nameBengali;
    }

    public void setNameBengali(String nameBengali) {
        this.nameBengali = nameBengali;
    }
}
