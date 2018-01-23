package by.tc.shved.task01.main;

import by.tc.shved.task01.entity.Appliance;
import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {
		for(Appliance appliance : appliances){
			System.out.println(appliance);
		}
		System.out.println("\n\n");
	}

	public static void printMessage(String message){
		System.out.println(message);
	}

}
