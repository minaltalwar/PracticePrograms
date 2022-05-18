/*
 *Problem Statement: There are 7 floors, 2 Lifts.
 *Initially LiftA is at 0 floor and LiftB at 7th floor.
 *Whenever someone calls the lift from nth floor,lift closest to that floor comes to pick him up.
 *If both the lifts are at equi-distant from the N th floor, them the lift from the lower floor comes up. 
 */
public class ElevatorProblem {
	
	public static void main(String args[]) throws Exception {
		 int[] floors = new int[]{0, 6, 4, 1, 1, 2, 4, 0, 3, 1};
		 int positionA = 0;
		 int positionB = 7;
		 
		 for(int reqPostion : floors) {
			 final int distA = Math.abs(reqPostion - positionA);
			 final int distB = Math.abs(reqPostion - positionB);
			 if (distA < distB) {
				 positionA = reqPostion;
	                System.out.println("A");
	            } else if (distA == distB) {
	                if (positionA < positionB) {
	                	positionA = reqPostion;
	                    System.out.println("A");
	                } else {
	                	positionB = reqPostion;
	                    System.out.println("B");
	                }
	            } else {
	            	positionB = reqPostion;
	                System.out.println("B");
	            }
				 
					 
		 }
		
	}
	 
}
