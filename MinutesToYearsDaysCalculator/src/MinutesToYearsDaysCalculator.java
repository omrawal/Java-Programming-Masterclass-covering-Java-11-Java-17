public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else{
            long yrs=0;
            long days=0;
            days=minutes/(24*60);
            yrs=days/365;
            days=days-yrs*365;
            System.out.println(minutes+" min = "+yrs+" y and "+days+" d");
        }
    }

}
