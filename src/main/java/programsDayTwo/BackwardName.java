package programsDayTwo;

public class BackwardName {
    public static void main(String[] args) {

        String str = "OM MAINA";
        System.out.println(str);
        String backward = "";

//        StringBuffer sbr = new StringBuffer(str);
//        sbr.reverse();
//        System.out.print("The reversed string of the '"+str+"' is: " );



        for(int i = str.length()-1; i>=0; i--)
        { backward = backward + str.charAt(i);

        }

        System.out.println(backward);

    }
}
