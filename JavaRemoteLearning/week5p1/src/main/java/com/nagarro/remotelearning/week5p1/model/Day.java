package com.nagarro.remotelearning.week5p1.model;

public enum Day {

        SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
        THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int index;
        Day(int index) {
            this.index = index;
        }

    public int getIndex() {
        return index;
    }

    public Day getDayAtIndex(int dayIndex) throws Exception {
            for(Day day : Day.values()){
                if(dayIndex == day.getIndex()){
                    return day;
                }
            }
            throw new Exception("Please enter a valid day!");
    }
}
