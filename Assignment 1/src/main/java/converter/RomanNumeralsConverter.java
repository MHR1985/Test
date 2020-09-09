package converter;

public class RomanNumeralsConverter {

    public String Convert2(int i) {
        if (i == 1) {
            return "I";
        } else if (i == 2) {
            return "II";
        }else if(i==3){
            return "III";
        }else if(i==4){
            return "IV";
        }else if (i==5){
            return "V";
        }else if(i==6){
            return "VI";
        }else if(i==7){
            return "VII";
        }else if(i==8){
            return "VIII";
        }else if(i==9){
            return "IX";
        }else if(i==10){
            return "X";
        }
        return null;
    }

    public String Convert(int i) {
        int n = i;
        String answer = "";
        while(n>=1000){
            answer += "M";
            n -= 1000;
        }
        while(n>=500){
            answer += "D";
            n-=500;
        }
        while(n>=100){
            answer += "C";
            n-=100;
        }
        while(n>=50){
            answer += "L";
            n-=50;
        }
        while(n>=10){
            answer += "X";
            n-=10;
        }
        if (n == 1) {
            answer += "I";
        } else if (n == 2) {
            answer += "II";
        }else if(n==3){
            answer += "III";
        }else if(n==4){
            answer += "IV";
        }else if (n==5){
            answer += "V";
        }else if(n==6){
            answer += "VI";
        }else if(n==7){
            answer += "VII";
        }else if(n==8){
            answer += "VIII";
        }else if(n==9){
            answer += "IX";
        }
        return answer;

    }
}
