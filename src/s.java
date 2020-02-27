import javax.swing.*;
import java.util.LinkedList;

public class s {

    public static void main(String[] args) {
//        LinkedList<Integer> l3 = new LinkedList<Integer>();
//        LinkedList<Integer> l4 = new LinkedList<Integer>();
//        l3.add(3);
//        l3.add(4);
//        l3.add(2);
//        l4.add(4);
//        l4.add(6);
//        l4.add(5);
//
//        LinkedList<Integer> l8 = s.addTwoNumbers(l3,l4);
//        System.out.println(l8);
        System.out.println(s.reverse(1534236469));

    }


    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i=2;i>-1;i--){
            System.out.println(i);
            s1.append(l1.get(i));
            s2.append(l2.get(i));
        }
        int i1= Integer.parseInt(s1.toString());
        int i2 =Integer.parseInt(s2.toString());
        System.out.println(i1);
        System.out.println(i2);
        int i3 = i1+i2;

        String s3= String.valueOf(i3);

        l3.add(Integer.parseInt(s3.substring(2,3)));
        l3.add(Integer.parseInt(s3.substring(1,2)));
        l3.add( Integer.parseInt(s3.substring(0,1)));

        return l3;
    }

    public static int reverse(int x) {
        boolean neg = false;
        String s = String.valueOf(x);
        if (x<0) {
            s= s.substring(1,s.length());
            System.out.println("neg"+s);
            neg =true;
        }
        int len = s.length();


        String n ="";
        if (String.valueOf(s.charAt(0)) == "-"){
            neg =true;
            s= s.substring(1,len);
            System.out.println("neg"+s);
        }

        for (int j= len;j>0;j--){

            n =  n + s.substring(j-1,j);


        }
        try {
            if (neg == false) {
                return Integer.parseInt(n);
            } else {
                int f = Integer.parseInt(n);

                f = f * -1;
                return f;
            }
        } catch (NumberFormatException e){
            return 0;
        }
    }

    public static boolean isPalindrome(int x) {

        if (x<0){
            return false;
        }

        String intStr = String.valueOf(x);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());

    }
}