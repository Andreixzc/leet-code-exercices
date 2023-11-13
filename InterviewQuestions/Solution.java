package InterviewQuestions;
import java.util.Arrays;
import java.util.Random;

public class Solution {

    static class Person {
        String name;
        String phoneNumber;
    }

    private static Person[] phoneBook;
    private static String searchName;
    private static int numberOfPairs;

    public static void main(String[] args) {
        numberOfPairs = 1000000; // 1 million

        // best case => 2ms
        // avg case => 33ms
        // worst case => 71ms

        // implementar agora o bynary search e comparar os resultados dos casos de teste

        // best case => 0.61ms
        // worst case => 2.50 ms
        // entender o motivo do loop infinito

        generateFakeData();

        Random random = new Random();
        int randomNumber = random.nextInt(numberOfPairs - 1);
        searchName = phoneBook[randomNumber].name;

        System.out.println(searchName);

        long startTime = System.currentTimeMillis();

        String phone = findPersonsPhoneNumberByPersonsName(phoneBook, 0, phoneBook.length - 1, searchName);

        long elapsedTime = System.currentTimeMillis() - startTime;

        System.out.println("Tempo decorrido: " + elapsedTime + " milissegundos");

        // throw new Exception();
    }

    static String findPersonsPhoneNumberByPersonsName(Person[] array, int first, int last, String searchTerm) {

        int mid = (first + last) / 2;
        while (first <= last) {
            int res = stringIsGreaterThan(array[mid].name, searchTerm);

            if (res == -1) {
                first = mid + 1;
            } else if (res == 0) {
                System.out.println("Element is found at index: " + mid);
                System.out.println(array[mid].name);
                System.out.println(array[mid].phoneNumber);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }

        return null;
    }

    static int stringIsGreaterThan(String firstValue, String secondValue) {
        int minLength = Math.min(firstValue.length(), secondValue.length());

        for (int i = 0; i < minLength; i++) {
            if (firstValue.charAt(i) < secondValue.charAt(i)) {
                return -1;
            } else if (firstValue.charAt(i) > secondValue.charAt(i)) {
                return 1;
            }
        }

        if (firstValue.length() < secondValue.length()) {
            return -1;
        } else if (firstValue.length() > secondValue.length()) {
            return 1;
        } else {
            return 0;
        }
    }

    static void generateFakeData() {
        Random random = new Random();
        phoneBook = new Person[numberOfPairs];

        for (int i = 0; i < numberOfPairs; i++) {
            Person person = new Person();
            person.name = "Person" + i;
            person.phoneNumber = String.valueOf(random.nextInt(1000000000));
            phoneBook[i] = person;
        }

        Arrays.sort(phoneBook, (p1, p2) -> p1.name.compareTo(p2.name));
    }
}

