package Myproject;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
         0 1 2 3 4
       0 a b c d e
       1 f g h i j
       2 k l m n o
       3 p q r s t
       4 u v w x y
       5 z
        a -> (0,0)
        v -> (4,1)
        u -> (4,0)
        p -> (3,0)

i%5 = col
i/5 = row
          L R U D P

                vishnu
        RDDDDP RRUUUP DDP LUUP UP LLLDDP
         */

        HashMap<Character, int[]> map = new HashMap<>();
        /*
        int cnt = 0;
        for(int i = 0; i < 26; i++)
            map.put((char)('a' + i), new int[]{i})
        */

        map.put('a', new int[]{0, 0});
        map.put('b', new int[]{0, 1});
        map.put('c', new int[]{0, 2});
        map.put('d', new int[]{0, 3});
        map.put('e', new int[]{0, 4});
        map.put('f', new int[]{1, 0});
        map.put('g', new int[]{1, 1});
        map.put('h', new int[]{1, 2});
        map.put('i', new int[]{1, 3});
        map.put('j', new int[]{1, 4});
        map.put('k', new int[]{2, 0});
        map.put('l', new int[]{2, 1});
        map.put('m', new int[]{2, 2});
        map.put('n', new int[]{2, 3});
        map.put('o', new int[]{2, 4});
        map.put('p', new int[]{3, 0});
        map.put('q', new int[]{3, 1});
        map.put('r', new int[]{3, 2});
        map.put('s', new int[]{3, 3});
        map.put('t', new int[]{3, 4});
        map.put('u', new int[]{4, 0});
        map.put('v', new int[]{4, 1});
        map.put('w', new int[]{4, 2});
        map.put('x', new int[]{4, 3});
        map.put('y', new int[]{4, 4});
        map.put('z', new int[]{5, 0});


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string : ");
        String str = sc.next();

        int[] curr = new int[]{0, 0};
        int[] temp, diff;
        StringBuilder res = new StringBuilder("");

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            temp = map.get(ch);
            diff = new int[]{temp[0] - curr[0], temp[1] - curr[1]};
            helper(diff, res);
            curr = temp;
        }

        System.out.println("The required moves to print the given String: " + res.toString());
    }

    public static void helper(int[] arr, StringBuilder res){
        int i;
        if(arr[0] > 0){
            while(arr[0] > 0){
                res.append('D');
                arr[0]--;
            }
        }
        else if(arr[0] < 0){
            while(arr[0] < 0){
                res.append('U');
                arr[0]++;
            }
        }
        if(arr[1] > 0){
            while(arr[1] > 0){
                res.append('R');
                arr[1]--;
            }
        }
        else if(arr[1] < 0){
            while(arr[1] < 0){
                res.append('L');
                arr[1]++;
            }
        }
        res.append('P');
    }

}
