package Javapractice;

import java.util.HashMap;
import java.util.Scanner;

public class countcharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String l = sc.nextLine();
        HashMap<Character, Integer> map = countfind(l);
        System.out.println(map);
    }

    public static HashMap <Character,Integer> countfind(String l)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < l.length(); i++) {
            char ch = l.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
