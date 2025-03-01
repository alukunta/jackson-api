package Rctech;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjToJson {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = new Customer("Ramcharan", "101", "tejaramcharan810@gmail.com", "Bengulore");
		mapper.writeValue(new File("customer.json"), customer);
	}

}
