package enumDataType;

public class EnumTest {
	
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are Bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are Better.");
			break;
		case SATURDAY: case SUNDAY:
			System.out.println("Weekends are the Best.");
			break;
		default:
			System.out.println("Mid-week days are so-so.");
			break;
		}
	}
	
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest secondDay = new EnumTest(Day.TUESDAY);
		secondDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.THURSDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.FRIDAY);
		sixthDay.tellItLikeItIs();
		EnumTest lastDay = new EnumTest(Day.SATURDAY);
		lastDay.tellItLikeItIs();
	}

}
