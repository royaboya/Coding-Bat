package Java;

/**
 * Started by AYOR 10.17.21
 */

public class Warmup2 {

    /**
     * Given a string and a non-negative int n, return a larger string that is n
     * copies of the original string.
     */
    public String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += str;
        }
        return s;
    }

    /**
     * Given a string and a non-negative int n, we'll say that the front of the
     * string is the first 3 chars, or whatever is there if the string is less than
     * length 3. Return n copies of the front;
     */
    public String frontTimes(String str, int n) {
        String s = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                s += str;
            }
        } else {
            for (int i = 0; i < n; i++) {
                s += str.substring(0, 3);
            }
        }
        return s;
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is
     * allowed, so "xxx" contains 2 "xx".
     */
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == (str.charAt(i + 1)) && str.charAt(i) == 'x') {
                count++;
            }
        }
        return count;
    }

    /**
     * Given a string, return true if the first instance of "x" in the string is
     * immediately followed by another "x".
     */
    boolean doubleX(String str) {
        int first = str.indexOf("x");
        if (first != -1 && first < str.length() - 1) {
            if (str.charAt(first) == str.charAt(first + 1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo".
     */

    public String stringBits(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i += 2) {
            s += str.charAt(i);
        }
        return s;
    }

    /** Given a non-empty string like "Code" return a string like "CCoCodCode". */
    public String stringSplosion(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s += str.substring(0, i + 1);
        }
        return s;
    }

    /**
     * Given a string, return the count of the number of times that a substring
     * length 2 appears in the string and also as the last 2 chars of the string, so
     * "hixxxhi" yields 1 (we won't count the end substring).
     */
    public int last2(String str) {
        int count = 0;
        if (str.length() < 3) {
            return 0;
        }
        String s = str.substring(str.length() - 2);
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(s)) {
                count++;
            }
        }
        return count;

    }

    /**
     * Given an array of ints, return the number of 9's in the array.
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the
     * array is a 9. The array length may be less than 4.
     */
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9 && i <= 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3
     * appears in the array somewhere.
     */
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given 2 strings, a and b, return the number of the positions where they
     * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
     * since the "xx", "aa", and "az" substrings appear in the same place in both
     * strings.
     */
    public int stringMatch(String a, String b) {
        int check = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < check - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given a string, return a version where all the "x" have been removed. Except
     * an "x" at the very start or end should not be removed. Note: does not work
     * for strings length 1 that do not contain x, but works for current test cases
     */
    public String stringX(String str) {
        if (str.length() <= 1) {

            return str;
        }
        String s = str.substring(0, 1);

        for (int i = 1; i <= str.length() - 2; i++) {
            if (str.charAt(i) != 'x') {
                s += str.charAt(i);
            }
        }
        return s + str.charAt(str.length() - 1);

    }

    /**
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
     * ... so "kittens" yields "kien".
     * 
     */
    public String altPairs(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (0 <= i && i <= str.length() - 1) {
                s += str.charAt(i);
            }
            if (0 <= i + 1 && i + 1 <= str.length() - 1) {
                s += str.charAt(i + 1);
            }
            i += 3;
        }
        return s;
    }

    /**
     * Suppose the string "yak" is unlucky. Given a string, return a version where
     * all the "yak" are removed, but the "a" can be any char. The "yak" strings
     * will not overlap.
     */
    public String stringYak(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' && i + 2 < str.length() && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                s += str.charAt(i);
            }
        }
        return s;
    }

    /**
     * Given an array of ints, return the number of times that two 6's are next to
     * each other in the array. Also count instances where the second "6" is
     * actually a 7.
     */
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, we'll say that a triple is a value appearing 3 times
     * in a row in the array. Return true if the array does not contain any triples.
     */
    public boolean noTriples(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a
     * value, followed by the value plus 5, followed by the value minus 1.
     * Additionally the 271 counts even if the "1" differs by 2 or less from the
     * correct value.
     * 
     */
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] + 5 == nums[i + 1]) {
                if (nums[i + 2] == (nums[i] - 1) || Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                    return true;
                }
            }
        }
        return false;
    }

}
