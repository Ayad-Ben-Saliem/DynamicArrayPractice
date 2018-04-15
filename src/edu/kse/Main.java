package edu.kse;

public class Main {
    public static void main(String[] args) {

        Array<String> array1 = new Array<>(0);
        array1.add("Welcome")
                .add("to")
                .add("Java")
                .add("Programming")
                .add("Language");

        System.out.println("array1 : " + array1);

        Array<String> array2 = array1.replaceElementAt(2, "C++");

        System.out.println("array2 : " + array2);

        

    }
}