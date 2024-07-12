package Exercise1;

import java.util.Arrays;


import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	public DataService dataService;
	public BusinessCalculationService(DataService dataService) {
		this.dataService=dataService;
	}

	public int findmax() {
		int[] data = dataService.retriveData();
		return Arrays.stream(data).max().orElse(0);
	}

}
