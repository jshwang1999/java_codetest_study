package problems.ch9;

import java.util.TreeSet;
import java.util.Scanner;

public class RemoveDuplicateLetters {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("문자열을 입력해주세요: ");
            String input = sc.nextLine();
            String result = removeDuplicates(input);
            System.out.println("입력값: " + input);
            System.out.println("중복을 제거하고 정렬된 출력값: " + result);
        }

        public static String removeDuplicates(String s) {
            TreeSet<Character> set = new TreeSet<>();

            for (char ch : s.toCharArray()) {
                set.add(ch);
            }

            StringBuilder result = new StringBuilder();
            for (char ch : set) {
                result.append(ch);
            }

            return result.toString();
        }
    }

