package Week_3;

import java.util.HashSet;
import java.util.Set;

public class Set1Hash {
    public static void main(String[] args) {
        Set<String> firstStack = new SetHash<>();
        firstStack.add("Chemistry");
        firstStack.add("Mathematics");
        firstStack.add("Biology");
        firstStack.add("English");

        Set<String> secondStack = new SetHash<>();
        secondStack.add("Biology");
        secondStack.add("English");
        secondStack.add("Geography");
        secondStack.add("Physics");
        
        Set<String> firstStackClone = new SetHash<>(firstStack);
        Set<String> secondStackClone = new SetHash<>(secondStack);

        firstStackClone.removeAll(secondStack);
        System.out.println("Subjects only present in the first stack: " + firstStackClone);

     
        secondStackClone.removeAll(firstStack);
        System.out.println("Subjects only present in the second stack: " + secondStackClone);

        
        firstStack.retainAll(secondStack);
        System.out.println("Subjects present in both stacks: " + firstStack);
    }
}
