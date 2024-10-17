public class stack3 {
    int[] stack3 = new int[10];
    int top=-1;
    public void push(int elem){
        if(top>=9){
            System.out.println("Stack Overflow!!!");
            return;
        }
        else{
            top++;
            stack3[top]=elem;
        }
    }
    public int pop(){
        if(top>0){
            int t=stack3[top];
            top--;
            return t;
        }
        else{
            System.out.println("Stak UnderFlow!!!");
        }
        return -1;
    }
    public static void main(String[] args) {
        stack3 s=new stack3();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
