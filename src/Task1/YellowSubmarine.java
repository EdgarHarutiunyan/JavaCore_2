package Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class YellowSubmarine {
    public static void main(String[] args) {

        //Part 1
        System.out.println("Part 1 of Task 1" + "\n");
        String lyrics = "In the town where I was born\n" +
                "Lived a man who sailed to sea\n" +
                "And he told us of his life\n" +
                "In the land of submarines\n" +
                "\n" +
                "So we sailed up to the sun\n" +
                "'Til we found the sea of green\n" +
                "And we lived beneath the waves\n" +
                "In our yellow submarine\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "\n" +
                "And our friends are all aboard\n" +
                "Many more of them live next door\n" +
                "And the band begins to play\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "\n" +
                "Full speed ahead, Mr. Boatswain, full speed ahead!\n" +
                "Full speed it is, Sergeant!\n" +
                "Cut the cable, drop the cable!\n" +
                "Aye-aye, sir, aye-aye!\n" +
                "Captain, Captain!\n" +
                "\n" +
                "As we live a life of ease (a life of ease)\n" +
                "Everyone of us (everyone of us) has all we need (has all we need)\n" +
                "Sky of blue (sky of blue) and sea of green (sea of green)\n" +
                "In our yellow (in our yellow) submarine (submarine, ah-ha)\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine";

        lyrics = lyrics.replaceAll("[,\\n()]", " ").toLowerCase();
        String[] wordsArray = lyrics.split("\\s+");
        System.out.println(lyrics);

        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : wordsArray) {
            wordCount.put(word, wordCount.getOrDefault(word,0) + 1);
        }

        int count = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count += entry.getValue();
        }
        System.out.println("Word Count: " + count);
        System.out.println();


        //PART 2
        System.out.println("Part 2 of Task 1" + "\n");
        List<String> stringList = Arrays.asList(wordsArray);

        ArrayList<String> listOfUnique = new ArrayList<>(new HashSet<>(stringList));
        System.out.println(listOfUnique);

        listOfUnique.sort(Comparator.comparingInt(String::length));
        System.out.println(listOfUnique);
        System.out.println();


        //PART 3
        System.out.println("Part 3 of Task 1" + "\n");

        List<String> filtered = new LinkedList<>();

        for (String s: stringList) {
            if (s.equals("yellow") || s.equals("submarine")) {
                continue;
            }
            filtered.add(s);
        }
        System.out.println(filtered + "\n");

        //PART 3
        System.out.println("Part 4 Task 1" + "\n");

        try {
            File lyricsInTXT = new File("YellowSubmarine.txt");
            Scanner sc = new Scanner(lyricsInTXT);

            exists(sc);

        } catch (FileNotFoundException | BeatlesException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void exists(Scanner scanner) throws BeatlesException {
        boolean found = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("Show must go on!")) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new BeatlesException();
        }
    }
}
