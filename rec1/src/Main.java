import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int boyut;
    static int[] s;

    public static void rec(List<String> sonuc,String current,int index,int[] hane){
        boyut= hane.length;
        s=hane;
        String[] table
                = {"0", "1", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(index==boyut){
            sonuc.add(current);
            return;
        }
        String yazilar=table[s[index]];
        for(int i=0;i<yazilar.length();i++){
            rec(sonuc,current+yazilar.charAt(i), index+1,hane);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Tuslari giriniz");
        int sayi=in.nextInt();
        int gecici=sayi;
        int sayac=-1;
        while(gecici>0){
            gecici=gecici/10;
            sayac++;
        }
        int tuslar[]=new int[sayac+1];
        for(int i=sayac;i>=0;i--){
            tuslar[i]=(sayi%10);
            sayi=sayi/10;
        }
        List<String> sonuc = new ArrayList<String>();
        rec(sonuc,"",0,tuslar);
        System.out.println(sonuc);
    }
}