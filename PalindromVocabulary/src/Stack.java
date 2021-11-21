public class Stack {
    Node top;
    int size;
    int count;

    public Stack(int size) {

        this.size=size;
        top=null;
        count=0;
    }
    void Push(char ch){
        if (!İsFull()){
            Node eleman=new Node(ch);
            if (İsEmpty()){
                top=eleman;
            }else{
  eleman.next=top;
  top=eleman;
            }
            count++;
        }
    }
    char Pop(){
    if (!İsEmpty()){
    char harf=top.harf;
    top=top.next;
    count--;
    return harf;
}else {
    return '-';
}
    }
    boolean İsEmpty(){
        return count==0;
    }
    boolean İsFull(){
        return count==size;
    }
}
