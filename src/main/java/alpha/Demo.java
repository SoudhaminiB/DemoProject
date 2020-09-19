package alpha;

import org.apache.log4j.*;


public class Demo {
	
	public static Logger log = LogManager.getLogger(Demo.class.getName());
	
	
	public static void main(String[] args)
	{
		log.info("This is to test lgo4j");
		log.error("This is to test error log");
		log.fatal("This is to test fatal log");
		log.debug("This is to test debug log");
	}

}
