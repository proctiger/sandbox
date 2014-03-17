package json;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonJaksonObjectToJSONTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		User user = new User();
		user.setName("user1");
		user.setAge(11);
		
		System.out.println(mapper.writeValueAsString(user));
	}
}


