import java.util.*;

public class StringJoinSplitBasic {
    public static void main(String[] args) {
        // String.join()
        System.out.println("=== String.join() ===");
        System.out.println(String.join(", ",    "Alice","Bob","Carol"));
        System.out.println(String.join(" | ",   "Java","Python","C++"));
        System.out.println(String.join("-",     "2024","03","15"));
        System.out.println(String.join("/",     "home","user","documents","file.txt"));

        List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
        System.out.println(String.join(", ", fruits));

        // String.split()
        System.out.println("\n=== String.split() ===");
        String csv   = "Alice,25,Engineer,New York";
        String[] row = csv.split(",");
        System.out.println("Name   : " + row[0]);
        System.out.println("Age    : " + row[1]);
        System.out.println("Job    : " + row[2]);
        System.out.println("City   : " + row[3]);

        String path  = "/home/user/documents/report.pdf";
        String[] parts = path.split("/");
        System.out.println("\nPath parts:");
        for (int i=1; i<parts.length; i++) System.out.println("  " + parts[i]);
        System.out.println("Filename: " + parts[parts.length-1]);

        // Split by multiple delimiters
        String messy = "one two,three;four|five";
        String[] words = messy.split("[,;| ]+");
        System.out.println("\nSplit by [,;| ]: " + Arrays.toString(words));

        // Round-trip: split then join
        String sentence = "The quick brown fox jumps";
        String[] ws = sentence.split(" ");
        String joined = String.join("-", ws);
        System.out.println("\nOriginal: " + sentence);
        System.out.println("Hyphen  : " + joined);
    }
}
