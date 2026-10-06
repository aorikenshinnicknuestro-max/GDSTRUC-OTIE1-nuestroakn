import java.util.EmptyStackException;

public class CardStack {

    private Card[] data;
    private int top;

    CardStack(int size){
        data = new Card[size];
        top = -1;
    }

    public void push(Card card){
        if (top == data.length - 1){
            throw new StackOverflowError();
        }

        top++;
        data[top] = card;
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Card card = data[top];
        top--;

        return card;
    }

    public Card peek(){
        if (isEmpty()){
            throw new EmptyStackException();
    }
        return data[top];
}

public boolean isEmpty() {
    return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

