import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Stack s1 = new Stack(100);
        Queue q1 = new Queue(100);
        String word;
        System.out.println("Enter a Word");
        word=input.nextLine();
        int n=word.length();
        char[] letters=word.toCharArray();
        int i=0;
        while (i<n){
            s1.Push(letters[i]);
            q1.EnQueue(letters[i]);
            i++;
        }
        boolean Result=true;
        while (!s1.İsEmpty()){
            if (s1.Pop()!= q1.DeQueue()){
                Result=false;
                break;
            }
        }
        if (Result){
            System.out.println(word+" Word is Palidrom");
        }else {
            System.out.println(word+" Word is  Not Palidrom");
        }


    }
}
