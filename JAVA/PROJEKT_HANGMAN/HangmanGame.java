import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class HangmanGame {
    private List<String> words;
    private String randomWord;
    private StringBuilder secretWord;
    private List<Character> letters;
    private int attempts;

    public HangmanGame() throws FileNotFoundException {
        words = loadWordsFromFile("slowa.txt");
        randomWord = getRandomWord();
        secretWord = new StringBuilder();
        letters = new ArrayList<>();
        attempts = 8;
        encryptWord();
    }

    private List<String> loadWordsFromFile(String fileName) throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader(fileName));
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        return words;
    }

    private String getRandomWord() {
        Random random = new Random();
        int randomNumber = random.nextInt(words.size());
        return words.get(randomNumber);
    }

    private void encryptWord() {
        for (int i = 0; i < randomWord.length(); i++) {
            secretWord.append('_');
        }
//        System.out.println(secretWord);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (attempts > 0) {
                System.out.println(secretWord);
                System.out.println("Podaj literę:");
                String letter = scanner.nextLine();
                letter = letter.toLowerCase();
                if (InputValidator.checkSyntax(letter)) {
                    if (letters.contains(letter.charAt(0))) {
                        System.out.println("Podana litera została już wykorzystana!");
                    } else {
                        letters.add(letter.charAt(0));
                        if (checkLetter(letter)) {
                            System.out.println("Podana litera nie występuje w wyrazie!");
                            attempts--;
                            HangmanDrawing.draw(attempts);
                        } else if (usersLetter(scanner)) {
                            System.out.println("Brawo wygrałeś! Wylosowane słowo to: " + randomWord);
                            break;
                        }
                    }
                } else {
                    System.out.println("Podano nieprawidłową literę!");
                }
            } else {
                System.out.println("Przegrałeś! Wylosowane słowo to: " + randomWord);
                break;
            }
        }
    }

    private boolean usersLetter(Scanner scanner) {
        int correctCount = 0;

        for (int i = 0; i < randomWord.length(); i++) {
            if (letters.contains(randomWord.charAt(i))) {
                secretWord.setCharAt(i, randomWord.charAt(i));
                correctCount++;
            }
        }
//        System.out.println(secretWord);
        return (randomWord.length() == correctCount);
    }

    private boolean checkLetter(String letter) {
        for (int i = 0; i < randomWord.length(); i++) {
            if (letter.equals(String.valueOf(randomWord.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}