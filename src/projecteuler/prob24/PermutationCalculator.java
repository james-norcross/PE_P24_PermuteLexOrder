package projecteuler.prob24;

public class PermutationCalculator {

	/**
	 * Author: James Norcross
	 * Date: 11.27.14
	 * Purpose: Project Euler Problem 24
	 * Description: generates the permutation of the digits of an integer
	 */
	
	private static int count = 0;
	
	public static void main(String[] args) {
		/*
		 * The following algorithm generates the next permutation lexicographically after a given permutation. It changes the given permutation in-place.

			Find the largest index k such that a[k] < a[k + 1]. If no such index exists, the permutation is the last permutation.
			Find the largest index l greater than k such that a[k] < a[l].
			Swap the value of a[k] with that of a[l].
			Reverse the sequence from a[k + 1] up to and including the final element a[n].
		 */
		
		// try a recursive permutation

	       String list ="0123456789";
	       permute("", list);

	}

	
    private static void permute(String p, String list) {
        int nmax = list.length();
        if (nmax == 0) {
        	System.out.println(p + "  " + ++count);
        }
        else {
            for (int i = 0; i < nmax; i++) {
            	permute(p + list.charAt(i), list.substring(0, i) + list.substring(i+1, nmax));
            }
        }

    }

}
