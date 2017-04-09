
public class Teacher extends People{
	
	private String IdTeacher;
	private String IdDiscripLine;
	
	public String getIdTeacher() {
		return IdTeacher;
	}


	public void setIdTeacher(String idTeacher) {
		IdTeacher = idTeacher;
	}


	public Teacher(String Name, String IdDiscripLine){
		this.Name = Name;
		this.IdDiscripLine = IdDiscripLine;
	}
	

	public String getDiscripLine() {
		return IdDiscripLine;
	}

	public void setDiscripLine(String discripLine) {
		IdDiscripLine = discripLine;
	}
	
	

}
