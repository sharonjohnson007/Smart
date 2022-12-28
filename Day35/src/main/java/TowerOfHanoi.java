package main.java;

/**
 * Tower of Hanoi consists of three towers with n disks placed one over the other.
 * Only one disk can be moved at a time. No disk can be placed on top of the smaller disk.
 */

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(2,'A','B','C');
    }
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod) {
        if (n == 1) {
            System.out.println("Take disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, helper_rod, to_rod, from_rod);
    }
}
