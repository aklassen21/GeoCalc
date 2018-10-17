import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {
		//declare, initialize strings
		String triangleBaseStr, triangleHeightStr, name, unit;
		Scanner kb = new Scanner(System.in);
		Double triangleBaseDbl, triangleHeightDbl, triangleArea;
		//declare final strings for the  text
		final String introduction1A = "Hello, ";
		final String introduction1B = ", welcome To Geometry Calculator!";
		final String promptName = "Please enter your name: ";
		final String enter = "\nPress enter to continue";
		final String promptTBase = "Please enter the base of the triangle: ";
		final String promptTHeight = "Please enter the height of the triangle: ";
		final String promptUnit = "Please enter the unit of measurement: ";
		final String areaCalculation = "The area of the  triangle is: ";
		//begin with prompting the user for their name
		System.out.println(promptName);
		name = kb.nextLine();
		System.out.print(introduction1A + name + introduction1B + enter);
		kb.nextLine();
		System.out.print(promptTBase);
		triangleBaseStr = kb.nextLine();
		System.out.print(promptTHeight);
		triangleHeightStr = kb.nextLine();
		System.out.print(promptUnit);
		unit = kb.nextLine();
		triangleBaseDbl = Double.parseDouble(triangleBaseStr);
		triangleHeightDbl = Double.parseDouble(triangleHeightStr);
		triangleArea = 0.5 * triangleHeightDbl * triangleBaseDbl;
		System.out.print(areaCalculation + triangleArea + unit);
		
		
		System.out.print("\n\n\n");
		
		
		final String promptPHeight = "Please enter the height: ";
		final String promptPLength = "Please enter the length: ";
		final String promptPWidth = "Please enter the width: ";
		final String promptPUnit = "Please enter the unit: ";
		final String introduction2 = "Area of a rectangular prism\n";
		final String volCalc =  "The volume is: ";
		String pHeight, pLength, pWidth, pVol, pUnit;
		Double pLengthD, pWidthD, pHeightD;
		System.out.print(introduction2);
		System.out.print(promptPHeight);
		pHeight = kb.nextLine();
		System.out.print(promptPLength);
		pLength = kb.nextLine();
		System.out.print(promptPWidth);
		pWidth = kb.nextLine();
		System.out.print(promptPUnit);
		pUnit = kb.nextLine();
		pLengthD = Double.parseDouble(pLength);
		pWidthD = Double.parseDouble(pWidth);
		pHeightD = Double.parseDouble(pHeight);
		
		
		
		
		
		
	}

}
