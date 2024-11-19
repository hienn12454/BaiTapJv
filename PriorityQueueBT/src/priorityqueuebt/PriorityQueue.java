/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueuebt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class PriorityQueue {
   
    List<Integer> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    // Hàm để thêm phần tử vào Priority Queue
    public void add(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    // Hàm để lấy phần tử nhỏ nhất từ Priority Queue (Min-Heap)
    public int poll() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        // Lấy phần tử nhỏ nhất
        int minValue = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0);
        }

        return minValue;
    }

    // Kiểm tra xem Priority Queue có rỗng không
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Hàm heapify từ dưới lên sau khi thêm phần tử
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(parentIndex) > heap.get(index)) {
                swap(parentIndex, index);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    // Hàm heapify từ trên xuống sau khi lấy phần tử
    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestIndex = index;

            if (leftChildIndex < size && heap.get(leftChildIndex) < heap.get(smallestIndex)) {
                smallestIndex = leftChildIndex;
            }
            if (rightChildIndex < size && heap.get(rightChildIndex) < heap.get(smallestIndex)) {
                smallestIndex = rightChildIndex;
            }

            if (smallestIndex != index) {
                swap(index, smallestIndex);
                index = smallestIndex;
            } else {
                break;
            }
        }
    }

    // Hàm hoán đổi hai phần tử trong heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}

