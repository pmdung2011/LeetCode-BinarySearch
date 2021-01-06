package HackerRank;

public class IPAddeDefang {
    public static String defangIp(String address){

            String a = ".";
            String b = "[.]";
            address = address.replace(a,b);

        return address;

    }

    public static void main (String[] args){
        String ip = "192.168.1.1";

        String newIp = defangIp(ip);
        System.out.println(newIp);
    }
}
