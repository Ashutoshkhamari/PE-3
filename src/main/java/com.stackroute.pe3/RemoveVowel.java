package com.stackroute.pe3;


import java.util.Scanner;

public class RemoveVowel {

    public String[] removeVowels(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains("a")) {
                input[i] = input[i].replace("a", "");
            }

            if (input[i].contains("e")) {
                input[i] = input[i].replace("e", "");
            }

            if (input[i].contains("i")) {
                input[i] = input[i].replace("i", "");
            }

            if (input[i].contains("o")) {
                input[i] = input[i].replace("o", "");
            }

            if (input[i].contains("u")) {
                input[i] = input[i].replace("u", "");
            }
        }
        return input;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the place Number ");

        int num_of_elements = input.nextInt();
        String[] elements=new String[num_of_elements];

        for (int i = 0; i < num_of_elements; i++) {

            System.out.println("Enter an element");
            elements[i]=input.next() + " ";
        }


        RemoveVowel a = new RemoveVowel();
        String[] modifiedWords=a.removeVowels(elements);
        for (String word:modifiedWords) {
            System.out.println(word);
        }

    }
}
