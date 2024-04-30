import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    String text1="my name is hamza and i study in comsats university. i have 3 friends";
        ArrayList<String> sentence1= new ArrayList<>();
        ArrayList<String> sentence2= new ArrayList<>();
        String text[]= text1.split(" ");
        for(String s : text){
         sentence1.add(s);

        }
        for(String s : text){
            System.out.println(s);

        }
        System.out.print(text.length);
        String text2[]=text1.split("\\.");
        for(String s : text){
            sentence2.add(s);}
        System.out.print("\n");
        for(String s : text2){
            System.out.println(s);

        }
        System.out.println(text2.length);
        HashSet<String> unique= new HashSet<>();
        unique.addAll(sentence1);
        System.out.println("Unique words:"+unique.size());

        ArrayList<Character> uniquec=new ArrayList<>();
        char uniquechar[]=text1.toCharArray();
        for(char c: uniquechar)
            uniquec.add(c);

        HashSet<Character> uchar= new HashSet<>();
        uchar.addAll(uniquec);
        System.out.println("Unique character:"+uniquec.size());
        }}