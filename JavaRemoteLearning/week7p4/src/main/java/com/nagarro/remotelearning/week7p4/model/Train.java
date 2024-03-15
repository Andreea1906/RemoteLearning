package com.nagarro.remotelearning.week7p4.model;

import java.util.Objects;

public class Train {
    private final int trainNumber;
    private final String trainType;
    private final int numberOfWagons;

    public Train(int trainNumber, String trainType, int numberOfWagons) {
        this.trainNumber = trainNumber;
        this.trainType = trainType;
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Train otherTrain = (Train) o;
        return trainNumber == otherTrain.trainNumber &&
                numberOfWagons == otherTrain.numberOfWagons &&
                trainType.equals(otherTrain.trainType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainNumber, trainType, numberOfWagons);
        //return 3;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", trainType='" + trainType + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}';
    }
}
