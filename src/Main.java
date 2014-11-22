import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	private static int JOBS_AMOUNT = 200;
	
	public static void main(String[] args)
	{
		
		File jobsFile = new File("91ex20141122.txt");
		int[][] jobsProcessTime = new int[JOBS_AMOUNT][12];
		try {
			Scanner scan = new Scanner(jobsFile);
			
			for(int i = 0; i < JOBS_AMOUNT; ++i) {
				for(int j = 0; j < 12; ++j) {
					jobsProcessTime[i][j] = scan.nextInt();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
