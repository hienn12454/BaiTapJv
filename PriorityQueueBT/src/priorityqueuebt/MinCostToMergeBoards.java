/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueuebt;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinCostToMergeBoards {
    
        // Phương thức nhập giá trị các tấm ván từ người dùng
        public static int[] inputBoards() {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng tấm ván
        System.out.print("Nhập số lượng tấm ván: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng chứa các tấm ván
        int[] boards = new int[n];

        // Nhập độ dài từng tấm ván
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập độ dài của tấm ván thứ " + (i + 1) + ": ");
            boards[i] = scanner.nextInt();
        }

        return boards;
    }

    public static int minCostToMergeBoards(int[] boards) {
        // Tạo Priority Queue (Min-Heap) để lưu các tấm ván
        PriorityQueue pq = new PriorityQueue();

        // Thêm tất cả các tấm ván vào Priority Queue
        for (int board : boards) {
            pq.add(board);
        }

        int totalCost = 0;

        // Lặp lại quá trình ghép cho đến khi chỉ còn 1 tấm ván
        while (pq.heap.size() > 1) {
            // Lấy hai tấm ván nhỏ nhất
            int first = pq.poll();
            int second = pq.poll();

            // Tính chi phí ghép hai tấm ván
            int cost = first + second;
            totalCost += cost;

            // Thêm tấm ván mới sau khi ghép vào lại Priority Queue
            pq.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        // Nhập giá trị các tấm ván từ người dùng
        int[] boards = inputBoards();

        // Tính và in ra chi phí nhỏ nhất để ghép các tấm ván
        int result = minCostToMergeBoards(boards);
        System.out.println("Chi phí nhỏ nhất để ghép các tấm ván là: " + result);
    }
}

