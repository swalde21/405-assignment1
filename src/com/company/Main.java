package com.company;

import javafx.util.Pair;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Machine m = new Machine();
        try {
            Scanner scanner = new Scanner(new File("jobs.dat"));
            //Set machine specs
            m.setTapeToDisk(new Performance(scanner.nextInt(), scanner.nextInt()));
            m.setDiskSize(scanner.nextInt());
            m.setAvailableDiskSize(m.getDiskSize());
            m.setDiskToMemory(new Performance(scanner.nextInt(), scanner.nextInt()));
            m.setMemorySize(scanner.nextInt());
            m.setInputSize(scanner.nextInt());
            m.setDMA(scanner.nextInt());
            //Read jobs
            while (scanner.hasNextLine()) {
                Job j = new Job();
                //Get the name
                j.setName(scanner.next());
                //Split the string and the data
                String[] parts = scanner.nextLine().trim().split(" ");
                for(int i=0; i<parts.length; i++)
                    j.addData(Integer.parseInt(parts[i]));

                //Move from tape to disk
                Performance tapeToDiskPerformance = m.getTapeToDisk();
                for(int i=0; i<j.dataList.get(0); i+=tapeToDiskPerformance.chunksOfData) {
                    j.addProgress(tapeToDiskPerformance.unitsOfTime);
                    m.setAvailableDiskSize(m.getAvailableDiskSize()-tapeToDiskPerformance.chunksOfData);
                }

                //Move from disk to memory
                Performance diskToMemoryPerformance = m.getDiskToMemory();
                for(int i=0; i<j.dataList.get(0); i+=diskToMemoryPerformance.chunksOfData) {
                    j.addProgress(diskToMemoryPerformance.unitsOfTime);
                    m.setAvailableDiskSize(m.getAvailableDiskSize()+diskToMemoryPerformance.chunksOfData);
                }

                //Run the job
                j.run();


                System.out.println(j.getName() + " has completed running at " +
                        j.getProgressCounter() + " units of time.");

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
