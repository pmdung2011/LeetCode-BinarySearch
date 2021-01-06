package HackerRank;

public class TimeConversion {
    public static String timeConversion(String s){
        String hour = s.substring(0,2);
        boolean checkAM = s.contains("AM");
        boolean checkPM = s.contains("PM");
        boolean hour12 =  hour.equals("12");

        if(checkAM){
            if(hour12){
                s = "00" + s.substring(2,8);
            }
            else{
                s = s.substring(0,8);
            }
        }
        else if(checkPM){
            if(hour12){
                s = s.substring(0,8);
            }
            else{
                s = ((Integer.parseInt(s.substring(0,2))+12)) + s.substring(2,8);
            }
        }
        return s;
    }

    public static void main(String[] argv){
        String s = "01:05:45AM";
        System.out.println(timeConversion(s));
    }
}
