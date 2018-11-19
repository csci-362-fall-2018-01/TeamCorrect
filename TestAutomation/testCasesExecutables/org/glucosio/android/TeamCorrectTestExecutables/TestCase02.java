package org.glucosio.android.TeamCorrectTestExecutables;

public class TestCase02 {
	
	//private static GlucosioConverter gluConverterTester = new GlucosioConverter();
	public static void CalculatesGlucoseToA1C() {
		double value1 = 10.0;
		double value2 = 25.0;
		double value3 = 50.0;
		double value4 = 0.0;
		double glucA1Cvalue1 = GlucosioConverter.glucoseToA1C(value1);
		double glucA1Cvalue2 = GlucosioConverter.glucoseToA1C(value2);
		double glucA1Cvalue3 = GlucosioConverter.glucoseToA1C(value3);
		double glucA1Cvalue4 = GlucosioConverter.glucoseToA1C(value4);
		System.out.println("---- " + value1 +" glucose level converted to " + glucA1Cvalue1);
		System.out.println(" ---- " + value2 +" glucose level converted to " + glucA1Cvalue2);
		System.out.println(" ---- " + value3 +" glucose level converted to " + glucA1Cvalue3);
		System.out.println(" ---- " + value4 +" glucose level converted to " + glucA1Cvalue4 + " ----");
	}
	
	public static void main(String[] args) {
		CalculatesGlucoseToA1C();
	}

}
