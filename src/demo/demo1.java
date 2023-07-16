package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class demo1 {
    public static int search(String text) {
        ArrayList<String> listCheck = new ArrayList<String>();
        listCheck.add("aw");
        listCheck.add("aa");
        listCheck.add("dd");
        listCheck.add("ee");
        listCheck.add("oo");
        listCheck.add("ow");
        listCheck.add("w");

        String[] listCut = text.split("");
        int count = 0;
        for (int i =0;i < listCheck.size() ;i++){
            if(text.contains(listCheck.get(i))) count++;
        }
        return count;
    }

    public static Boolean ValidateInput(String input){
        if(input == null || input.length() == 0) return false;

        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);

        Boolean isHasSpace = input.contains(" ");

       Boolean isHasSpecialCharacters = p.matcher(input).find();
        return !(isHasSpace || isHasSpecialCharacters);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int result;
        String input = "";
        while(!ValidateInput(input)){
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        }

        result = search(input);
        System.out.println(result);
    }
}