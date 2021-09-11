public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(3660));
    }



    public static String getDurationString(int minutes,int seconds){
        if(minutes>=0 && seconds>=0 &&seconds<=59){
            int hr=0;
            int min=0;
            int sec=0;
            if(minutes>59){
                hr=minutes/60;
                min=minutes-hr*60;
                sec=seconds;
            }
            else{
                min=minutes;
                sec=seconds;
            }
            String ans=hr+"h "+min+"m "+sec+"s";
            return ans;
        }
        return "Invalid Value";
    }
    public static String getDurationString(int seconds){
        if( seconds>=0 ){
            int min=0;
            int sec=0;
            if(seconds>59){
                min=seconds/60;
//                min=minutes-hr*60;
                sec=seconds-min*60;
                return getDurationString(min,sec);
            }
            else{
                sec=seconds;
                String ans=0+"h "+min+"m "+sec+"s";
                return ans;
            }

        }
        return "Invalid Value";
    }
}
