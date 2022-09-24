package net.seyfe.JenkinsCICD;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsCicdApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsCicdApplicationTests.class);

	@Test
	public  contextLoads() {
		logger.info("Test case executed...");
		logger.info("Test case executed --> Second log statement...");
		assertEquals(true, true);
	}

}
