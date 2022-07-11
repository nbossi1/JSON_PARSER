import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

import Sale_announcement.*;

/**
 * @author nbossi1
 *
 * Creazione della collezione di JSON
 * 
 */

public class Main_Parser {

	public static int MAX_LEN = 18; //Numero campi dei record
	public static void main(String[] args) {
		
		/* Esempio di utilizzo
		Sale_information si = new Sale_information(1, "a", "b", 1, "c", "d");
		Vehicle_production vp = new Vehicle_production(2000, "a", "b", "c", "d", "e", "f");
		Vehicle_engine ve = new Vehicle_engine("a", "b", 2000, "d", "e");
		
		String json = "{" + si.toString() +
					  "\"vehicle_production_information\": {" + vp.toString() + "}," +
					  "\"vehicle_engine_information\": {" + ve.toString() + "}" + "}";
		
		System.out.print(json);
		*/
		
		
		/*
		 * Posizioni informazioni annuncio:
		 * 4, 16, 11, 10, 12, 9
		 * 
		 * Posizioni informazioni veicolo:
		 * 17, 5, 6, 0, 13, 8, 15
		 * 
		 * Posizioni informazioni motore:
		 * 1, 3, 7, 14, 2
		 * 
		 * Parso solo i record puliti -> "113'311"
		 */
		
		String json_result; //Conterrà il JSON generato
		try {
			FileReader file_input = new FileReader("Dataset/vehicles.csv");
			FileWriter file_output = new FileWriter("Dataset/vehicles_collection.json", true);
			BufferedReader br = new BufferedReader(file_input);
			BufferedWriter writer = new BufferedWriter(file_output);
			String line; //Contiene il record letto da file
			String fields[]; //Contiene i campi splittati
			int count_field = 0; //Contatore campi del record
			int count_record = 0; //Contatore record creati
			Sale_information sl_ve = null; //JSON annuncio
			Vehicle_production prodct_ve = null; //JSON info veicolo
			Vehicle_engine eng_ve = null; //JSON info motore
			
			br.readLine(); //Prima riga la leggo, ma è l'intestazione
			while((line = br.readLine()) != null) { //Leggo fino a fine file

				fields = line.split(","); //Splitto il record	
				
				//Verifico che tutti i campi sono valorizzati
				for(int pos_field = 0; pos_field < fields.length; pos_field++) 
					if(!fields[pos_field].isEmpty())
						count_field++;
				
				//Record valido
				if(count_field == MAX_LEN) {
					
					try {
						
						//Creo l'annunncio 
						sl_ve = new Sale_information(fields[4], fields[16], fields[11], Double.parseDouble(fields[10]), fields[12], fields[9]);
						
						//Creo informazioni sul produttore
						prodct_ve = new Vehicle_production(Integer.parseInt(fields[17]), fields[5], fields[6], fields[0], fields[13], fields[8], fields[15]);
						
						//Creo informazioni sul motore 
						eng_ve = new Vehicle_engine(fields[1], fields[3], Double.parseDouble(fields[7]), fields[14], fields[2]);
					
						//Creo il JSON 
						json_result = "{" + sl_ve.toString() +
								  	  "\"vehicle_production_information\": {" + prodct_ve.toString() + "}," +
								      "\"vehicle_engine_information\": {" + eng_ve.toString() + "}" + "}";
						
						//Scrivo su file
						writer.append(json_result+"\n");
						
						count_record++;
						
					} catch(Exception ex) {
						//System.err.println("Error occuring during json parse");
					}
					
				}
					
				count_field = 0;
			}
			
			System.out.println("Il numero totale di record scritti su file è: " + count_record);
			writer.close();
			br.close();
			
		} catch(Exception ex) {
				
			System.err.println("Error occuring during read file");
			ex.printStackTrace();
			
		}
		
	}
}