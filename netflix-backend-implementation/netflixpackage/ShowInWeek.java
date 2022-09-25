package netflixpackage;

public class ShowInWeek {

	// Private data members
	private String 		week;
	private String 		category;
	private int 		weeklyRank;
	private String 		showTitles;
	private String 		seasonTitle;
	private int 		weeklyHoursViewed;
	private int 		cumulativeWeeksTop10;
	
	// Default constructor
	public ShowInWeek() {
		
		week = "Week Not Set";
		category = "Undefined Category";
		weeklyRank = 0;
		showTitles = "Show Titles Not Set";
		seasonTitle = "Season Titles Not Set";
		weeklyHoursViewed = 0;
		cumulativeWeeksTop10 = 0;
	}
	
	// Overloaded constructor
	public ShowInWeek(String week, String category, int weeklyRank, String showTitles, String seasonTitle,
			int weeklyHoursViewed, int cumulativeWeeksTop10) {
		
		this.week = week;
		this.category = category;
		this.weeklyRank = weeklyRank;
		this.showTitles = showTitles;
		this.seasonTitle = seasonTitle;
		this.weeklyHoursViewed = weeklyHoursViewed;
		this.cumulativeWeeksTop10 = cumulativeWeeksTop10;
	}
	
	
	// Getters and setters for private data members.
	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getWeeklyRank() {
		return weeklyRank;
	}

	public void setWeeklyRank(int weeklyRank) {
		this.weeklyRank = weeklyRank;
	}

	public String getShowTitles() {
		return showTitles;
	}

	public void setShowTitles(String showTitles) {
		this.showTitles = showTitles;
	}

	public String getSeasonTitle() {
		return seasonTitle;
	}

	public void setSeasonTitle(String seasonTitle) {
		this.seasonTitle = seasonTitle;
	}

	public int getWeeklyHoursViewed() {
		return weeklyHoursViewed;
	}

	public void setWeeklyHoursViewed(int weeklyHoursViewed) {
		this.weeklyHoursViewed = weeklyHoursViewed;
	}

	public int getCumulativeWeeksTop10() {
		return cumulativeWeeksTop10;
	}

	public void setCumulativeWeeksTop10(int cumulativeWeeksTop10) {
		this.cumulativeWeeksTop10 = cumulativeWeeksTop10;
	}
	
	// toString method for outputting class instances intuitively.
	public String toString() {
		return "ShowInWeek [week=" + week + ", category=" + category + ", weeklyRank=" + weeklyRank + ", showTitles="
				+ showTitles + ", seasonTitle=" + seasonTitle + ", weeklyHoursViewed=" + weeklyHoursViewed
				+ ", cumulativeWeeksTop10=" + cumulativeWeeksTop10 + "]";
	}
	
	// Week variable, show variable, concatenate
	public boolean equals(String week, String showTitles) {
		
		return (this.week + this.showTitles) == week + showTitles;			// This concatenation may not be correct...
		
	}
	
}
