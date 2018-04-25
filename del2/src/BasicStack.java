import java.util.*;

public class Stack<T> {

    private ArrayList<T> data; 
    private int pointer;

    public Stack(){

        data = new ArrayList<T>(); 
        pointer = 0;
        }

    /**
     * Push an item on the top of the Stack.
     * @param item An item to put on the stack.
     * @return Itself so that you can chain pushes.
     */
    Stack<T> push(T item){
        data.add(item);
        pointer++;
        return data;
    }
    
    /**
     * Pops the topmost item of the stack.
     * @return The topmost item.
     */
    T pop(){
        if(pointer > 0){
            pointer--;
            T temp = data.get(pointer);
            data.remove(pointer);
            return temp;
        } else {
            System.out.println("There are no items on the stack");
            return null;
        } 
    }


    /**
     * Returns the element on the top of the stack, but does not remove it.
     * @return The topmost element of the stack.
     */
    T peek(){
        if(pointer > 0){
            return data.get(pointer-1);
        } else {
            System.out.println("There are no items on the stack");
            return null;
        }
    }

    /**
     * Checks if the item is on the stack.
     * @param item The item to search for.
     * @return True if the item is found on the stack.
     */
    boolean contains(T item){
        for(int i = 0; i < pointer; i++){
            if(data.get(i) == item){
                return true;
            }
        }
        return false;
    }

    /**
     * Get the item of the stack. Will pop until it finds it or throw an IllegalArgumentException if not found.
     * @param item item to get of the stack.
     * @return Object item of the stack.
     * @throws IllegalArgumentException if item is not found
     */
    T access(T item) throws IllegalArgumentException{
        while (pointer > 0){
            pointer--;
            T temp = data.get(pointer);
            data.remove(pointer);
            if(temp == item){
            return temp;
            }
        }
        
        throw new IllegalArgumentException(item + "could not be found on the stack");
    }

    /**
     * Tests if this stack is empty. Returns true if the stack is empty, and returns false if the stack contains elements.
     * @return True if it is empty.
     */
    boolean isEmpty(){
        return (pointer == 0);
    }
}

