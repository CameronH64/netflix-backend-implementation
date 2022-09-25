// Cameron Holbrook
// CSCI 3381

package netflixpackage;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
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
		
		// Add the ShowInWeek objects to the collection class.
		ArrayList<ShowInWeek> completeShowCollection = new ArrayList<ShowInWeek>();
		completeShowCollection.add(topShow1);
		completeShowCollection.add(topShow2);
//		completeShowCollection.add(topShow3);
//		completeShowCollection.add(topShow4);
//		completeShowCollection.add(topShow5);
//		completeShowCollection.add(topShow6);
//		completeShowCollection.add(topShow7);
//		completeShowCollection.add(topShow8);
//		completeShowCollection.add(topShow9);
//		completeShowCollection.add(topShow10);
//		completeShowCollection.add(topShow11);
//		completeShowCollection.add(topShow12);
//		completeShowCollection.add(topShow13);
//		completeShowCollection.add(topShow14);
//		completeShowCollection.add(topShow15);
//		completeShowCollection.add(topShow16);
//		completeShowCollection.add(topShow17);
//		completeShowCollection.add(topShow18);
//		completeShowCollection.add(topShow19);
//		completeShowCollection.add(topShow20);
		
		System.out.println(completeShowCollection);
		
	}

}
