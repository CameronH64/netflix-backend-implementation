package netflixpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Iterator;

public class ShowCollection {

	private ArrayList<ShowInWeek> showStorage = new ArrayList<ShowInWeek>();
	private String fileName;

	public ShowCollection() {
		showStorage = new ArrayList<ShowInWeek>();
		fileName = "./partialData.txt";
	}

	public void addNewShow(ShowInWeek newShowInWeek) {
		showStorage.add(newShowInWeek);
		fileName = "./partialData.txt";
	}

	public void purgeShow(String showToPurge) {
		// Append " [PURGED]" to end of each show title.

		for (ShowInWeek showInWeek : showStorage) {
			if (showInWeek.getShowTitles().equals(showToPurge)) {
				showInWeek.setShowTitles(showInWeek.getShowTitles() + " [PURGED]");		
			}
		}
	}

	public void unpurgeShow(String showToUnpurge) {
		// Remove " [PURGED]" from the end of each show title (that is chosen to be unpurged);

		for (ShowInWeek showInWeek : showStorage) {
			if (showInWeek.getShowTitles().equals(showToUnpurge + " [PURGED]")) {
				showInWeek.setShowTitles(showInWeek.getShowTitles().replace(" [PURGED]", ""));		
			}
		}
	}

	public String suggestRandomShow() {

		// Generate a number the size of the ShowCollection instance.
		Random random = new Random();

		// Then, get the length of the ShowCollection.
		// With this length, get a random number with a maximum of the ShowCollection length.
		int length_random_number = random.nextInt(showStorage.size());
		String suggestedShow = showStorage.get(length_random_number).getShowTitles();		// Use the random number to access that index.

		return suggestedShow;

	}

	// Suggest based on a single given show.
	public String suggestPredictive(ShowInWeek show) {

		// Design to suggest a show given a single show:
		// Must be the same category (which is to say, language)

		// Create an ArrayList object of only same category as given show.
		// This will be used as a pool to pull from later.
		ArrayList<ShowInWeek> categoryList = new ArrayList<ShowInWeek>();		
		int count = 0;

		// Filter out english or non-english
		if (show.getCategory().contains("(English)")) {
			for (ShowInWeek showInWeek : showStorage) {
				if (showInWeek.getCategory().contains("(English)") && !showInWeek.getShowTitles().equals(show.getShowTitles())) {
					categoryList.add(showInWeek);
					count++;
				}
			}

		} else if (show.getCategory().contains("(Non-English)")) {
			for (ShowInWeek showInWeek : showStorage) {
				if (showInWeek.getCategory().contains("(Non-English)") && !showInWeek.getShowTitles().equals(show.getShowTitles())) {
					categoryList.add(showInWeek);
					count++;
				}
			}
		}

		Random random = new Random();

		// Generate a number the size of the ShowCollection instance.
		// With this length, generate a random number with that as its maximum.
		int length_random_number = random.nextInt(count);
		String suggestedShow = categoryList.get(length_random_number).getShowTitles();		// Use the random number to access that index.

		return suggestedShow;

	}

	// Suggest based on a set of shows.
	public ShowCollection suggestPredictive(ShowCollection shows) {
		// Design to suggest a show given a collection of shows:
		// Must be greater than or equal to the average of the whole weeklyHoursViewed of collection shows.

		ShowCollection suggestionList = new ShowCollection();
		int hoursViewedAverage = 0;

		// Cycle through shows showStorage ArrayList data member; add up each weeklyHoursViewed.
		for (ShowInWeek showInWeek : shows.showStorage) {
			hoursViewedAverage += showInWeek.getWeeklyHoursViewed();
		}

		hoursViewedAverage /= shows.showStorage.size();

		// Cycle through shows showStorage
		for (ShowInWeek showInWeek : shows.showStorage) {
			if (showInWeek.getWeeklyHoursViewed() >= hoursViewedAverage) {
				suggestionList.addNewShow(showInWeek);
			}
		}

		return suggestionList;
	}

	public ArrayList<ShowInWeek> getShows(String week) {

		// Create an ArrayList that holds shows of specified week.
		ArrayList<ShowInWeek> categoryList = new ArrayList<ShowInWeek>();		

		// Cycle through the whole data; get the ShowInWeek objects that have the specified week.
		for (ShowInWeek showInWeek : showStorage) {
			if (showInWeek.getWeek().equals(week)){
				categoryList.add(showInWeek);
			}
		}

		return categoryList;			// Need to return a ShowCollection (this is an ArrayList).
	}

	public ArrayList<ShowInWeek> getShowStorage() {
		return showStorage;
	}

	public void setShowStorage(ArrayList<ShowInWeek> showStorage) {
		this.showStorage = showStorage;
	}

	public String toString() {

		String toReturn = "ShowCollection: [\n";

		for (ShowInWeek showInWeek : showStorage) {
			toReturn += showInWeek.toString()+"";
		}

		toReturn += "]";
		return toReturn;
	}








	// =========================== File Reading and Writing ===========================

	public void readFile() {

		BufferedReader lineReader = null;

		try {
			FileReader fileRead = new FileReader(fileName);				// Set the file to read from here.
			lineReader = new BufferedReader(fileRead);
			String line = null;

			while ((line = lineReader.readLine())!=null) {
				try {
					String week = lineReader.readLine();					// Read each line.
					String category = lineReader.readLine();
					String weeklyRank = lineReader.readLine();
					String showTitles = lineReader.readLine();
					String seasonTitle = lineReader.readLine();
					String weeklyHoursViewed = lineReader.readLine();			
					String cumulativeWeeks = lineReader.readLine();

					showStorage.add(new ShowInWeek(week, category, Integer.parseInt(weeklyRank), showTitles, seasonTitle, 
							Integer.parseInt(weeklyHoursViewed), Integer.parseInt(cumulativeWeeks)));
					
				} catch (Exception e) {
					System.err.println("Error: Unknown person type.");
				}
			}
		} catch (Exception e1) {
			System.err.println("there was a problem with the file reader, try different read type.");

			try {
				lineReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName.substring(1))));
				String line = null;

				while ((line = lineReader.readLine())!=null) {
					try {
						String week = lineReader.readLine();					// Read each line.
						String category = lineReader.readLine();
						String weeklyRank = lineReader.readLine();
						String showTitles = lineReader.readLine();
						String seasonTitle = lineReader.readLine();
						String weeklyHoursViewed = lineReader.readLine();			
						String cumulativeWeeks = lineReader.readLine();

						showStorage.add(new ShowInWeek(week, category, Integer.parseInt(weeklyRank), showTitles, seasonTitle, 
								Integer.parseInt(weeklyHoursViewed), Integer.parseInt(cumulativeWeeks)));

					} catch (Exception e2) {
						System.err.println("Error: Unknown person type.");
					}
				}
			} catch (Exception e2) {
				System.err.println("there was a problem with the file reader, try again.  either no such file or format error");

			} finally {
				if (lineReader != null)
					try {
						lineReader.close();
					} catch (IOException e2) {
						System.err.println("could not close BufferedReader");
					}
			}			
		} finally {
			if (lineReader != null)
				try {
					lineReader.close();
				} catch (IOException e) {
					System.err.println("could not close BufferedReader");
				}
		}
	}

	public void writeFile () {
		// overloaded method: this calls doWrite with file used to read data
		// use this for saving data between runs
		doWrite(fileName);
	}

	public void writeFile(String fileName) {
		// overloaded method: this calls doWrite with different file name 
		// use this for testing write
		doWrite(fileName);
	}

	private void doWrite(String fileName) {
		// this method writes all of the data in the ShowCollection array to a file
		try	{
			FileWriter write = new FileWriter(fileName);
			BufferedWriter outputFile = new BufferedWriter(write);			

			Iterator<ShowInWeek> showStorageIterator = showStorage.iterator();

			for (int i = 0; i < showStorage.size(); i++) {
				try {
					if (showStorageIterator.hasNext()) {

						ShowInWeek dataPoint = showStorage.get(i);				// Convert to iterator

						// Write each private data value to the file.
						outputFile.write(dataPoint.getWeek() + "\n");
						outputFile.write(dataPoint.getCategory()+"\n");
						outputFile.write(dataPoint.getWeeklyRank()+"\n");
						outputFile.write(dataPoint.getShowTitles()+"\n");
						outputFile.write(dataPoint.getSeasonTitle() + "\n");
						outputFile.write(dataPoint.getWeeklyHoursViewed() + "\n");
						outputFile.write(dataPoint.getCumulativeWeeksTop10() + "\n");

					}

				} catch (Exception e) {
					System.err.println("error in array, instance type not found");
				}
			}
			outputFile.flush();
			outputFile.close();

		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Didn't save to " + fileName);

		}
	}
}