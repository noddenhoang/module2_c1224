package time;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(10);
        Time time3 = new Time(10, 30);
        Time time4 = new Time(10, 30, 45);
        Time time5 = new Time(time4);

        time1.output();
        time2.output();
        time3.output();
        time4.output();
        time5.output();
    }
}
