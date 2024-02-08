package com.example.jawadmughalfinalmadhpractice;

public class Model {
    String modelName , modelDescription;
    int modelImg;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public int getModelImg() {
        return modelImg;
    }

    public void setModelImg(int modelImg) {
        this.modelImg = modelImg;
    }

    public Model(String modelName, String modelDescription, int modelImg) {
        this.modelName = modelName;
        this.modelDescription = modelDescription;
        this.modelImg = modelImg;
    }
}
