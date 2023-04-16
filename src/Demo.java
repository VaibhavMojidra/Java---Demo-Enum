public class Demo {
    
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        System.out.println("Today is " + today);
        
        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}
