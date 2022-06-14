package de.validas.utils.io.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.validas.utils.io.filesystem.Path;

public class TestPathOperations01 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPathCreation_getFile01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\de.validas.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// get File
		// Get Extension
		assertNotNull(testPath);
	}

	@Test
	void testPathCreation_getExtension01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\de.validas.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// get File
		// Get Extension
		assertNotNull(testPath);
	}
	
	@Test
	void testPathCreation_replaceExtension01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\de.validas.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		// replace Extension
		assertNotNull(testPath);
	}
	
}
