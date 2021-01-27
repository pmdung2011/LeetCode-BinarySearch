public class ConvertTo24h {
    //00:00am - 11:59am, no change
    //12:00am -> 00:00
    //01:00pm - 11:59pm: +12
    //12:00pm - 12:59pm, no change
    public static String solve(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        if (s.contains("a") && hour != 12)
            return s.substring(0, 5);
        else if (s.contains("a") && hour == 12)
            return "00" + s.substring(2, 5);
        else if (s.contains("p") && hour != 12)
            return (hour + 12) + s.substring(2, 5);
        else
            return s.substring(0, 5);
    }
}
