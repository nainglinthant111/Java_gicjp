package gicjp.com;


public class EnumTest {

    public enum Day {
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    }
    Day day;
    public EnumTest(Day day){
        this.day=day;
    }
    public void  TellDay(){
        switch (day){
            case MONDAY:
                System.out.println("Monday is the best");
                break;
            case FRIDAY:
                System.out.println("This is Friday");
                break;
            case WEDNESDAY:
                System.out.println("I love Wednesday");
                break;
            default:
                System.out.println("I don't like this month");
                break;

        }
    }
    public static void main(String[] args) {
        EnumTest firstday=new EnumTest(Day.MONDAY);
        firstday.TellDay();
        EnumTest secondday=new EnumTest(Day.WEDNESDAY);
        secondday.TellDay();
        EnumTest thirdday=new EnumTest(Day.FRIDAY);
        thirdday.TellDay();

    }



}
