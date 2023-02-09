package logicTasks;

import java.util.Arrays;
import java.util.LinkedList;

public class Challenges {
    public static void main(String[] args) {

    }
    //remove text btw [] and square to num in front
    public static void asdf(){
        String s = "3[asdf]";
        String num = s.substring(0, s.indexOf("["));
        String value  = s.substring(s.indexOf("[")+1, s.indexOf("]"));
        System.out.println(value.repeat(Integer.valueOf(num)));
    }


    //remove number and square the letter near it.
    public static void asdf2(){
        String s = "3[r]4[b]5[9]";
        String num1 = s.substring(0, s.indexOf("["));
        String value1 = s.substring(s.indexOf("[")+1, s.indexOf("]"));
        String split [] = s.split("]");
        String num2 = split[1].substring(0, split[1].indexOf("["));
        String value2 = split[1].substring(split[1].indexOf("[")+1, split[1].length());
        System.out.println(value1.repeat(Integer.valueOf(num1))+value2.repeat(Integer.valueOf(num2)));
    }

    public static void asdf3(){
        String s = "3[a7[br]]";
        String num1 = s.substring(0, s.indexOf("["));
        String num2="";
        String val1="";
        s = s.substring(num1.length()+1);
        String letterAndNum = s.substring(0, s.indexOf("["));
        String value2 = "";
        for (int i =0;i<letterAndNum.length();i++){
            try {
                Integer.valueOf(String.valueOf(letterAndNum.charAt(i)));
            }catch (NumberFormatException e){
                val1 +=String.valueOf(letterAndNum.charAt(i));
                continue;
            }
            num2+=String.valueOf(letterAndNum.charAt(i));
        }
        value2 = s.substring(num2.length()+val1.length()+1, s.length()-2);
        System.out.println(val1.repeat(Integer.valueOf(num1))+value2.repeat(Integer.valueOf(num2)));
    }

    public static boolean isPolindrome(){
        String s = "ArarA";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }return true;
    }

    public static void capitalizeFirstLetterInEachWord() {
        String s = "Eu ma duc acasa";
        char arr[] = s.toCharArray();
        for (int i=0;i<arr.length;i++){
            if(arr[i]==' '){
            arr[i+1]=Character.toUpperCase(arr[i+1]);
            }
        }
        System.out.println(String.valueOf(arr));
    }


    public static void getMiddleFromWord() {
        String s = "Macar";

        if (s.length() % 2 == 0) {
            System.out.println("middle is : " + s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
        }else System.out.println(s.substring(s.length()/2, s.length()/2+1));
    }

    public static void devides() {
        int n = 54;
        for(int i =0;i<n;i++){
            if(i%3==0||i%5==0){
                System.out.println(i);
            }
        }
    }

    public static void squareEveryDigit(){
        String s = "243";
        String result="";
        for (int i =0;i<s.length();i++){
            int n = Integer.valueOf(String.valueOf(s.charAt(i)));
            String sq = String.valueOf(n*n);
            result+=sq;
        }
        System.out.println(result);
    }

    public static void addEveryDigit(){
        int n =1425;
        int length = String.valueOf(n).length();
        int bag = 0;
        while (n>9){
            for (int i=0;i<length;i++){
               String num = String.valueOf(String.valueOf(n).charAt(i));
               int numInt = Integer.valueOf(num);
               bag+=numInt;
            }
            n=bag;
            bag=0;
            length = String.valueOf(n).length();
        }
        System.out.println(n);
    }

    public static void addEveryDigit1(){
        int n =1425;
        while (n>9){
            n= n/10+n%10;
        }
        System.out.println(n);
    }

    //output should be like this [[3, 1], [3, 8], [3, 2], [1, 8], [1, 2], [8, 2]]
    public static void task8() {
        int [] arr = {3, 1, 8, 2};
        LinkedList<LinkedList<Integer>> map = new LinkedList<>();
        for(int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++) {
                //each time new list is realised
                LinkedList<Integer> numbers = new LinkedList<>();
                int x = arr[i];
                int y = arr[j];
                numbers.add(x);
                numbers.add(y);
                map.add(numbers);
            }
            }

        System.out.println(map);
        }

        //if num devide on 3 bizz, if 5 buzz, if 3 and 5 BizzBuzz
        public static void bizzBuzz(){
        int n = 99;
        for (int i=1;i<n;i++){
            if(i%3==0&&i%5==0)System.out.println("BizzBuzz");
            else if(i%3==0)System.out.println("Bizz");
            else if(i%5==0)System.out.println("Buzz");
            else System.out.println(i);
        }
        }

        public static void sortArr(){
        int [] arr = {1,2,4,6,14,2,8,5,9};
        for (int i =0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                int x = arr[j];
                int y = arr[j+1];
                if(x>y){
                    arr[j]=y;
                    arr[j+1]=x;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
        }

        public static void offenNumInArr(){
        int n [] = {1,4,3,5,1,4,1,7,1};
        int count = 0;
        int maxCount = 0;
        int maxNum = n[0];
        for (int i =0;i<n.length;i++){
            for (int j=i;j<n.length;j++){
                int x = n[i];
                int y = n[j];
                if(x==y){
                  count+=1;
                }
            }
            if(count>maxCount){
                maxCount = count;
                maxNum=n[i];
            }
            count=0;
        }
            System.out.println(maxNum+" count "+maxCount);
        }

        //Is all letter of alph is present.
    public static void isPanafram2(){
        String sentence="Glib jocks quiz nymph to vex dwarf.".toLowerCase();
        sentence= sentence.replace(" ","").replace(".", "");
        System.out.println(sentence);

        String alfabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i =0;i<sentence.length();i++){
            char c = sentence.charAt(i);
            if(!alfabet.contains(String.valueOf(c))){
                System.out.println("Not contains");
            }
        }
    }

    public static void squareEveryDigitCompl(){
        int num = 423;
        String numS = String.valueOf(num);
        int bag = 1;
        while(num>9){
            for (int i =0;i<numS.length();i++){
                int n = Integer.valueOf(String.valueOf(numS.charAt(i)));
                bag*=n;
            }
            num=bag;
            numS = String.valueOf(num);
            bag=1;
        }
        System.out.println(num);
    }

    public static void removeNum() {
        String s = "4of Fo1r pe6ople g3ood th5e the2";
        String bag = "";
        for (int i =0;i<s.length();i++){
                try {
                    Integer.valueOf(String.valueOf(s.charAt(i)));
                }catch (NumberFormatException e){
                    bag+=String.valueOf(s.charAt(i));
                    continue;
                }


        }
        System.out.println(bag);
    }

    public static void sortbyNum() {
        String s = "2o4f Fo1r 101ok pe6op6le g1o1od 7is8 th3e5  1wha2t4 the2 ";
        String split[] = s.split(" ");
        String numS = "";
        int bag = 1;
        int numInt = 0;
        int num = 0;
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split[i].length(); j++) {
                try {
                    Integer.valueOf(String.valueOf(split[i].charAt(j)));
                    numS += split[i].charAt(j);
                } catch (NumberFormatException e) {
                }
                if (j == split[i].length() - 1) {
                    numInt = Integer.valueOf(numS);
                    if (numInt > bag) {
                        bag = numInt;
                    }
                    numS = "";
                }
            }
        }
        for (int i =1;i<=bag;i++) {
            for (int x = 0; x < split.length; x++) {
                for (int j = 0; j <split[x].length(); j++) {
                    try {
                        Integer.valueOf(String.valueOf(split[x].charAt(j)));
                        numS += split[x].charAt(j);
                    } catch (NumberFormatException e) {

                    }
                    if (!numS.isEmpty()) {
                        num = Integer.valueOf(numS);
                    }
                    if (j == split[x].length() -1&& num == i) {
                        System.out.println(split[x]);
                    }
                }
                numS = "";
            }
        }
    }

    }
