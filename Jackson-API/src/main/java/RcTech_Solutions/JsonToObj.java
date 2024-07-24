package RcTech_Solutions;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObj {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		mapper.readValue(file, Customer.class);
		System.out.println("Rc");
	}

}
