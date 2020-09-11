package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Job {
    public Job() {
    }
    public Job(String name, ArrayList<Integer> data) {
        this.name = name;
        this.dataList = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getDataList() {
        return dataList;
    }

    public void addData(int data) {
        this.dataList.add(data);
    }

    String name;
    ArrayList<Integer> dataList =new ArrayList<>();
    int progressCounter =0;

    public int getProgressCounter() {
        return progressCounter;
    }

    public void setProgressCounter(int progressCounter) {
        this.progressCounter = progressCounter;
    }
    public void run() {
        //only add even indexes from data (cpu)
        for(int i=0; i<dataList.size(); i+=2) {
            addProgress(dataList.get(i));
        }
    }
    public void addProgress(int progress) {
        this.progressCounter += progress;
    }
    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", dataList=" + dataList +
                '}';
    }
}
