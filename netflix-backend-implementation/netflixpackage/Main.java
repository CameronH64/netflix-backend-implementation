// Cameron Holbrook
// CSCI 3381

package netflixpackage;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// The purpose of the chunks of code below can be seen by their respective print statements.
		// Also, some of the code is commented out because when reading the completeDataSet.txt file, it's too much output for the Java console window.
		// Those lines can be uncommented when reading smaller files, however.
		
		System.out.println("============================== Test ShowCollection Class ==============================");
		System.out.println();
		
		System.out.println("================= Test ShowCollection Default Constructor ======================");
		ShowCollection completeShowCollection = new ShowCollection();
		System.out.println(completeShowCollection);
		System.out.println("... ShowCollection Default Constructor Done.");
		System.out.println();
		
		// Test file reading at beginning of program.
		System.out.println("================= Test File Reading =======================================");
		completeShowCollection.readFile();
		System.out.println("... Reading done.");
		System.out.println();
		
		// completeShowCollection is now a ShowCollection instance loaded with data.
		
		System.out.println("================= Test Default ShowInWeek Constructor =====================");
		ShowInWeek topShow1 = new ShowInWeek();
		System.out.println("... ShowInWeek instance created.");
		System.out.println();
		
		System.out.println("================= Test Overloaded ShowInWeek Constructor ==================");
		ShowInWeek topShow2 = new ShowInWeek("05-02-12", "Films (English)", 7, "Playing in the 4th Dimension", "N/A", 11235813, 7);
		System.out.println("... ShowInWeek instance created.");
		System.out.println();
		// topShow2 is used later in the suggestPredictive() method, given a collection of shows.
		
		// Test the setters and getters of ShowInWeek.
		System.out.println("================= Test ShowInWeek Getters and Setters =====================");
		System.out.println("Adding a new ShowInWeek object to the ShowCollection instance.");
		System.out.println("Before: ");
		System.out.println("Get week: " + topShow1.getWeek());
		System.out.println("Get category: " + topShow1.getCategory());
		System.out.println("Get weeklyRank: " + topShow1.getWeeklyRank());
		System.out.println("Get showTitles: " + topShow1.getShowTitles());
		System.out.println("Get seasonTitle: " + topShow1.getSeasonTitle());
		System.out.println("Get weeklyHoursViewed: " + topShow1.getWeeklyHoursViewed());
		System.out.println("Get cumulativeWeeksTop10: " + topShow1.getCumulativeWeeksTop10());
		System.out.println();
		
		System.out.println("After: ");
		topShow1.setWeek("03-14-1592");
		topShow1.setCategory("TV (English)");
		topShow1.setWeeklyRank(9);
		topShow1.setShowTitles("Transcendental Numbers: The Awesomeness of Pi");
		topShow1.setSeasonTitle("N/A");
		topShow1.setWeeklyHoursViewed(65358979);
		topShow1.setCumulativeWeeksTop10(3);

		System.out.println(topShow1);
		System.out.println("Scroll to the bottom of the output text files to see this show's addition!");
		System.out.println();
		
		completeShowCollection.addNewShow(topShow1);

		System.out.println("================= Test toString() and addNewShow() ========================");
//		System.out.println(completeShowCollection);
		System.out.println("Note: A ShowCollection instance calls the ShowInWeek toString method. "
				+ "So, both ShowCollection and ShowInWeek toString() methods are confirmed to work properly.");
		System.out.println();
		
		System.out.println("================= Test PurgeShow Method ===================================");
		completeShowCollection.purgeShow("Me Time");
		System.out.println(completeShowCollection);
		System.out.println();
		
		System.out.println("================= Test unpurgeShow() Method ===============================");
		completeShowCollection.unpurgeShow("Me Time");
		System.out.println(completeShowCollection);
		System.out.println();

		System.out.println("================= Test suggestRandomShow() ================================");
		System.out.println(completeShowCollection.suggestRandomShow());
		System.out.println();
		
		System.out.println("================= Test suggestPredictive(), Given a Single ShowInWeek ===========");
		System.out.println(completeShowCollection.suggestPredictive(topShow2));
		System.out.println();
		
		System.out.println("================= Test suggestPredictive(), Given ShowCollection ===========");
		ShowCollection subCollection = new ShowCollection();
		ShowInWeek suggestionShow1 = new ShowInWeek("2022-09-04", "Films (English)", 1, "Me Time", "N/A", 56560000, 2);
		ShowInWeek suggestionShow2 = new ShowInWeek("2022-09-04", "TV (English)", 1, "Echoes", "Echoes: Limited Series", 36580000, 3);
		ShowInWeek suggestionShow3 = new ShowInWeek("2022-08-21", "TV (English)", 6, "Manifest", "Manifest: Season 1", 10000000, 16);
		subCollection.addNewShow(suggestionShow1);
		subCollection.addNewShow(suggestionShow2);
		subCollection.addNewShow(suggestionShow3);
		System.out.println("... SubCollection Created.");
		System.out.println();
		
		System.out.println(completeShowCollection.suggestPredictive(subCollection));
		System.out.println();
		
		System.out.println("================= Test getShows() Given a Single Week =====================");
		System.out.println(completeShowCollection.getShows("2022-09-04"));
		System.out.println();
		
		System.out.println("================= Test File Writing During Program Running ================");
		completeShowCollection.writeFile("./singleWriteData.txt");			// The "home" that Java looks for is the root of the project.
		System.out.println("... Single write done! (Look for \"singleWriteData.txt\")");
		System.out.println();
		
		// Test file writing at end of program.
		System.out.println("================= Test File Writing At End of Program =====================");
		completeShowCollection.writeFile();
		System.out.println("... Final write done! (Look for \"outputData.txt\")");
		System.out.println();
		
		
		
		
		
		System.out.println("================================ Test ShowInWeek Class ================================");
		System.out.println();
		
		System.out.println("Note: ShowInWeek constructor, getters, and setters were tested above, so this section tests the rest of the ShowInWeek class.");
		System.out.println();
		
		System.out.println("===== Test ShowInWeek Equals Method ===========================");
		ShowInWeek show1 = new ShowInWeek("2022-09-04", "Films (English)", 3, "I Came By", "N/A", 30790000, 1);
		ShowInWeek show2 = new ShowInWeek("2022-09-04", "Films (English)", 4, "That's Amor", "N/A", 30790000, 1);
		ShowInWeek show3 = new ShowInWeek("2022-09-04", "Films (English)", 4, "That's Amor", "N/A", 30790000, 1);
		System.out.println("... ShowInWeek object instantiation done.");
		System.out.println();
		
		System.out.println("Show 1: " + show1);
		System.out.println("Show 2: " + show2);
		System.out.println("Show 3: " + show3);
		
		System.out.println();
		
		System.out.println("Comparing show1 and show2 [expect false]: " + show1.equals(show2));
		System.out.println("Comparing show2 and show3 [expect true]: " + show2.equals(show3));
		
		
	}

}

