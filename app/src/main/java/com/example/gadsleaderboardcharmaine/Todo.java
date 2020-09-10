package com.example.gadsleaderboardcharmaine;

import androidx.annotation.NonNull;

public class Todo {



    private String Name;
    private String LearningHours= "/api/hours";
    private String SkillIq = "/api/skilliq";
    private int Photo;
    public Todo(String learner, String l, int learning_hours) {
    }




    public Todo(String name, String learningHours, String skillIq, int photo){
        Name = name;
        Photo = photo;
        LearningHours = learningHours;
    }
    public String getSkillIq() {
        return SkillIq;
    }

    public String getName() {
        return Name;
    }
    public int getPhoto() {
        return Photo;
    }


    public String getLearningHours() {
        return LearningHours;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setPhoto(int photo) {
        Photo = photo;
    }
    public void setLearningHours(String learningHours) {
        LearningHours = learningHours;
    }
    public void setSkillIq(String skillIq) {
        SkillIq = skillIq;
    }

    @NonNull
    @Override
    public String toString() {

        return super.toString();
    }
}
