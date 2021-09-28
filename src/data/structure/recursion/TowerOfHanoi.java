package data.structure.recursion;

public class TowerOfHanoi {

	/**
	 * Tower of Hanoi is a mathematical puzzle where we have three rods and n
	 * disks. The objective of the puzzle is to move all disks from source rod
	 * to destination rod using third rod (say auxiliary). The rules are :
	 * 
	 * @param disks
	 * @param source
	 * @param auxiliary
	 * @param destination
	 */
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if (disks == 1) {
			System.out.println(source + " " + destination);
			return;
		}
		if (disks == 0) {
			return;
		}
		towerOfHanoi(disks - 1, source, destination, auxiliary);
		System.out.println(source + " " + destination);
		towerOfHanoi(disks - 1, auxiliary, source, destination);
	}
	
	
	
}

