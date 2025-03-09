package test;

public enum Month {
    MONTH_1(31),
    MONTH_2(29),
    MONTH_3(31),
    MONTH_4(30),
    MONTH_5(31),
    MONTH_6(30),
    MONTH_7(31),
    MONTH_8(31),
    MONTH_9(30),
    MONTH_10(31),
    MONTH_11(30),
    MONTH_12(31);

    private final int day;
    Month(int day){
        this.day = day;
    }
    public int day(){
        return day;
    }

}
