package json;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;

public class User {

	private int age = 29;
	private String name = "mkyong";
	private ArrayList<String> messages = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};

	// getter and setter methods

	@JsonProperty
	public int getAge() {
		return age;
	}

	@JsonProperty
	public String getName() {
		return name;
	}

	@JsonProperty
	public ArrayList<String> getMessages() {
		return messages;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", " + "messages="
				+ messages + "]";
	}

}
