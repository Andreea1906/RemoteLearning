package com.nagarro.remotelearning.week7p4;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TrainTest {

     @Test
    public void testEqualObjectsStoredOnce() {
        Set<Train> trainSet = new HashSet<>();

        Train train1 = new Train(101, "Express", 10);
        Train train2 = new Train(102, "Local", 8);
        Train train3 = new Train(101, "Express", 10);


        trainSet.add(train1);
        trainSet.add(train2);
        trainSet.add(train3);


        assertEquals("Number of trains in set", 2, trainSet.size());


        assertTrue("Contains train1", trainSet.contains(train1));
        assertTrue("Contains train2", trainSet.contains(train2));
        assertTrue("Contains train3", trainSet.contains(train3));
    }


}