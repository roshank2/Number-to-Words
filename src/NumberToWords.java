import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number between 0 to 999: ");
        int num = scanner.nextInt();
        String numSt = Integer.toString(num);
        int len = numSt.length();

        if(len>3){
            System.out.println("Number should be less than 1000");
        }else if(num<0){
            System.out.println("Positive Number only");
        }else {
            String[] zeroToNineteen = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

            String[] twentyToNinety = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

            String hundred = "Hundred";

            System.out.print("Number to Words: " + num + " -> ");

            if(num<20){
                System.out.println(zeroToNineteen[num]);
            }else {
                int i=len-1;
                while (i>0){
                    if(i>1 && numSt.charAt(len - 1 - i)!='0'){
                        int tmpNum = num/100;
                        System.out.print(zeroToNineteen[tmpNum] + " " + hundred + " ");
                        i--;
                        continue;
                    }
                    if(i==1){
                        int tmpNum1 = num%100;
                        int tmpNum2 = num%10;
                        int tmpNum3 = tmpNum1/10;
                        if(tmpNum3!=0){
                            if(tmpNum1<20){
                                System.out.print(zeroToNineteen[tmpNum1]);
                                i--;
                                continue;
                            }
                            else{
                                System.out.print(twentyToNinety[tmpNum3-2] + " ");
                            }
                            if(tmpNum2!=0){
                                System.out.println(zeroToNineteen[tmpNum2]);
                            }
                        }
                    }
                    i--;
                }
            }
        }
    }
}
