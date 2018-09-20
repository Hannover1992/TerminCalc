import java.util.*;

public class TerminCalc{
	int czas[][][];

	public TerminCalc(int dni, int godziny, int minuty){
		int[][][] temp = new int[dni][godziny][minuty];
		for(int i = 0; i < dni; i++){
			for(int i2 = 0; i2 <godziny ; i2++){
				for(int i3 = 0; i3 < minuty; i3++){
					temp[i][i2][i3] = 0;
				}
			}
		}
		this.czas = temp;
	}

	public void printCzas(){
		int dni = 7;
		int godziny = 24;
		int minuty = 60;
		for(int i = 0; i < dni; i++){
			switch(i){
				case 0:  System.out.println("Montag:");break;
				case 1:  System.out.println("Dienstag:");break;
				case 2:  System.out.println("Mittwoch:");break;
				case 3:  System.out.println("Donnerstg:");break;
				case 4:  System.out.println("Freitag:");break;
				case 5:  System.out.println("Samstag:");break;
				case 6:  System.out.println("Sontag:");break;
			}
//			for(int i2 = 8; i2 <godziny - 3 ; i2++){
			for(int i2 = 0; i2 <godziny; i2++){
				System.out.print(i2 + ":");
				for(int i3 = 0; i3 < minuty; i3++){
					System.out.print(this.czas[i][i2][i3]);
				}
				System.out.println("");
			}
		}
	}

	public void setCzas(
	int startDni,
	int startGodziny,
	int startMinuty,
	int koniecDni,
	int koniecGodziny,
	int koniecMinuty){
	while((startDni != koniecDni) || 
	      (startGodziny != koniecGodziny) || 
	      (startMinuty != koniecMinuty)){

			this.czas[startDni][startGodziny][startMinuty]++;
			startMinuty++;
			if(startMinuty == 60){
				startMinuty = 0;
				startGodziny++;
				if(startGodziny == 24){
					startGodziny = 0;
					startDni++;
					if(startDni == 7){

				System.out.println("Error:Dni sie skonczyly");
				System.exit(0);
					}
				}
			}
		}
	}

	public int addCzas(){
		int summe = 0;
		for(int i = 0; i < 7;i++){
			for(int i2 = 0; i2 < 24;i2++){
				for(int i3 = 0; i3 < 60;i3++){
					summe += this.czas[i][i2][i3];
}
			}
		}
		return summe;
	}
	public boolean findOverlap(){
		boolean gefunden = false;
		for(int i = 0; i < 7;i++){
			for(int i2 = 0; i2 < 24;i2++){
				for(int i3 = 0; i3 < 60;i3++){
	if(this.czas[i][i2][i3] >= 2){
		gefunden = true;
	}
}

			}
		}
		return gefunden;
	}

	public void init(){
		List<Termin> DatAlg2Vorlesung  = new ArrayList<Termin>();
		DatAlg2Vorlesung.add(new Termin("Thursday: 14:15 - 15:45, weekly (from 25/10/18), Hauptveranst., Location: (Raum F102, Gebaeude 1101: Hauptgebäude, Welfengarten 1)",3,14,15,3,15,45));
		DatAlg2Vorlesung.add(new Termin("Thursday: 18:15 - 19:45, weekly (from 25/10/18), Hauptveranst., Location: (Raum F102, Gebaeude 1101: Hauptgebäude, Welfengarten 1)",3,18,15,3,19,45));

		List<Termin> DatAlgHor10 = new ArrayList<Termin>();
//		DatAlgHor10.add(new Termin("Monday: 11:00 - 12:30, weekly (12x)"));
//		DatAlgHor10.add(new Termin("Monday: 15:00 - 16:30, weekly (12x)"));
//		DatAlgHor10.add(new Termin("Tuesday: 08:30 - 10:00, weekly (12x)"));
//		DatAlgHor10.add(new Termin("Tuesday: 12:30 - 14:00, weekly (12x)"));
//		DatAlgHor10.add(new Termin("Tuesday: 14:15 - 15:45, weekly (12x)"));
//		DatAlgHor10.add(new Termin("Wednesday: 14:00 - 15:30, weekly(11x)"));
//		DatAlgHor10.add(new Termin("Wednesday: 15:30 - 17:00, weekly (11x)"));
//		DatAlgHor10.add(new Termin("Friday: 08:15 - 09:45, weekly (13x)"));
//		DatAlgHor10.add(new Termin("Friday: 10:00 - 11:30, weekly (13x)"));
//		DatAlgHor10.add(new Termin("Friday: 12:30 - 14:00, weekly (13x)"));

///				System.out.println(something.get(0).name);

	}
	public static void main(String[] args){
		TerminCalc simulation = new TerminCalc(7,24,60);
		simulation.init();
		//simulation.printCzas();
//		simulation.setCzas(6,22,0,6,23,59);
//		simulation.printCzas();
//		Termin test = new Termin("s",1,1,1,1,1,1);
	}
}
