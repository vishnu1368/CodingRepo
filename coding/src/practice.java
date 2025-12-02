import java.util.ArrayList;

public class practice {
    private int size = 1;
    private ArrayList<Integer> list[];
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++)
                list.add(i);

        int removekey = 5;
        for(int i = 0; i < list.size(); i++)
            if(list.get(i) == removekey){
                list.remove(i);
                break;
            }

        pair p = new pair(4);

        System.out.println(p.hashCode());
        /*
        *
        * */

      /*  int idx = 0;
        for(int x : list){
            if(x == removekey){
                list.removeFirst(2);
                break;
            }
        }
        */

        for(int i : list)
            System.out.print(i + " ");

    }

    /*
    * size =>
    * */

    /*
    Rate  limiting:
       Bucket token - 1000 tokens max  (10, 000)-> 999, 998 .. etc 0 etc
              - refresh 5 secs - K tokens
              -
    *  Leaky bucket - stead token, 5 request/sec backend

    *
    * */

/*
    public Integer get(int userkey){
        int key = hash(userkey, size);
        if(list[key].isEmpty()) return null;

        for(int i : list[key])
                if(i == userkey) return 1;

        return null;
    }

    public int hash(int key, int size){
        return key % size;
    }

    public ArrayList<Integer>[] createHashMap(int size){ //
        ArrayList<Integer> list[] = new ArrayList[size];

        for(int i = 0; i < size; i++)
            list[i] = new ArrayList<>();

        return list;

    }

    HashMap with O(1):

        - add
        - get
        - remove

    Hash Function - less collision

    Hash Function (Hash Function)

    1000 keys:

    995 keys -> unique

    Hash Table:
    - 10 -> 5 different (1,2,3,4,5)

    Worst: - add - O(N)

    Red Black Tree:
*/

}
class pair{
    int k;
    public pair(int k){
        this.k = k;
    }
}
