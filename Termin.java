import java.lang.String;
public class Termin{
	String name;
	int dniStart;  
	int godzinyStart;
	int minutyStart;
	int dniEnd;
	int godzinyEnd;
	int minutyEnd;

	public Termin(
	String name,
	String dniStart,
	int godzinyStart,
	int minutyStart,
	String dniEnd,
	int godzinyEnd,
	int minutyEnd){
		this.name = name;
			if (dniStart.compareTo("Monday") == 0){ 
				this.dniStart = 0;
				}
			if (dniStart.compareTo("Tuesday") == 0){ 
				this.dniStart = 1;
				}
			if (dniStart.compareTo("Wednesday") == 0){ 
				this.dniStart = 2;
				}
			if (dniStart.compareTo("Thursday") == 0){ 
				this.dniStart = 3;
				}
			if (dniStart.compareTo("Friday") == 0){ 
				this.dniStart = 4;
				}
		this.godzinyStart = godzinyStart;
		this.minutyStart = minutyStart;
			if (dniEnd.compareTo("Monday") == 0){ 
				this.dniEnd = 0;
				}
			if (dniEnd.compareTo("Tuesday") == 0){ 
				this.dniEnd = 1;
				}
			if (dniEnd.compareTo("Wednesday") == 0){ 
				this.dniEnd = 2;
				}
			if (dniEnd.compareTo("Thursday") == 0){ 
				this.dniEnd = 3;
				}
			if (dniEnd.compareTo("Friday") == 0){ 
				this.dniEnd = 4;
				}
		this.godzinyEnd = godzinyEnd;
		this.minutyEnd = minutyEnd;
	}

}
