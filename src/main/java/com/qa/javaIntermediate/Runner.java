package com.qa.javaIntermediate;

//import java.util.ArrayList;
//import java.util.List;

//get the correct imports (log4j imports, not the java.util ones
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	public static Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ----------------------- ENUMS -----------------------

		// Enums - enumerated types - has finite number of values - list of constants
		// equivalent of "public static final" - take a look at Menu and MenuClass to
		// note the difference

		System.out.println(Menu.DESSERT.print());
		System.out.println(Planets.EARTH.calc());

		// ----------------------- GENERICS -----------------------

		// Generics - unspecified data type - abstraction

		Generics<Integer, String> gen = new Generics<Integer, String>(3, 4, "hi");
		System.out.println(gen.getName() + 10);// hi10
		System.out.println(gen.getVal() + 10);// 13
		System.out.println(gen.getNum() + 10);// 14
		// Example of Java classes that use generics
//		List<Integer> list = new ArrayList<Integer>();
//		List<String> list2 = new ArrayList<String>();

		// ----------------------- LOGGERS -----------------------

		System.out.println("hello"); // simple print to the console

		// ----java.util.logging (internal logger library)
		// severe
		// warning
		// info
		// config
		// fine
		// finer
		// finest

		// ----log4j (external logger library) - more commonly used
		// fatal
		// error
		// warn
		// info
		// debug
		LOGGER.fatal("fatal");
		LOGGER.error("ERROR");
		LOGGER.warn("warn");
		LOGGER.info("info");
		LOGGER.debug("debug");

	}

}
