package Exercise1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MongoDBDataServiceQualifier")
public class MongoDBDataService implements DataService{
	

	
	public int[] retriveData() {
		return new int[] {11,22,33,44,55};
	}

}
