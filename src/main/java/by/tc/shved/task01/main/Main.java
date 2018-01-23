package by.tc.shved.task01.main;

import static by.tc.shved.task01.entity.criteria.SearchCriteria.*;

import by.tc.shved.task01.entity.Appliance;
import by.tc.shved.task01.entity.criteria.ApplianceType;
import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.service.ApplianceService;
import by.tc.shved.task01.service.ServiceFactory;
import by.tc.shved.task01.service.validation.Validator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();


		Criteria<Oven> criteriaOven = new Criteria<>();
		criteriaOven.setApplianceType(ApplianceType.OVEN);
		criteriaOven.add(Oven.CAPACITY, 33);
		System.out.printf(":sosi");
		if(Validator.criteriaValidator(criteriaOven)){
			appliance = service.find(criteriaOven);
			PrintApplianceInfo.print(appliance);
		}else{
			PrintApplianceInfo.printMessage("Data is not correct\n\n");
		}


		criteriaOven = new Criteria<>();
		criteriaOven.setApplianceType(ApplianceType.OVEN);
		criteriaOven.add(Oven.HEIGHT, "sd");
		criteriaOven.add(Oven.WEIGHT, 12);

		if (Validator.criteriaValidator(criteriaOven)) {
			appliance = service.find(criteriaOven);
			PrintApplianceInfo.print(appliance);
		}else{
			PrintApplianceInfo.printMessage("Data is not correct\n\n");
		}


		Criteria<VacuumCleaner> criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceType(ApplianceType.VACUUM_CLEANER);
		criteriaLaptop.add(VacuumCleaner.BAG_TYPE, "A2");
		criteriaLaptop.add(VacuumCleaner.CLEANING_WIDTH, 20);

		if (Validator.criteriaValidator(criteriaLaptop)) {
			appliance = service.find(criteriaLaptop);
			PrintApplianceInfo.print(appliance);
		}else{
			PrintApplianceInfo.printMessage("Data is not correct\n\n");
		}


		
		Criteria<TabletPC> criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.setApplianceType(ApplianceType.TABLET_PC);
		criteriaTabletPC.add(TabletPC.COLOR, "red");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

	}

}

