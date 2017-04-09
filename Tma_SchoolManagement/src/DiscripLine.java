
public class DiscripLine {
	
	private String IdDiscripLine;
	private String Name;
	private int NumberLecture;
	private int NumberExercise;
	
	public DiscripLine(String IdDiscripLine, String Name, int NumberLecture, int NumberExercise){
		this.Name = Name;
		this.NumberLecture = NumberLecture;
		this.NumberExercise = NumberExercise;
		this.IdDiscripLine = IdDiscripLine;
	}
	
	public String getIdDiscripLine() {
		return IdDiscripLine;
	}

	public void setIdDiscripLine(String idDiscripLine) {
		IdDiscripLine = idDiscripLine;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumberLecture() {
		return NumberLecture;
	}
	public void setNumberLecture(int numberLecture) {
		NumberLecture = numberLecture;
	}
	public int getNumberExercise() {
		return NumberExercise;
	}
	public void setNumberExercise(int numberExercise) {
		NumberExercise = numberExercise;
	}
	
	

}
