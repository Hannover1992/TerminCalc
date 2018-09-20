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
	int dniStart,
	int godzinyStart,
	int minutyStart,
	int dniEnd,
	int godzinyEnd,
	int minutyEnd){
		this.name = name;
		this.dniStart = dniStart;
		this.godzinyStart = godzinyStart;
		this.minutyStart = minutyStart;
		this.dniEnd = dniEnd;
		this.godzinyEnd = godzinyEnd;
		this.minutyEnd = minutyEnd;
	}

}
