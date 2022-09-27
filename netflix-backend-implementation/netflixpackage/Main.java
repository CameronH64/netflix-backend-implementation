// Cameron Holbrook
// CSCI 3381

package netflixpackage;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//==================== ShowCollection Testing ====================
		
		// Create ShowInWeek objects for testing.
		ShowInWeek topShow1 = new ShowInWeek("2022-09-04", "Films (English)", 1, "Me Time", "N/A", 56560000, 2);
		ShowInWeek topShow2 = new ShowInWeek("2022-09-04", "Films (English)", 2, "Love in the Villa", "N/A", 41220000, 1);
		ShowInWeek topShow3 = new ShowInWeek("2022-09-04", "Films (English)", 3, "I Came By", "N/A", 30790000, 1);
		ShowInWeek topShow4 = new ShowInWeek("2022-09-04", "Films (English)", 4, "That's Amor", "N/A", 30790000, 1);
		ShowInWeek topShow5 = new ShowInWeek("2022-09-04", "Films (English)", 5, "Look Both Ways", "N/A", 30790000, 1);
		ShowInWeek topShow6 = new ShowInWeek("2022-09-04", "Films (English)", 6, "Day Shift", "N/A", 30790000, 1);
		ShowInWeek topShow7 = new ShowInWeek("2022-09-04", "Films (English)", 7, "The Next 365 Days", "N/A", 30790000, 1);
		ShowInWeek topShow8 = new ShowInWeek("2022-09-04", "Films (English)", 8, "Purple Hearts", "N/A", 30790000, 1);
		ShowInWeek topShow9 = new ShowInWeek("2022-09-04", "Films (English)", 9, "The Gray Man", "N/A", 30790000, 1);
		ShowInWeek topShow10 = new ShowInWeek("2022-09-04", "Films (English)", 10, "Collateral", "N/A", 30790000, 1);
		ShowInWeek topShow11 = new ShowInWeek("2022-09-04", "Films (Non-English)", 1, "Loving Adults", "N/A", 29940000, 2);
		ShowInWeek topShow12 = new ShowInWeek("2022-09-04", "Films (Non-English)", 2, "Under Her Control", "N/A", 15700000, 1);
		ShowInWeek topShow13 = new ShowInWeek("2022-09-04", "Films (Non-English)", 3, "Fenced In", "N/A", 9410000, 1);
		ShowInWeek topShow14 = new ShowInWeek("2022-09-04", "Films (Non-English)", 4, "Seoul Vibe", "N/A", 8670000, 2);
		ShowInWeek topShow15 = new ShowInWeek("2022-09-04", "Films (Non-English)", 5, "HIT: The First Case", "N/A", 7300000, 1);
		ShowInWeek topShow16 = new ShowInWeek("2022-09-04", "Films (Non-English)", 6, "The Figo Affair: The Transfer that Changed Football", "N/A", 3700000, 2);
		ShowInWeek topShow17 = new ShowInWeek("2022-09-04", "Films (Non-English)", 7, "School Life", "N/A", 3420000, 1);
		ShowInWeek topShow18 = new ShowInWeek("2022-09-04", "Films (Non-English)", 8, "Royalteen", "N/A", 3040000, 3);
		ShowInWeek topShow19 = new ShowInWeek("2022-09-04", "Films (Non-English)", 9, "Rise of the Legend", "N/A", 2630000, 1);
		ShowInWeek topShow20 = new ShowInWeek("2022-09-04", "Films (Non-English)", 10, "Watch Out, We're Mad", "N/A", 2580000, 2);

		ShowInWeek blankShow = new ShowInWeek();
		
		// Test addNewShow method of ShowCollection class.
		ShowCollection completeShowCollection = new ShowCollection();
		completeShowCollection.addNewShow(topShow1);
		completeShowCollection.addNewShow(topShow2);
		completeShowCollection.addNewShow(topShow3);
		completeShowCollection.addNewShow(topShow4);
		completeShowCollection.addNewShow(topShow5);
		completeShowCollection.addNewShow(topShow6);
		completeShowCollection.addNewShow(topShow7);
		completeShowCollection.addNewShow(topShow8);
		completeShowCollection.addNewShow(topShow9);
		completeShowCollection.addNewShow(topShow10);
		completeShowCollection.addNewShow(topShow11);
		completeShowCollection.addNewShow(topShow12);
		completeShowCollection.addNewShow(topShow13);
		completeShowCollection.addNewShow(topShow14);
		completeShowCollection.addNewShow(topShow15);
		completeShowCollection.addNewShow(topShow16);
		completeShowCollection.addNewShow(topShow17);
		completeShowCollection.addNewShow(topShow18);
		completeShowCollection.addNewShow(topShow19);
		completeShowCollection.addNewShow(topShow20);
		// Testing toString and addNewShow methods.
		System.out.println("================= Test toString() and addNewShow() methods =================");
		System.out.println(completeShowCollection);
		System.out.println();
		
		// Test purgeShow method of ShowCollection class.
//		System.out.println("================= Test purgeShow method of ShowCollection class =================");
//		completeShowCollection.purgeShow("Me Time");
//		System.out.println(completeShowCollection);
//		System.out.println();
		
		// Test unpurgeShow method of ShowCollection class.
//		System.out.println("================= Test unpurgeShow method of ShowCollection class =================");
//		completeShowCollection.unpurgeShow("Me Time");
//		System.out.println(completeShowCollection);
//		System.out.println();

		// Test the suggestRandomShow
//		System.out.println("================= Test suggest random show =================");
//		System.out.println(completeShowCollection.suggestRandomShow());
//		System.out.println();
		
		// Test the suggest prediction given a single ShowInWeek.
		System.out.println("================= Test suggest prediction single show =================");
		for(int i = 0; i < 100; i++) {
			System.out.println(completeShowCollection.suggestPredictive(topShow1));
		}
		System.out.println();
		
		// Test the suggest prediction given a ShowCollection.
//		System.out.println("================= Test suggest prediction show collection =================");
//		System.out.println(completeShowCollection.suggestPredictive(completeShowCollection));
//		System.out.println();

		
		// Test the setters of ShowInWeek
//		System.out.println("================= Test setters of ShowInWeek =================");
//		System.out.println(completeShowCollection.getShowStorage());
		
		System.out.println();
		System.out.println();
		
		//==================== ShowInWeek Testing ====================
		
		System.out.println("================= ShowInWeek Testing: =================");
		System.out.println();

		ShowInWeek show1 = new ShowInWeek("2022-09-04", "Films (English)", 3, "I Came By", "N/A", 30790000, 1);
		ShowInWeek show2 = new ShowInWeek("2022-09-04", "Films (English)", 4, "That's Amor", "N/A", 30790000, 1);
		ShowInWeek show3 = new ShowInWeek("2022-09-04", "Films (English)", 4, "That's Amor", "N/A", 30790000, 1);
		
		System.out.println("Comparing show1 and show2 [expect false]: " + show1.equals(show2));
		System.out.println("Comparing show2 and show3 [expect true]: " + show2.equals(show3));
		
	}

}


/* Code Dump

		ShowInWeek topShow3 = new ShowInWeek("2022-09-04", "Films (English)", 3, "I Came By", "N/A", 30790000, 1);
		ShowInWeek topShow4 = new ShowInWeek("2022-09-04", "Films (English)", 4, "That's Amor", "N/A", 30790000, 1);
		ShowInWeek topShow5 = new ShowInWeek("2022-09-04", "Films (English)", 5, "Look Both Ways", "N/A", 30790000, 1);
		ShowInWeek topShow6 = new ShowInWeek("2022-09-04", "Films (English)", 6, "Day Shift", "N/A", 30790000, 1);
		ShowInWeek topShow7 = new ShowInWeek("2022-09-04", "Films (English)", 7, "The Next 365 Days", "N/A", 30790000, 1);
		ShowInWeek topShow8 = new ShowInWeek("2022-09-04", "Films (English)", 8, "Purple Hearts", "N/A", 30790000, 1);
		ShowInWeek topShow9 = new ShowInWeek("2022-09-04", "Films (English)", 9, "The Gray Man", "N/A", 30790000, 1);
		ShowInWeek topShow10 = new ShowInWeek("2022-09-04", "Films (English)", 10, "Collateral", "N/A", 30790000, 1);
		ShowInWeek topShow11 = new ShowInWeek("2022-09-04", "Films (Non-English)", 1, "Loving Adults", "N/A", 29940000, 2);
		ShowInWeek topShow12 = new ShowInWeek("2022-09-04", "Films (Non-English)", 2, "Under Her Control", "N/A", 15700000, 1);
		ShowInWeek topShow13 = new ShowInWeek("2022-09-04", "Films (Non-English)", 3, "Fenced In", "N/A", 9410000, 1);
		ShowInWeek topShow14 = new ShowInWeek("2022-09-04", "Films (Non-English)", 4, "Seoul Vibe", "N/A", 8670000, 2);
		ShowInWeek topShow15 = new ShowInWeek("2022-09-04", "Films (Non-English)", 5, "HIT: The First Case", "N/A", 7300000, 1);
		ShowInWeek topShow16 = new ShowInWeek("2022-09-04", "Films (Non-English)", 6, "The Figo Affair: The Transfer that Changed Football", "N/A", 3700000, 2);
		ShowInWeek topShow17 = new ShowInWeek("2022-09-04", "Films (Non-English)", 7, "School Life", "N/A", 3420000, 1);
		ShowInWeek topShow18 = new ShowInWeek("2022-09-04", "Films (Non-English)", 8, "Royalteen", "N/A", 3040000, 3);
		ShowInWeek topShow19 = new ShowInWeek("2022-09-04", "Films (Non-English)", 9, "Rise of the Legend", "N/A", 2630000, 1);
		ShowInWeek topShow20 = new ShowInWeek("2022-09-04", "Films (Non-English)", 10, "Watch Out, We're Mad", "N/A", 2580000, 2);




		completeShowCollection.addNewShow(topShow3);
		completeShowCollection.addNewShow(topShow4);
		completeShowCollection.addNewShow(topShow5);
		completeShowCollection.addNewShow(topShow6);
		completeShowCollection.addNewShow(topShow7);
		completeShowCollection.addNewShow(topShow8);
		completeShowCollection.addNewShow(topShow9);
		completeShowCollection.addNewShow(topShow10);
		completeShowCollection.addNewShow(topShow11);
		completeShowCollection.addNewShow(topShow12);
		completeShowCollection.addNewShow(topShow13);
		completeShowCollection.addNewShow(topShow14);
		completeShowCollection.addNewShow(topShow15);
		completeShowCollection.addNewShow(topShow16);
		completeShowCollection.addNewShow(topShow17);
		completeShowCollection.addNewShow(topShow18);
		completeShowCollection.addNewShow(topShow19);
		completeShowCollection.addNewShow(topShow20);

*/
