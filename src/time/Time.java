package time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour){
        this.hour = hour;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        second = 0;
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(Time time){
        hour = time.hour;
        minute = time.minute;
        second = time.second;
    }

    public void output(){
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
}
