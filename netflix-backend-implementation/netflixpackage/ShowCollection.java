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
	
	private ArrayList<ShowInWeek> showStorage;
	
	public ShowCollection() {
		showStorage = new ArrayList<ShowInWeek>();
	}
	
	public void addNewShow(ShowInWeek newShowInWeek) {
		showStorage.add(newShowInWeek);
	}
	
	public void purgeShow(String showToPurge) {
		// Append " [PURGED]" to end of each show title.
		
		for (ShowInWeek showInWeek : showStorage) {
			if (showInWeek.getShowTitles() == showToPurge) {
				showInWeek.setShowTitles(showInWeek.getShowTitles() + " [PURGED]");		
			}
		}
	}
	
	public void unpurgeShow(String showToUnpurge) {
		// Do the opposite of purgeShow();
		
		for (ShowInWeek showInWeek : showStorage) {
			if (showInWeek.getShowTitles() == (showToUnpurge + " [PURGED]")) {
				showInWeek.setShowTitles(showInWeek.getShowTitles().replace(" [PURGED]", ""));		
			}
		}
	}
	
	public void editShow() {
		
		
		
		// Return an ArrayList
	}
	
	public void suggestRandomShow(ShowCollection collection) {
		
//		Random rand = new Random();
		
		// Get the size of this current instance.
//		Iterator iterator = collection.iterator();
		
	}
	
	// Suggest based on a single given show.
	public void suggestPredictive(ShowInWeek show) {
		
		// Suggest a show from the pool of shows in this instance.
		
	}

	// Suggest based on a set of shows.
	public void suggestPredictive(ShowCollection shows) {
		
		// Suggest a show from the pool of shows in this instance.
		
	}
	
	public ShowInWeek getShows(ShowCollection shows) {
		
		ShowInWeek test = new ShowInWeek();
		
		return test;				// Return needs to be a ShowCollection as well (a subset collection).
		
	}
	
	public String toString() {
		
		String toReturn = "ShowCollection: [\n";
		
		for (ShowInWeek showInWeek : showStorage) {
			toReturn += showInWeek.toString()+"\n";
		}
		
		toReturn += "]";
		return toReturn;
	}

}


//public class ShowCollection {
//	private int size;
//	private static final int DEFAULT_SIZE = 10;
//	private Person[] people;
//	//private Student[] students;
//	//private Instructor[] instructors;
//	private String className;
//	private String fileName;
//	
//	public ShowCollection() {
//		// default constructor
//		size = 0;
//		people = new Person[DEFAULT_SIZE];
//		className = "a class";
//		fileName = null;
//	}
//	public ShowCollection(String cn, String fn) {
//		// constructor with given course name and input file
//		this();
//		className = cn;
//		fileName = fn;
//		readFile();
//	}	
//	public void addStudent(ShowInWeek s) {
//		// method that adds the input Student to the people array
//		if (size >= people.length)
//			doubleArray();
//		people[size] = s;
//		size++;
//	}
//	public void addInstructor(Instructor i) {
//		// method that adds the input Instructor to the people array
//		if (size >= people.length)
//			doubleArray();
//		people[size] = i;
//		size++;
//	}	
//	public void addPersonFromKeyboard () {
//		// method that prompts the user to enter either a student or instructor
//		// then the user inputs the appropriate information for that person type
//		// finally adds the new person to the array
//		
//		// complete for homework #2  
//		
//	}
//	public void removePerson (String id) {
//		// method that removes the Person from the array with the input id
//		
//		// complete for homework #2  
//		
//	}
//	private void doubleArray () {
//		// private method used to double the size of the array when needed
//		Person[] newPeople = new Person[people.length*2];
//		for (int i = 0; i < size; i++) {
//			newPeople[i] = people[i];
//		}		
//		people = newPeople;
//	}
//	public String toString() {
//		// returns a string representation of this roster
//		String toReturn = className+"\n";
//		for (int i = 0; i < size; i++) {
//			if (people[i] instanceof ShowInWeek)
//				toReturn += "Student:  "+people[i]+"\n";
//			else
//				toReturn += "Instructor:  "+people[i]+"\n";
//		}
//		return toReturn;
//	}
//
//	
//	private void readFile () {
//		BufferedReader lineReader = null;
//		try {
//			FileReader fr = new FileReader(fileName);
//			lineReader = new BufferedReader(fr);
//			String line = null;
//			while ((line = lineReader.readLine())!=null) {
//				String name = lineReader.readLine();
//				String id = lineReader.readLine();
//				if (line.equals("student")) {
//					String gpaString = lineReader.readLine();
//					addStudent(new ShowInWeek(name,id,Double.parseDouble(gpaString)));
//				}
//				else if (line.equals("instructor")) {
//					String email = lineReader.readLine();
//					addInstructor(new Instructor(name,id,email));
//				}
//				else {
//					System.err.println("error: unnknown person type");
//				}			}
//		} catch (Exception e) {
//			System.err.println("there was a problem with the file reader, try different read type.");
//			try {
//				lineReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName.substring(1))));
//				String line = null;
//				while ((line = lineReader.readLine())!=null) {
//					String name = lineReader.readLine();
//					String id = lineReader.readLine();
//					if (line.equals("student")) {
//						String gpaString = lineReader.readLine();
//						addStudent(new ShowInWeek(name,id,Double.parseDouble(gpaString)));
//					}
//					else if (line.equals("instructor")) {
//						String email = lineReader.readLine();
//						addInstructor(new Instructor(name,id,email));
//					}
//					else {
//						System.err.println("error: unnknown person type");
//					}				}
//			} catch (Exception e2) {
//				System.err.println("there was a problem with the file reader, try again.  either no such file or format error");
//			} finally {
//				if (lineReader != null)
//					try {
//						lineReader.close();
//					} catch (IOException e2) {
//						System.err.println("could not close BufferedReader");
//					}
//			}			
//		} finally {
//			if (lineReader != null)
//				try {
//					lineReader.close();
//				} catch (IOException e) {
//					System.err.println("could not close BufferedReader");
//				}
//		}
//	} // end of readFile method	
//	
//	public void writeFile () {
//		// overloaded method: this calls doWrite with file used to read data
//		// use this for saving data between runs
//		doWrite(fileName);
//	} // end of writeFile method
//
//	public void writeFile(String altFileName) {
//		// overloaded method: this calls doWrite with different file name 
//		// use this for testing write
//		doWrite(altFileName);		
//	}// end of writeFile method
//	
//	private void doWrite(String fn) {
//		// this method writes all of the data in the persons array to a file
//		try
//		{
//
//			FileWriter fw = new FileWriter(fn);
//			BufferedWriter myOutfile = new BufferedWriter(fw);			
//			
//			for (int i = 0; i < size; i++) {
//				Person person = people[i];
//				if (person instanceof ShowInWeek) {
//					myOutfile.write ("student\n");
//					myOutfile.write (person.getName()+"\n");
//					myOutfile.write (person.getId()+"\n");
//					myOutfile.write (((ShowInWeek) person).getGpa()+"\n");
//				}
//				else if (person instanceof Instructor) {
//					myOutfile.write ("instructor\n");
//					myOutfile.write (person.getName()+"\n");
//					myOutfile.write (person.getId()+"\n");
//					myOutfile.write (((Instructor) person).getEmail()+"\n");
//				}	
//				else {
//					System.err.println("error in array, instance type not found");
//				}
//			}
//			myOutfile.flush();
//			myOutfile.close();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.err.println("Didn't save to " + fn);
//		}
//	}	

