package Week_2;

public class example {
	

	// Copyright (c) 11611601 何海彬


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n = 9;
			for (int i = -n; i <= n; i++) {
				int maskIndex = (i > 0 ? -i : i) + n;
				for (int j = -n; j <= n; j++) {
					int printNum = (j < 0 ? -j : j);
					System.out.print(printNum > maskIndex ? "  " : (printNum + " "));
				}
				System.out.println();
			}	
		}
	}

