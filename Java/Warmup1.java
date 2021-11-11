package Java;

/**
 * Started by AYOR 10.16.21
 */

public class Warmup1 {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation
     * is true if we are on vacation. We sleep in if it is not a weekday or we're on
     * vacation. Return true if we sleep in.
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !(weekday) || vacation;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
     * if each is smiling. We are in trouble if they are both smiling or if neither
     * of them is smiling. Return true if we are in trouble.
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.
     */
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        return a + b;
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except
     * return double the absolute difference if n is over 21.
     */
    public int diff21(int n) {
        if (n > 21) {
            return Math.abs(n - 21) * 2;
        }
        return Math.abs(n - 21);
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time
     * in the range 0..23. We are in trouble if the parrot is talking and the hour
     * is before 7 or after 20. Return true if we are in trouble.
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /**
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is
     * 10.
     */
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }

    /** Given an int n, return true if it is within 10 of 100 or 200. */
    public boolean nearHundred(int n) {
        return (90 <= n) && (n <= 110) || (190 <= n) && (n <= 210);
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are
     * negative.
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    /**
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string
     * unchanged.
     */
    public String notString(String str) {
        if ((str.length() >= 3) && (str.substring(0, 3).equals("not"))) {
            return str;
        }
        return "not " + str;
    }

    /**
     * Given a non-empty string and an int n, return a new string where the char at
     * index n has been removed. The value of n will be a valid index of a char in
     * the original string (i.e. n will be in the range 0..str.length()-1
     * inclusive).
     */
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    /**
     * Given a string, return a new string where the first and last chars have been
     * exchanged.
     */
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there. Return a
     * new string which is 3 copies of the front.
     */
    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        String s = str.substring(0, 3); // alternative: reassign s for both fronts and return it 3 times
        return s + s + s;
    }

    /**
     * Given a string, take the last char and return a new string with the last char
     * added at the front and back, so "cat" yields "tcatt". The original string
     * will be length 1 or more.
     */
    public String backAround(String str) {
        char letter = str.charAt(str.length() - 1);
        return letter + str + letter;
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or a multiple
     * of 5.
     */
    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    /**
     * Given a string, take the first 2 chars and return the string with the 2 chars
     * added at both the front and back, so "kitten" yields"kikittenki". If the
     * string length is less than 2, use whatever chars are there.
     */
    public String front22(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }
        String s = str.substring(0, 2);
        return s + str + s;
    }

    /**
     * Given a string, return true if the string starts with "hi" and false
     * otherwise.
     */
    public boolean startHi(String str) {
        if (str.length() > 1) {
            return str.substring(0, 2).equals("hi");
        }
        return false;

    }

    /**
     * Given two temperatures, return true if one is less than 0 and the other is
     * greater than 100.
     */
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20
     * inclusive.
     */
    public boolean in1020(int a, int b) {
        return (10 <= a && a <= 20) || (10 <= b && b <= 20);
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     */
    public boolean hasTeen(int a, int b, int c) {
        return (13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19);
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     */
    public boolean loneTeen(int a, int b) {
        boolean aIsTeen = (13 <= a && a <= 19);
        boolean bIsTeen = (13 <= b && b <= 19);

        if (aIsTeen && bIsTeen) {
            return false;
        }
        return aIsTeen || bIsTeen;
    }

    /**
     * Given a string, if the string "del" appears starting at index 1, return a
     * string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     */
    public String delDel(String str) {
        if (str.indexOf("del") == 1) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    /**
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     */
    public boolean mixStart(String str) {
        if (str.length() > 2) {
            return str.substring(1, 3).equals("ix");
        }
        return false;
    }

    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if
     * it is 'z', so "ozymandias" yields "oz".
     */
    public String startOz(String str) {
        String s = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            s += "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            s += "z";
        }
        return s;
    }

    /** Given three int values, a b c, return the largest. */
    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        }
        return c;
    }

    /**
     * Given 2 int values, return whichever value is nearest to the value 10, or
     * return 0 in the event of a tie.
     */
    public int close10(int a, int b) {
        int differenceA = Math.abs(a - 10);
        int differenceB = Math.abs(b - 10);

        if (differenceA < differenceB) {
            return a;
        } else if (differenceB < differenceA) {
            return b;
        }
        return 0;
    }

    /**
     * Given 2 int values, return true if they are both in the range 30..40
     * inclusive, or they are both in the range 40..50 inclusive.
     */
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        } else if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }

    /**
     * Given 2 positive int values, return the larger value that is in the range
     * 10..20 inclusive, or return 0 if neither is in that range.
     */
    public int max1020(int a, int b) {
        // too lazy to come up with a more concise solution
        if ((10 <= a && a <= 20) && (10 <= b && b <= 20)) {
            if (a > b) {
                return a;
            }
            return b;
        } else if (10 <= a && a <= 20) {
            return a;
        } else if (10 <= b && b <= 20) {
            return b;
        }
        return 0;
    }

    /** Return true if the given string contains between 1 and 3 'e' chars. */
    public boolean stringE(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter += 1;
            }
        }
        return 1 <= counter && counter <= 3;
    }

    /**
     * Given two non-negative int values, return true if they have the same last
     * digit, such as with 27 and 57.
     */
    public boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }

    /**
     * Given a string, return a new string where the last 3 chars are now in upper
     * case. If the string has less than 3 chars, uppercase whatever is there.
     */
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3) + (str.substring(str.length() - 3).toUpperCase());
    }

    /**
     * Given a non-empty string and an int N, return the string made starting with
     * char 0, and then every Nth char of the string. So if N is 3, use char 0, 3,
     * 6, ... and so on. N is 1 or more.
     */
    public String everyNth(String str, int n) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                s += str.charAt(i);
            }
        }
        return s;
    }

}