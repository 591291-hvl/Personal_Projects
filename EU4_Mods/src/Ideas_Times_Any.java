//Creates new .txt file with all numbers scaled by x amount
//Works for any ideas
//Works for every policies except "religious_unity", since its both an ai modifier and nation modifier

//to use rename variable fileName to name of .txt you want to change
//change variable scale to any number for x times ideas

import java.io.*;
import java.util.*;

public class Ideas_Times_Any {

	public static String nameConverter(String filename, int scale) {
		String filename2 = filename.substring(0, filename.length() - 4);
		return filename2 + "Scaled" + "x" + scale + ".txt";
	}

	public static boolean isNumber(String str) {
		try {
			double nmbr = Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public static double strToDouble(String str) {
		return Double.parseDouble(str);
	}

	public static void main(String[] args) throws Exception {
		int scale = 2; //scales number by x amount

		// Reader
		String fileName = "txtNumb.txt"; //name of file you want to change
		File file = new File(fileName);
		Scanner reader = new Scanner(file);

		// Writer
		String fileName2 = nameConverter(fileName, scale);
		PrintWriter writer = new PrintWriter(fileName2);

		//Array of excluded words
		String[] excludes = { "vassal", "num_of_cities", "num_of_ports", "province_id", "is_year", "factor", "legitimacy", "tax_income_percentage", "army_size_percentage","average_effective_unrest","colonist_placement_chance","average_autonomy_above_min","production_income_percentage","trade_income_percentage" };
		boolean excludeFound = false;
		String line = "";
		String[] lineArray = null;
		while (reader.hasNextLine()) {
			line = reader.nextLine();
			lineArray = line.split(" ");
			for (int i = 0; i < lineArray.length; i++) {

				if (isNumber(lineArray[i])) {

					for (String v : excludes) {
						if (lineArray[i - 2].replace("\t", "").equals(v)) {
							excludeFound = true;
							break;
						}
					}

					if (!excludeFound) {
						writer.print(strToDouble(lineArray[i]) * scale);
					}
					if (excludeFound) {
						excludeFound = false;
						writer.print(lineArray[i]);
					}

				} else {

					writer.print(lineArray[i]);
				}

				writer.print(" ");
			}
			writer.println("");
		}
		writer.close();
		reader.close();

	}

}
