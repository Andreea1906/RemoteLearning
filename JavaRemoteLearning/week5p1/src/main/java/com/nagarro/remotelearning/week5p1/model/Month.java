package com.nagarro.remotelearning.week5p1.model;

public enum Month {

    JANUARY(1), FEBRUARY(2), MARS(3), APRIL(4),
    MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9),
    OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private final int index;
    Month(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Month getMonthAtIndex(int monthIndex) throws Exception {
        for(Month month : Month.values()){
            if(monthIndex == month.getIndex()){
                return month;
            }
        }
        throw new Exception("Please enter a valid month!");
    }
}
