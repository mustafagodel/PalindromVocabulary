import java.util.Random;

public class Queue {
    Node front;
    Node rear;
    int cnt;
int size;

    public Queue(int size) {
        this.size = size;
        front=null;
        rear=null;
        cnt=0;
    }
    void EnQueue(char ch){
         if (!IsFull()){
             Node eleman=new Node(ch);
             if (IsEmpty()) {
                 front=eleman;
                 rear=eleman;
             }else{
             rear.next = eleman;
             rear = eleman;
             }
             cnt++;
         }
    }
    char DeQueue(){
        if (!IsEmpty()){
            char ch=front.harf;
            front=front.next;
            cnt--;
            return ch;
        }else{
            return '+';
        }
    }

    boolean IsFull(){
        return cnt==size;
    }
    boolean IsEmpty(){
        return cnt==0;
    }
}
