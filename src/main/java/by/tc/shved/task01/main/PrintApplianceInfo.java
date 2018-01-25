package by.tc.shved.task01.main;

import by.tc.shved.task01.entity.*;

import java.util.List;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliances) {

		System.out.println("------------------------------------------");

		for (Appliance appliance : appliances) {

			switch(appliance.getClass().getSimpleName()){
				case "Oven":
					System.out.println(getInfoAboutOven((Oven)appliance));
					break;
				case "Laptop":
					System.out.println(getInfoAboutLaptop((Laptop)appliance));
					break;
				case "Refrigerator":
					System.out.println(getInfoAboutRefrigerator((Refrigerator)appliance));
					break;
				case "TabletPC":
					System.out.println(getInfoAboutTabletPC((TabletPC)appliance));
					break;
				case "Speakers":
					System.out.println(getInfoAboutSpeakers((Speakers)appliance));
					break;
				case "VacuumCleaner":
					System.out.println(getInfoAboutVacuumCleaner((VacuumCleaner)appliance));
					break;

			}

			System.out.println("\n");

		}

		System.out.println("------------------------------------------");


	}

	private static String getInfoAboutOven(Oven oven){

		StringBuilder info = new StringBuilder();

		info.append("Oven").append("\nHeight -- ").append(oven.getHeight()).
				append("\nDepth -- ").append(oven.getDepth()).
				append("\nCapacity -- ").append(oven.getCapacity()).
				append("\nPower Consumption -- ").append(oven.getPowerConsumption()).
				append("\nWeight -- ").append(oven.getWeight()).
				append("\nWidth -- ").append(oven.getWidth());

		return info.toString();
	}

	private static String getInfoAboutLaptop(Laptop laptop){

		StringBuilder info = new StringBuilder();

		info.append("Laptop").append("\nCPU -- ").append(laptop.getCpu()).
				append("\nBattery capacity -- ").append(laptop.getBatteryCapacity()).
				append("\nDisplay inch -- ").append(laptop.getDisplayInch()).
				append("\nMemory room -- ").append(laptop.getMemoryRoom()).
				append("\nOS -- ").append(laptop.getOs());

		return info.toString();
	}

	private static String getInfoAboutRefrigerator(Refrigerator refrigerator){

		StringBuilder info = new StringBuilder();

		info.append("Refrigerator").append("\nHeight -- ").append(refrigerator.getHeight()).
				append("\nPower Consumption -- ").append(refrigerator.getPowerConsumption()).
				append("\nWeight -- ").append(refrigerator.getWeight()).
				append("\nFreeze capacity -- ").append(refrigerator.getFreezeCapacity()).
				append("\nOverall capacity -- ").append(refrigerator.getOveralCapacity()).
				append("\nWidth -- ").append(refrigerator.getWidth());

		return info.toString();
	}

	private static String getInfoAboutSpeakers(Speakers speakers){

		StringBuilder info = new StringBuilder();

		info.append("Speakers").append("\nCord length -- ").append(speakers.getCordLength()).
				append("\nFrequency range -- ").append(speakers.getFrequencyRange()).
				append("\nNumber of speakers -- ").append(speakers.getNumberOfSpeakers()).
				append("\nPower consumption -- ").append(speakers.getPowerConsumption());

		return info.toString();
	}

	private static String getInfoAboutTabletPC(TabletPC tabletPC){

		StringBuilder info = new StringBuilder();

		info.append("Tablet PC").append("\nBattery capacity -- ").append(tabletPC.getBatteryCapacity()).
				append("\nColor -- ").append(tabletPC.getColor()).
				append("\nDisplay inches -- ").append(tabletPC.getDisplayInches()).
				append("\nFlash memory capacity -- ").append(tabletPC.getFlashMemoryCapacity()).
				append("\nMemory room -- ").append(tabletPC.getMemoryRoom());

		return info.toString();
	}

	private static String getInfoAboutVacuumCleaner(VacuumCleaner vacuumCleaner){

		StringBuilder info = new StringBuilder();

		info.append("Vacuum Cleaner").append("\nBag type -- ").append(vacuumCleaner.getBagType()).
				append("\nCleaning width -- ").append(vacuumCleaner.getCleaningWidth()).
				append("\nFilter type -- ").append(vacuumCleaner.getFilterType()).
				append("\nPower Consumption -- ").append(vacuumCleaner.getPowerConsumption()).
				append("\nMotor speed regulation -- ").append(vacuumCleaner.getMotorSpeedRegulation()).
				append("\nWand type -- ").append(vacuumCleaner.getWandType());

		return info.toString();
	}

	public static void printMessage(String message){
		System.out.println(message);
	}

}
