import java.util.Scanner;


public class BMICalculator 
{
	//Members for the getters and setters
	private float height;
	private float weight;
	private float bmi;
	private String bmiCategory;
	private String unitType;
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	public void readUserData()
	{
		//Capture the user's data type
		String unitType = readUnitType();
		readMeasurementData(unitType);
		this.unitType = unitType;
	}
	
	private String readUnitType()
	{
		String unitType;
		System.out.println("Enter unit type (Imperial or Metric):");
		//Loop as until the user enters one of the two options for data unit type
		while (true)
		{
			unitType = scanner.nextLine();
			if (unitType.compareTo("Imperial") == 0 || unitType.compareTo("Metric") == 0)
			{
				break;
			}
			System.out.println("Enter a valid unit type: ");
		}
		//Return the user's indicated unit type to the readUserData method
		return unitType;
	}
	
	private void readMeasurementData(String unitType)
	{
		//If user enters metric as unit
		//then call readMetricData()
		// else if user enters imperial as unit
		//then call readImperialData()
		if (unitType.compareTo("Metric") == 0)
		{
			readMetricData();
		}
		else
		{
			readImperialData();
		}
		
	}
	
	private void readMetricData()
	{
		System.out.print("Enter weight in kilograms: ");
		float weight = scanner.nextFloat();
		//Ensure that the weight is valid
		if (weight < 0)
			System.exit(0);
		System.out.print("Enter height in centimeters: ");
		float height = scanner.nextFloat();
		//Ensure that the height is valid
		if (height < 0)
			System.exit(0);
		
		setWeight(weight);
		setHeight(height);
		scanner.close();
	}
	
	private void readImperialData()
	{
		System.out.print("Enter weight in pounds: ");
		Float weight = scanner.nextFloat();
		//Ensure that the weight is valid
		if (weight < 0)
			System.exit(0);
		System.out.print("Enter height in inches: ");
		float heightInches = scanner.nextFloat();
		//Ensure that the height is valid
		if (heightInches < 0)
			System.exit(0);
		
		setWeight(weight);
		setHeight(heightInches);
		scanner.close();
	}
	
	public void calculateBmi()
	{
		float weight = getWeight();
		float height = getHeight();
		//Calculate imperial/metric BMI based on user input
		if (this.unitType.compareTo("Imperial") == 0)
		{
			this.bmi = 703 * ((weight) / (height * height));
		}
		else 
		{
			this.bmi = (weight) / ((height / 100) * (height / 100));
		}
		
		//Calculate the user's BMI category
		if (this.bmi < 18.5)
			this.bmiCategory = "Underweight";
		else if (this.bmi >= 18.5 && this.bmi <= 24.9)
			this.bmiCategory = "Normal weight";
		else if (this.bmi >= 25 && this.bmi <= 29.9)
			this.bmiCategory = "Overweight";
		else
			this.bmiCategory = "Obesity";
	}
	
	public void displayBmi()
	{
		//Print the user's BMI 
		float bmi = getBmi();
		String bmiCategory = getBmiCategory();
		System.out.println("BMI: " + bmi + " BMI Category: " + bmiCategory);
	}
	
	public float getWeight() 
	{
		return this.weight;
	}
	
	private void setWeight(float weight)
	{
		this.weight = weight;
	}
	
	public float getHeight()
	{
		return this.height;
	}
	
	private void setHeight(float height)
	{
		this.height = height;
	}
	
	public float getBmi()
	{
		return this.bmi;
	}
	
	public String getBmiCategory()
	{
		return this.bmiCategory;
	}
	
	public void calculateBmiCategory()
	{
		//Determine the user's BMI category
		if (this.bmi < 18.5)
			this.bmiCategory = "Underweight";
		else if (this.bmi >= 18.5 && this.bmi <= 24.9)
			this.bmiCategory = "Normal weight";
		else if (this.bmi >= 25 && this.bmi <= 29.9)
			this.bmiCategory = "Overweight";
		else
			this.bmiCategory = "Obesity";
	}
	
}