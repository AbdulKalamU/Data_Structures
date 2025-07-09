import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        // 1. Length Calculation
        String brand = "Lenovo";
        System.out.println("1. Length of 'Lenovo': " + brand.length());

        // 2. Concatenation
        String brand1 = "Dell";
        String brand2 = "HP";
        String combined = brand1 + brand2;
        System.out.println("2. Concatenation of 'Dell' and 'HP': " + combined);

        // 3. Character Access
        String astring = "Asus";
        char secondChar = astring.charAt(1);
        System.out.println("3. 2nd character of 'Asus': " + secondChar);

        // 4. Traversal
        System.out.println("4. Characters in 'Apple':");
        for (char ch : "Apple".toCharArray()) {
            System.out.println(ch);
        }

        // 5. Uppercase Conversion
        String acer = "acer";
        System.out.println("5. Uppercase of 'acer': " + acer.toUpperCase());

        // 6. Reverse a Brand Name
        String msi = "MSI";
        String reversedMsi = new StringBuilder(msi).reverse().toString();
        System.out.println("6. Reversed 'MSI': " + reversedMsi);

        // 7. Search for a Substring
        String sentence = "Popular brands are Dell, HP, and Lenovo";
        boolean foundDell = sentence.contains("Dell");
        System.out.println("7. Is 'Dell' in sentence?: " + (foundDell ? "Yes" : "No"));

        // 8. Count Occurrence
        String brandsStr = "HP, HP, Lenovo, Dell";
        int count = brandsStr.split("HP", -1).length - 1;
        System.out.println("8. Count of 'HP': " + count);

        // 9. Sorting Brand Names
        List<String> brandsList = Arrays.asList("Lenovo", "Dell", "HP", "Asus");
        List<String> sortedBrands = new ArrayList<>(brandsList);
        Collections.sort(sortedBrands);
        System.out.println("9. Sorted brand names: " + sortedBrands);

        // 10. Replace a Brand Name
        String sentence2 = "Apple is a premium brand";
        String replacedSentence = sentence2.replace("Apple", "MSI");
        System.out.println("10. After replacing 'Apple' with 'MSI': " + replacedSentence);

        // 11. Palindrome Check
        String brandPalindrome = "MSI";
        String reversed = new StringBuilder(brandPalindrome).reverse().toString();
        boolean isPalindrome = brandPalindrome.equals(reversed);
        System.out.println("11. Is 'MSI' a palindrome?: " + (isPalindrome ? "Yes" : "No"));

        // 12. Unique Characters
        String brandUniques = "Lenovo";
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : brandUniques.toCharArray()) {
            uniqueChars.add(c);
        }
        System.out.println("12. Unique characters in 'Lenovo': " + uniqueChars);

        // 13. Longest Brand Name
        List<String> brandList2 = Arrays.asList("Dell", "HP", "Lenovo", "Asus", "Apple", "MSI");
        String longest = "";
        for (String b : brandList2) {
            if (b.length() > longest.length()) {
                longest = b;
            }
        }
        System.out.println("13. Longest brand name: " + longest);

        // 14. String Matching (Prefix)
        List<String> brandsWithA = new ArrayList<>();
        for (String b : Arrays.asList("Dell", "HP", "Lenovo", "Asus")) {
            if (b.startsWith("A")) {
                brandsWithA.add(b);
            }
        }
        System.out.println("14. Brands starting with 'A': " + brandsWithA);

        // 15. Frequency Map
        String apple = "Apple";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : apple.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("15. Character frequency in 'Apple': " + freqMap);
    }
}
