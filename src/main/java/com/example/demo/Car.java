package com.example.demo;
public class Car extends Vehicle{
    private String modelName;
    private String color;


    private String mph;


    public String start(){
        return "The "+color+" "+modelName+" is starting";
    }
    public String stop(){
        return "The "+color+" "+modelName+" is stopped";
    }

    public String mph(){
        return "The "+color+" "+modelName+" is going 50mph";
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

//public class Car {
//    private String modelName;
//    private String color;
//    private String mph;
//    private String accelerate;
//
//    public String getModelName() {
//        return modelName;
//    }
//
//    public void setModelName(String modelName) {
//        this.modelName = modelName;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getMph() {
//        return mph;
//    }
//
//    public void setMph(String mph) {
//        this.mph = mph;
//    }
//
//    public String getAccelerate() {
//        return accelerate;
//    }
//
//    public void setAccelerate(String accelerate) {
//        this.accelerate = accelerate;
//    }
//    public String start(){
//        return "The "+color+" "+modelName+" is starting";
//    }public String stop(){
//        return "The "+color+" "+modelName+" is stopped";
//    }
//    public String accelerate(){
//        return "The "+color+" "+modelName+" is accelerating";
//    }
//    public String mph(){
//        return "The "+color+" "+modelName+" is going 50mph";
//

//    public String getModelName() {
//      return modelName;
//    }
//
//   public void setModelName(String modelName) {
//       this.modelName = modelName;
//   }
//
//   public String getColor() {
//       return color;
//   }
//
//   public void setColor(String color) {
//        this.color = color;
//
//    private String accelerate;
//
//    public String getMph() {
//        return mph;
//    }
//
//    public void setMph(String mph) {
//        this.mph = mph;
//    }
//
//    private String mph;
//
//
//    public String start(){
//        return "The "+color+" "+modelName+" is starting";
//    }public String stop(){
//        return "The "+color+" "+modelName+" is stopped";
//    }
//    public String accelerate(){
//        return "The "+color+" "+modelName+" is accelerating";
//    }
//    public String mph(){
//        return "The "+color+" "+modelName+" is going 50mph";
////    }
////    public int accelerating;
//
//    public String getModelName() {
//        return modelName;
//    }
//
//    public void setModelName(String modelName) {
//        this.modelName = modelName;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//
//    public String getAccelerate() {
//        return accelerate;
//    }
//
//    public void setAccelerate(String accelerate) {
//        this.accelerate = accelerate;
//    }
//
//}
