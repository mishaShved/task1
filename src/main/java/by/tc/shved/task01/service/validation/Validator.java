package by.tc.shved.task01.service.validation;

import by.tc.shved.task01.entity.criteria.Criteria;
import by.tc.shved.task01.entity.criteria.SearchCriteria;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		boolean isValid = true;

		switch (criteria.getApplianceType()){
                        
                    // pi.....pi....pi....pi....pi
			case OVEN:
					for(E element : criteria.getKeySet()){
						if (!(criteria.getElement(element) instanceof Number)){
							isValid = false;
							break;
						}
					}
				break;
			case LAPTOP:
				for(E element : criteria.getKeySet()){
					if(element == SearchCriteria.Laptop.OS){
						if (!(criteria.getElement(element) instanceof String)){
							isValid = false;
							break;
						}
					}else{
						if (!(criteria.getElement(element) instanceof Number)){
							isValid = false;
							break;
						}
					}
				}

				break;
			case SPEAKERS:
				for(E element : criteria.getKeySet()){
					if(element == SearchCriteria.Speakers.FREQUENCY_RANGE){
						if (!(criteria.getElement(element) instanceof String)){
							isValid = false;
							break;
						}
					}else{
						if (!(criteria.getElement(element) instanceof Number)){
							isValid = false;
							break;
						}
					}
				}
				break;
			case TABLET_PC:
				for(E element : criteria.getKeySet()){
					if(element == SearchCriteria.TabletPC.COLOR){
						if (!(criteria.getElement(element) instanceof String)){
							isValid = false;
							break;
						}
					}else{
						if (!(criteria.getElement(element) instanceof Number)){
							isValid = false;
							break;
						}
					}
				}

				break;
			case REFRIGERATOR:
					for(E element : criteria.getKeySet()){
						if (!(criteria.getElement(element) instanceof Number)){
							isValid = false;
							break;
						}
					}
				break;
			case VACUUM_CLEANER:
				for(E element : criteria.getKeySet()){
					if(element == SearchCriteria.VacuumCleaner.FILTER_TYPE ||
							element == SearchCriteria.VacuumCleaner.BAG_TYPE ||
							element == SearchCriteria.VacuumCleaner.WAND_TYPE){
						if (!(criteria.getElement(element) instanceof String)){
							isValid = false;
							break;
						}
					}else{
						if (!(criteria.getElement(element) instanceof Number)){
							isValid = false;
							break;
						}
					}
				}

				break;
		}

		return isValid;
	}

}
