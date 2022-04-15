package com.animesh.roy.exportjson;

public class Holidays {

    private final String name;
    private final String subject;
    private final String qualification;
    private final String profileImage;

    public Holidays(String name, String subject, String qualification, String profileImage) {
        this.name = name;
        this.subject = subject;
        this.qualification=qualification;
        this.profileImage=profileImage;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getQualification() {
        return qualification;
    }

    public String getProfileImage() {
        return profileImage;
    }

}
