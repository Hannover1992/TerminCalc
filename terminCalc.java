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
		//Datenstrukturen und Algorithmen
		//Vorlesung
		List<Termin> DatAlg2Vorlesung  = new ArrayList<Termin>();
		DatAlg2Vorlesung.add(new Termin("DatAlgVor:Thursday: 14:15 - 15:45, weekly (from 25/10/18), Hauptveranst., Location: (Raum F102, Gebaeude 1101: Hauptgebäude, Welfengarten 1)","Thursday",14,15,"Thursday",15,45));
		DatAlg2Vorlesung.add(new Termin("DatAlgVor:Thursday: 18:15 - 19:45, weekly (from 25/10/18), Hauptveranst., Location: (Raum F102, Gebaeude 1101: Hauptgebäude, Welfengarten 1)","Thursday",18,15,"Thursday",19,45));

		//Horsaalubung
		List<Termin> DatAlgHor10 = new ArrayList<Termin>();
		DatAlgHor10.add(new Termin("DatAlgHor:Monday: 11:00 - 12:30, weekly (12x)",Monday,11,00,Monday,12,30));
		DatAlgHor10.add(new Termin("DatAlgHor:Monday: 15:00 - 16:30, weekly (12x)",Monday,15,00,Monday,16,30));
		DatAlgHor10.add(new Termin("DatAlgHor:Tuesday: 08:30 - 10:00, weekly (12x)",Tuesday,08,30,Tuesday,10,00));
		DatAlgHor10.add(new Termin("DatAlgHor:Tuesday: 12:30 - 14:00, weekly (12x)",Tuesday,12,30,Tuesday,14,00));
		DatAlgHor10.add(new Termin("DatAlgHor:Tuesday: 14:15 - 15:45, weekly (12x)",Tuesday,14,15,Tuesday,15,45));
		DatAlgHor10.add(new Termin("DatAlgHor:Wednesday: 14:00 - 15:30, weekly(11x)",Wednesday,14,00,Wednesday,15,30));
		DatAlgHor10.add(new Termin("DatAlgHor:Wednesday: 15:30 - 17:00, weekly (11x)",Wednesday,15,30,Wednesday,17,00));
		DatAlgHor10.add(new Termin("DatAlgHor:Friday: 08:15 - 09:45, weekly (13x)",Friday,08,15,Friday,09,45));
		DatAlgHor10.add(new Termin("DatAlgHor:Friday: 10:00 - 11:30, weekly (13x)",Friday,10,00,Friday,11,30));
		DatAlgHor10.add(new Termin("DatAlgHor:Friday: 12:30 - 14:00, weekly (13x)",Friday,12,30,Friday,14,00));

		//Grundlagen Betriebsszstheme
		//hier muss man berucksichtigen das wenn man sie fur a endscheided soll man auch aus gruppe a horsaalubung und gruppenubung wahlen
		List<Termin> GruBetVor1 = new ArrayList<Termin>();
		GruBetVor1.add(new  Termin("Tuesday: 16:15 - 17:45, weekly (from 16/10/18), Hauptveranst., Location: (Raum E214: Großer Physiksaal, Gebaeude 1101: Hauptgebäude, Welfengarten 1)",Tuesday,16,15,Tuesday,17,45));

		//Gruppenubung Betriebssystheme A
		List<Termin> GruBetGruA10 = new ArrayList<Termin>();
		GruBetGruA10.add(new Termin("GruBetGruA10:Monday: 08:30 - 10:00",Monday,08,30,Monday,10,00));
		GruBetGruA10.add(new Termin("GruBetGruA10:Monday: 15:00 - 16:30",Monday,15,00,Monday,16,30));
		GruBetGruA10.add(new Termin("GruBetGruA10:Tuesday: 10:00 - 11:30",Tuesday,10,00,Tuesday,11,30));
		GruBetGruA10.add(new Termin("GruBetGruA10:Tuesday: 12:30 - 14:00"Tuesday,12,30,Tuesday,14,00));
		GruBetGruA10.add(new Termin("GruBetGruA10:Tuesday: 14:15 - 15:45",Tuesday,14,15,Tuesday,15,45));
		GruBetGruA10.add(new Termin("GruBetGruA10:Wednesday: 12:30 - 14:00",Wednesday,12,13,Wednesday,14,00);
		GruBetGruA10.add(new Termin("GruBetGruA10:Wednesday: 16:00 - 17:30",Wednesday,16,00,Wednesday,17,30);
		GruBetGruA10.add(new Termin("GruBetGruA10:Thursday: 12:30 - 14:00",Thursday,12,30,Thursday,14,00);
		GruBetGruA10.add(new Termin("GruBetGruA10:Thursday: 14:15 - 15:45",Thursday,14,15,Thursday,15,45);
		GruBetGruA10.add(new Termin("GruBetGruA10:Thursday: 16:00 - 17:30",Thursday,16,00,Thursday,17,30);




///				System.out.println(something.get(0).name
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
