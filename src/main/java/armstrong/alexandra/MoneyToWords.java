package armstrong.alexandra;

public class MoneyToWords {

    private static StringBuilder sb = new StringBuilder();
    private static int length;

    public static StringBuilder getSb() {
        return sb;
    }

    public static String convertNumberToWords(long number){
        if(number < 0){
            sb.append("negative ");
            number *= -1;
        }
        length = String.valueOf(number).length();
        if(length > 12){
            trillions(number);
        }
        if(length > 9){
            billions(number);
        }
        if(length > 6){
            millions(number);
        }
        if(length > 3){
            thousands(number);
        }
        if(length > 0){
            hundreds(number);
        }
        return sb.toString();
    }

    public static void trillions(long number){
        int tril = (int)(number / 1000000000000L);
        callBreaks(tril);
        amountSwitch(5);
    }
    public static void billions(long number){
        int bil = (int)(number / 1000000000 % 1000000000);
        callBreaks(bil);
        amountSwitch(4);
    }
    public static void millions(long number){
        int mil = (int)(number / 1000000 % 1000000);
        callBreaks(mil);
        amountSwitch(3);
    }
    public static void thousands(long number){
        int thou = (int)(number / 1000 % 1000);
        callBreaks(thou);
        amountSwitch(2);
    }
    public static void hundreds(long number){
        int hund = (int)(number % 1000);
        callBreaks(hund);
    }

    public static void callBreaks(int number){
        if(number > 99){
            breakHundreds(number);
        }
        if(number > 9){
            breakTens(number);
        }
        if(number > 0){
            breakOnes(number);
        }
    }
    public static void breakOnes(int number){
        wordSwitch(number % 10);
    }
    public static void breakTens(int number){
        if((number / 10 % 10) == 1){
            wordSwitch(number % 100);
        } else {
            wordSwitch(number / 10 % 10 * 10);
        }
    }
    public static void breakHundreds(int number){
        wordSwitch(number % 1000 / 100);
        //wordSwitch(number / 100 % 100);
        amountSwitch(1);
    }

    public static void checkLength(){}

    public static void wordSwitch(int data){
        switch(data){
            case 1: sb.append(" one");break;
            case 2: sb.append(" two");break;
            case 3: sb.append(" three");break;
            case 4: sb.append(" four");break;
            case 5: sb.append(" five");break;
            case 6: sb.append(" six");break;
            case 7: sb.append(" seven");break;
            case 8: sb.append(" eight");break;
            case 9: sb.append(" nine");break;
            case 10: sb.append(" ten");break;
            case 11: sb.append(" eleven");break;
            case 12: sb.append(" twelve");break;
            case 13: sb.append(" thirteen");break;
            case 14: sb.append(" fourteen");break;
            case 15: sb.append(" fifteen");break;
            case 16: sb.append(" sixteen");break;
            case 17: sb.append(" seventeen");break;
            case 18: sb.append(" eighteen");break;
            case 19: sb.append(" nineteen");break;
            case 20: sb.append(" twenty");break;
            case 30: sb.append(" thirty");break;
            case 40: sb.append(" forty");break;
            case 50: sb.append(" fifty");break;
            case 60: sb.append(" sixty");break;
            case 70: sb.append(" seventy");break;
            case 80: sb.append(" eighty");break;
            case 90: sb.append(" ninety");break;
        }
    }

    public static void amountSwitch(int pick){
        switch(pick){
            case 1: sb.append("-hundred and");break;
            case 2: sb.append(" thousand,");break;
            case 3: sb.append(" million,");break;
            case 4: sb.append(" billion,");break;
            case 5: sb.append(" trillion,");break;
        }
    }
}
