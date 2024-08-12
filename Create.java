import java.util.Iterator;
import java.util.Stack;
public class Create{
public static void main(String[]args){
  Stack<Integer> stack = new Stack<>();
  stack.push(10);
  stack.push(30);
  stack.push(20);
  Iterator<Integer> iterator =stack.iterator();
  while(iterator.hasNext()){
    System.out.println(iterator.next());
  }
}
}
