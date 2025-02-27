public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pyramid(int numba) {
		String draw = "";
		for (int i = 1; i <= numba; i++) {
			for (int x = i; x < numba; x++) {
				draw += " ";
			}

			for (int p = 0; p < i; p++) {
				if(p > 0) {
					draw += " ";
				}
				draw += "*";
			}

			if (i < numba) {
				draw += "\n";
			}
		}

		return draw;
	}

	public static String square(int numba2) {
			String draw = "";
			for (int i = 0; i < numba2; i++) {
				for(int x = 0; x < numba2; x++) {
					if (i < numba2 - 1 && i > 0 && x < numba2 -1 && x > 0) {
						draw += " ";
					}

					else {
						draw += "*";
					}
				}

				if (i < numba2 -1) {
					draw += "\n";
				}
			}

			return draw;
	}

	public static boolean hasLowercase(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLowerCase(string.charAt(i))) {
				return true;
			}
		}
		return false;
	}

}
