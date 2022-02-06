package Java;

public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return 40 <= cigars;
        }
        return (40 <= cigars && cigars <= 60);
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = 90;
        if (isSummer) {
            upper = 100;
        }
        return 60 <= temp && temp <= upper;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int speedValue = 0;

        if (isBirthday) {
            speedValue -= 5;
        }

        speedValue += speed;

        if (speedValue <= 60) {
            return 0;
        }

        else if (61 <= speedValue && speedValue <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public int sortaSum(int a, int b) {
        if (10 <= a + b && a + b <= 19) {
            return 20;
        }
        return a + b;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (1 <= day && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (1 <= day && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6) || (Math.abs(a - b) == 6 || a + b == 6);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        }
        return 1 <= n && n <= 10;
    }

    public boolean specialEleven(int n) {

    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            return false;
        }
        return (n % 5 == 0 || n % 3 == 0);
    }

    public boolean less20(int n) {

    }

    public boolean nearTen(int num) {
        int remainder = num % 10;
        return !(2 < remainder && remainder < 8);
    }

    public int teenSum(int a, int b) {
        if (13 <= a && a <= 19 || 13 <= b && b <= 19) {
            return 19;
        }
        return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

    }

    public int teaParty(int tea, int candy) {
        int party = 0;
        if (tea >= 5 && candy >= 5) {
            party = 1;
        }

        if (tea >= candy * 2 || candy >= tea * 2) {
            party = 2;
        }
        if (tea < 5 || candy < 5) {
            party = 0;
        }
        return party;
    }

    public String fizzString(String str) {
        String s = "";
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public String fizzString2(int n) {

    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || c + b == a || a + c == b;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        }
        return b > a && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

    }

    public int maxMod5(int a, int b) {
        if (a % 5 == b % 5) {
            if (a == b) {
                return 0;
            }
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c && a == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public int greenTicket(int a, int b, int c) {

    }

    public int blueTicket(int a, int b, int c) {
        int AB = a + b;
        int BC = b + c;
        int AC = a + c;

        if (AB == 10 || BC == 10 || AC == 10) {
            return 10;
        }
        if (AB == BC + 10 || AB == AC + 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || a % 10 == b / 10;
    }

    public int sumLimit(int a, int b) {

    }

}
