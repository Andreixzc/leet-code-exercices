// package InterviewQuestions;

// import java.util.Arrays;
// import java.util.Random;

// class Solution {

//     static class Person {
//         String name;
//         String phoneNumber;

//         @Override
//         public String toString() {
//             return "Person [name=" + name + ", phoneNumber=" + phoneNumber + "]";
//         }
//     }

//     private static Person[] phoneBook;
//     private static String searchName;
//     private static int numberOfPairs;

//     public static void main(String[] args) {
//         numberOfPairs = 1000000; // 1 million

//         generateFakeData();
//         for (int i = 0; i < 10; i++) {
//             System.out.println(phoneBook[i].toString());
//         }

//         searchName = phoneBook[new Random().nextInt(numberOfPairs)].name;

//         System.out.println("\nSearch Name: " + searchName); 

//         // Sequential Search
//         long startTimeSeq = System.currentTimeMillis();
//         int seqResult = sequentialSearch(searchName);
//         long elapsedTimeSeq = System.currentTimeMillis() - startTimeSeq;

//         System.out.println("Sequential Search Result: " + seqResult);
//         System.out.println("Comparisons in Sequential Search: " + seqComparisons);
//         System.out.println("Sequential Search Time: " + elapsedTimeSeq + " milliseconds\n");

//         // Binary Search
//         long startTimeBin = System.currentTimeMillis();
//         int binResult = binarySearch(searchName);
//         long elapsedTimeBin = System.currentTimeMillis() - startTimeBin;

//         System.out.println("Binary Search Result: " + binResult);
//         System.out.println("Comparisons in Binary Search: " + binComparisons);
//         System.out.println("Binary Search Time: " + elapsedTimeBin + " milliseconds");
//     }

//     private static int seqComparisons = 0;

//     static int sequentialSearch(String searchTerm) {
//         for (int i = 0; i < numberOfPairs; i++) {
//             seqComparisons++;
//             if (phoneBook[i].name.equals(searchTerm)) {
//                 return Integer.parseInt(phoneBook[i].phoneNumber);
//             }
//         }
//         return -1; // Not found
//     }

//     private static int binComparisons = 0;

//     static int binarySearch(String searchTerm) {
//         int first = 0;
//         int last = numberOfPairs - 1;

//         while (first <= last) {
//             binComparisons++;
//             int mid = (first + last) / 2;
//             int comparisonResult = phoneBook[mid].name.compareTo(searchTerm);

//             if (comparisonResult == 0) {
//                 return Integer.parseInt(phoneBook[mid].phoneNumber);
//             } else if (comparisonResult < 0) {
//                 first = mid + 1;
//             } else {
//                 last = mid - 1;
//             }
//         }

//         return -1; // Not found
//     }

//     static void generateFakeData() {
//         Random random = new Random();
//         phoneBook = new Person[numberOfPairs];

//         for (int i = 0; i < numberOfPairs; i++) {
//             Person person = new Person();
//             person.name = "Person" + i;
//             person.phoneNumber = String.valueOf(random.nextInt(1000000000));
//             phoneBook[i] = person;
//         }

//         Arrays.sort(phoneBook, (p1, p2) -> p1.name.compareTo(p2.name));
//     }
// }
