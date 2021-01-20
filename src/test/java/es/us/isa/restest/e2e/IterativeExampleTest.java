package es.us.isa.restest.e2e;

import es.us.isa.restest.main.TestGenerationAndExecution;
import es.us.isa.restest.util.RESTestException;

import org.junit.Ignore;
import org.junit.Test;

import static es.us.isa.restest.util.FileManager.checkIfExists;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IterativeExampleTest {

    @Test
    public void testIterativeExampleWithBasicPropertiesFile() throws RESTestException {
        String[] args = {"src/test/resources/Bikewise/bikewise_test.properties"};
        TestGenerationAndExecution.main(args);

        assertTrue(checkIfExists("src/generation/java/bikewise"));

        assertTrue(checkIfExists("target/allure-results/bikewise"));
        assertTrue(checkIfExists("target/allure-reports/bikewise"));
        assertTrue(checkIfExists("target/test-data/bikewise/time.csv"));
        assertTrue(checkIfExists("target/coverage-data/bikewise"));
        assertTrue(checkIfExists("target/test-data/bikewise"));
        assertTrue(checkIfExists("log/bikewise.log"));
    }

    @Test
    public void testARTIterativeExample() throws RESTestException {
        String[] args = {"src/test/resources/AnApiOfIceAndFire/iceandfire_art.properties"};
        TestGenerationAndExecution.main(args);

        assertTrue(checkIfExists("src/generation/java/anApiOfIceAndFire"));

        assertTrue(checkIfExists("target/allure-results/anApiOfIceAndFire"));
        assertTrue(checkIfExists("target/allure-reports/anApiOfIceAndFire"));
        assertTrue(checkIfExists("target/test-data/anApiOfIceAndFire/time.csv"));
        assertTrue(checkIfExists("target/coverage-data/anApiOfIceAndFire"));
        assertTrue(checkIfExists("target/test-data/anApiOfIceAndFire"));
        assertTrue(checkIfExists("log/anApiOfIceAndFire.log"));
    }

}
