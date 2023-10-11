package NamePattern;

import java.util.Arrays;
import java.util.Scanner;

public class sample
{
	 static boolean isAnagram(String a, String b) {
         boolean res=true;
         
           if(a.length()!=b.length()){
               res=false;
           }
           else{
               a=a.toLowerCase();
               b=b.toLowerCase();
               String s1="";
               String s2="";
               char[] c=a.toCharArray();
                char[] c1=b.toCharArray();
               for(int k=0;k<c1.length;k++) {
               for(int j=k+1;j<c1.length;j++) {
                   
                   if(c1[k]>c1[j]) 
                   {
                   
                   char temp=c1[k];
                   c1[k]=c1[j];
                   c1[j]=temp;
        
                   }
         
               }
               
               
               
           }
               for(int i=0;i<c1.length;i++) {
            	   s1=s1+c1[i];
               }
               for(int k=0;k<c.length;k++) {
                   for(int j=k+1;j<c.length;j++) {
                       
                       if(c[k]>c[j]) 
                       {
                       
                       char temp=c[k];
                       c[k]=c[j];
                       c[j]=temp;
            
                       }
             
                   }
                   
                   
                   
               }
                   for(int i=0;i<c.length;i++) {
                	   s2=s2+c[i];
                   }
            
          
             a=s1;
             b=s2;
             
             System.out.println(a);
             System.out.println(b);
      
             if(a.equals(b)){
                 res=true;
             }
          else{
              res=false;
          }
           }
           return res;
           }
   
   public static void main(String[] args) {
   
       Scanner scan = new Scanner(System.in);
       String a =scan.next();
       String b = scan.next();
       scan.close();
       boolean ret = isAnagram(a, b);
       System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
   }

}
