package json;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonJacksonJsonTOObject {

	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String json = "{\"name\":\"user1\",\"age\":11,\"messages\":[\"msg 1\",\"msg 2\",\"msg 3\"]}";

		ObjectMapper mapper = new ObjectMapper();
		User userJson = mapper.readValue(json, User.class);
		
		System.out.println(userJson.toString());
		
		
//		URL resource = JacksonReaderTesting.class.getClassLoader().getResource("book.json");
	}
	
}
