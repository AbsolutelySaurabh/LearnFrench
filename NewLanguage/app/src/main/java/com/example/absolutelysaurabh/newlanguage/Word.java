package com.example.absolutelysaurabh.newlanguage;

/**
 * Created by absolutelysaurabh on 24/2/17.
 */

public class Word {

    private String DefaultTranslation;
    private String FrenchTranslation;
    private int AudioResourceId;
    private int ImageResourceId=-1;

    Word(String DefaultTranslation, String FrenchTranslation){
        //This constructor is for phrases intent CONSTRUCTIR OVERLOADING
        this.DefaultTranslation=DefaultTranslation;
        this.FrenchTranslation=FrenchTranslation;
    }

    Word(String DefaultTranslation, String FrenchTranslation,int ImageResourceId,int audioResourceId){

        this.DefaultTranslation=DefaultTranslation;
        this.FrenchTranslation=FrenchTranslation;
        this.ImageResourceId=ImageResourceId;
        this.AudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){

        return DefaultTranslation;
    }
    public String getFrenchTranslation() {
        return FrenchTranslation;
    }
    public int getImageResourceId(){
        return ImageResourceId;
    }
    public boolean hasImage(){

       return ImageResourceId!=-1;
    }

    //Returns Audio resource id;

    public int getAudioResourceId(){
        return AudioResourceId;
    }

}
