/****************************************************************
 * Purpose : Program to perform permutation of a string.
 * 
 * @author Samarth BM
 * 
 ***************************************************************/

public class Permutation {

	/**
	 * Purpose: Method to permute the given String.
	 * 
	 * @param str string to calculate permutation for
	 * @param l   starting index
	 * @param r   end index
	 */
	private void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	 * Purpose: Method to swap between two indexes.
	 * 
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 */
	private String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String str = "SAM";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n - 1);

	}

}
