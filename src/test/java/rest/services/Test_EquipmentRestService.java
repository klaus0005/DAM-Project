package rest.services;

import org.equipments.classes.Equipment;
import org.junit.jupiter.api.*;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test_EquipmentRestService {

    private static final Logger logger = Logger.getLogger(Test_EquipmentRestService.class.getName());
    private static final String BASE_URL = "http://localhost:8080/api/equipment";
    private static RestTemplate restTemplate = new RestTemplate();
    private static int testEquipmentId;

    @Test
    @Order(1)
    public void test_addEquipment() {
        logger.info("Testing: Add Equipment");

        Equipment equipment = new Equipment();
        equipment.setName("Test Equipment");
        equipment.setPrice(1500.00);
        equipment.setStatus("Available");
        equipment.setLocation("Warehouse");

        ResponseEntity<Equipment> response = restTemplate.postForEntity(BASE_URL, equipment, Equipment.class);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertNotNull(response.getBody().getId());

        testEquipmentId = response.getBody().getId(); // Save for further tests
        logger.info("Added Equipment ID: " + testEquipmentId);
    }

    @Test
    @Order(2)
    public void test_getEquipmentById() {
        logger.info("Testing: Get Equipment by ID");

        String url = BASE_URL + "/" + testEquipmentId;
        ResponseEntity<Equipment> response = restTemplate.getForEntity(url, Equipment.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(testEquipmentId, response.getBody().getId());
    }

    @Test
    @Order(3)
    public void test_updateEquipment() {
        logger.info("Testing: Update Equipment");

        String url = BASE_URL + "/" + testEquipmentId;
        Equipment updatedEquipment = new Equipment();
        updatedEquipment.setName("Updated Equipment");
        updatedEquipment.setPrice(2000.00);
        updatedEquipment.setStatus("In Use");
        updatedEquipment.setLocation("On Site");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Equipment> request = new HttpEntity<>(updatedEquipment, headers);

        ResponseEntity<Equipment> response = restTemplate.exchange(url, HttpMethod.PUT, request, Equipment.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Updated Equipment", response.getBody().getName());
    }

    @Test
    @Order(4)
    public void test_getAllEquipment() {
        logger.info("Testing: Get All Equipment");

        ResponseEntity<List> response = restTemplate.getForEntity(BASE_URL, List.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().size() > 0);
    }

    @Test
    @Order(5)
    public void test_calculateTotalValue() {
        logger.info("Testing: Calculate Total Value");

        String url = BASE_URL + "/total-value";
        ResponseEntity<Double> response = restTemplate.getForEntity(url, Double.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody() > 0);
    }

    @Test
    @Order(6)
    public void test_deleteEquipment() {
        logger.info("Testing: Delete Equipment");

        String url = BASE_URL + "/" + testEquipmentId;
        restTemplate.delete(url);

        ResponseEntity<Equipment> response = restTemplate.getForEntity(url, Equipment.class);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }
}