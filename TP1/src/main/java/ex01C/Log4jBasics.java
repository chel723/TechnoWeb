package ex01C;

import org.apache.log4j.*;

public class Log4jBasics {
  protected static Logger log =
  Logger.getLogger(Log4jBasics.class);

  public static void main(String[] args) {
  	log.info("INFO: Cool !");
    log.debug("DEBUG: Cool !");
  }
}

/*
 * mvn exec:java -Dexec.mainClass="ex01C.Log4jBasics"
 */
