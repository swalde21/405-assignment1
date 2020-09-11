package com.company;

public class Performance {
    public int getChunksOfData() {
        return chunksOfData;
    }

    public void setChunksOfData(int chunksOfData) {
        this.chunksOfData = chunksOfData;
    }

    public int getUnitsOfTime() {
        return unitsOfTime;
    }

    public void setUnitsOfTime(int unitsOfTime) {
        this.unitsOfTime = unitsOfTime;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "chunksOfData=" + chunksOfData +
                ", unitsOfTime=" + unitsOfTime +
                '}';
    }

    int chunksOfData;
    int unitsOfTime;

    public Performance(int chunksOfData, int unitsOfTime) {
        this.chunksOfData = chunksOfData;
        this.unitsOfTime = unitsOfTime;
    }

    public Performance() {
    }
}
