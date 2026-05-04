package Tugas.Minggu_9;

public class StackKonversi06 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi06() {
        this.size = 32; // Asumsi untuk sistem 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            return -1;
        }
    }
}
