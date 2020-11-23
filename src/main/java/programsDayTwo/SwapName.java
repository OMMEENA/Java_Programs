package programsDayTwo;

public class SwapName {
    public static void main(String[] args) {
        String str = "om";
        String b = "ram";
        String c = "yash";
        String d = " gopal ";
        String z = "";

        System.out.println("Before Swaping \n"+ str +"  " +b+" "+c+" "+d );

        z=str;
        str=b;
        b=c;
        c=d;

        System.out.println("After swaping \n"+ str +" " + z+" " +d+" " +b);

    }

}
