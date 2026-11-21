package string;

public class Reverss {
    public static void main(String[] args) {
        String a = "vaishanvi";

        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
    }
}


//vaishnavi
//length -->total no of chararcter-->9
//9-1=8
//string indexing strat from 0-->last is 8
//in that i is greter than or equal to 0
//print becuse it shuled write on same line
//i-- print char by -1