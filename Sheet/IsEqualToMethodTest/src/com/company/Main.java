package com.company;

public class Main {

    public static void main(String[] args) {
	    Object obj = new Object();
	    Object obj2 = new Object();
	    Integer num = new Integer(10);
	    Integer num2 = new Integer(10);
	    Double num3 = new Double(10.2);
	    Double num4 = new Double(10.3);

        System.out.printf("%s %s equal to %s\n",
                obj, isEqualTo(obj, obj2) ? "is" : "does not", obj2);
        System.out.printf("%s %s equal to %s\n",
                num, isEqualTo(num, num2) ? "is" : "does not", num2);
        System.out.printf("%s %s equal to %s\n",
                num3, isEqualTo(num3, num4) ? "is" : "does not", num4);
    }

    public static <T> boolean isEqualTo(T var1, T var2){
        return var1.equals(var2);
    }
}
