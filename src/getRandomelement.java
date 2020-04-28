import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class getRandomelement {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
       // String no;
        Scanner scanner= new Scanner(System.in);
       String generate="Yes";
        ArrayList <String>noun= new ArrayList<>();
        ArrayList <String>verb= new ArrayList<>();
        ArrayList <String>object= new ArrayList<>();
        object.add("an object oriented programming language");
        object.add("a serious disease");
        object.add("hyper text mark up langauge");


        verb.add("is");
        verb.add("become");
        noun.add("JAVA");
        noun.add("HTML");
        noun.add("COVID-19");
        noun.add("RUBY");
        while(generate.equalsIgnoreCase("yes")){
            n=random.nextInt(noun.size()-1);
            int v=random.nextInt(verb.size()-1);
            int o= random.nextInt(object.size()-1);
            System.out.println(noun.get(n)+ " "+ verb.get(v)+ " "+ object.get(o));
            System.out.println("Do you want to generate an other sentences ");
            generate=scanner.nextLine();
        }
        System.out.println("\nlist of nouns are ");
        for (String no:noun
             ) {
            System.out.print(no+ " , ");
        }
        System.out.println("\nlist of verb are ");
        for (String ver:verb
        ) {
            System.out.print(ver+ " , ");
        }
        System.out.println("\nlist of object are ");
        for (String ob:object
        ) {
            System.out.print(ob+ " , ");
        }
        



    }
}
