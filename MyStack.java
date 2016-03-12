public class MyStack {
   private int maxSize;
   private long[] stackArray;
   private int top;
   public MyStack(int s) {
      maxSize = s;
      stackArray = new long[s];
      top = -1;
   }
   public void push(long j) {
	   top++;
      stackArray[top] = j;
   }
   public long pop() {
	   int temp= top;
	   top--;
      return stackArray[temp];
   }

   public boolean isEmpty() {
	   if(top==-1){
      return true;
	   }
	   else{
		   return false;
	   }
   }
   public boolean isFull() {
	   if(maxSize-1==top){
      return true;
	   }
	   else
		   return false;
   }
   public static void main(String[] args) {
      MyStack myStack = new MyStack(10); 
      myStack.push(1);
      myStack.push(2);
      myStack.push(3);
      myStack.push(4);
      myStack.push(5);
      while (!myStack.isEmpty()) {        
         System.out.print(myStack.pop()+" ");
         
      }
      
     
   }
}