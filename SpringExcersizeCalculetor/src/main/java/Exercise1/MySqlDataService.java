package Exercise1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDataService implements DataService{

	
	
	public int[] retriveData() {
		return new int[] {1,2,3,4,5};
	}
}
