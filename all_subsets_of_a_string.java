package Algorithms;
import jdk.swing.interop.SwingInterOpUtils;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class all_subsets_of_a_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string whose subsets are to be found :");
        String s=sc.nextLine();
        int l=s.length();
        char sArray[]=s.toCharArray();
        int numRange=(int)Math.pow(2,s.length())-1;
        String subSets []=new String[(int)Math.pow(2,s.length())];
        for(int i=0;i<=numRange;i++){
            String subset="";
            for(int k=0;k<=s.length()-1;k++){
                if((i>>>k & 1)==1){
                    subset+=sArray[k];
                }
            }
            if(subset==""){
                subset="nullSet";
            }
            subSets[i]=subset;
        }
        System.out.println("Subsets are :");
        for(String v:subSets){
            System.out.print("{"+ v +"}"+" ");
        }

    }
}
