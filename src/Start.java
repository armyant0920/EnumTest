public class Start {

    public static void main(String[] args) {
        EnumSample sample=EnumSample.getInstance();
        for(WeekDay weekDay:WeekDay.values()){

            System.out.println(weekDay);
        }
    }
}
