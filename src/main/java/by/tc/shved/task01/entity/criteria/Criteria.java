package by.tc.shved.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria<E> {
	
	private ApplianceType applianceType;

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public Set<E> getKeySet(){
		return criteria.keySet();
	}

	public Object getElement(E key){
		return criteria.get(key);
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public ApplianceType getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(ApplianceType applianceType) {
		this.applianceType = applianceType;
	}


}
