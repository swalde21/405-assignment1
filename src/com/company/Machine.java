package com.company;

import javafx.util.Pair;

public class Machine {
    public Machine() {
    }

    public Performance getTapeToDisk() {
        return tapeToDisk;
    }

    public void setTapeToDisk(Performance tapeToDisk) {
        this.tapeToDisk = tapeToDisk;
    }

    public Performance getDiskToMemory() {
        return diskToMemory;
    }

    public void setDiskToMemory(Performance diskToMemory) {
        this.diskToMemory = diskToMemory;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getInputSize() {
        return inputSize;
    }

    public void setInputSize(int inputSize) {
        this.inputSize = inputSize;
    }

    public int getDMA() {
        return dmaSize;
    }

    public void setDMA(int dma) {
        this.dmaSize = dma;
    }

    Performance tapeToDisk, diskToMemory;
    int diskSize;
    int memorySize;
    int inputSize;
    int dmaSize;

    public int getAvailableDiskSize() {
        return availableDiskSize;
    }

    public void setAvailableDiskSize(int availableDiskSize) {
        this.availableDiskSize = availableDiskSize;
    }

    int availableDiskSize;
    @Override
    public String toString() {
        return "Machine{" +
                "tapeToDisk=" + tapeToDisk +
                ", diskToMemory=" + diskToMemory +
                ", diskSize=" + diskSize +
                ", memorySize=" + memorySize +
                ", inputSize=" + inputSize +
                ", dmaSize=" + dmaSize +
                ", availableDiskSize=" + availableDiskSize +
                '}';
    }
}
