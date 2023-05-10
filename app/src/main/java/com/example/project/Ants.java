package com.example.project;

public class Ants {
    private String name;
    private String category;
    private int size;


    public Ants(String name, String location, int  height) {

        this.name = name;
        this.category = category;
        this.size = size;
    }

    @Override
    public String toString() {
        String printItem= "Namn: "+ name+" Art: "+category+" Antal: "+size;
        return printItem;
    }
}
