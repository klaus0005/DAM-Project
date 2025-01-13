package org.equipments.RestServices;

import org.equipments.classes.Equipment;
import org.equipments.domain.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentRestService {

    @Autowired
    private EquipmentService equipmentService;

    // Get all equipment
    @GetMapping
    public List<Equipment> getAllEquipment() {
        return equipmentService.getAllEquipment();
    }

    // Get equipment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable int id) {
        Equipment equipment = equipmentService.getEquipmentById(id);
        if (equipment != null) {
            return ResponseEntity.ok(equipment);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Add new equipment
    @PostMapping
    public ResponseEntity<Equipment> addEquipment(@RequestBody Equipment equipment) {
        Equipment addedEquipment = equipmentService.addEquipment(equipment);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedEquipment);
    }

    // Update equipment
    @PutMapping("/{id}")
    public ResponseEntity<Equipment> updateEquipment(@PathVariable int id, @RequestBody Equipment updatedEquipment) {
        Equipment updated = equipmentService.updateEquipment(id, updatedEquipment);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Delete equipment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEquipment(@PathVariable int id) {
        equipmentService.deleteEquipment(id);
        return ResponseEntity.noContent().build();
    }

    // Get equipment by status
    @GetMapping("/status/{status}")
    public List<Equipment> getEquipmentByStatus(@PathVariable String status) {
        return equipmentService.getEquipmentByStatus(status);
    }

    // Get equipment by location
    @GetMapping("/location/{location}")
    public List<Equipment> getEquipmentByLocation(@PathVariable String location) {
        return equipmentService.getEquipmentByLocation(location);
    }

    // Calculate total value of equipment
    @GetMapping("/total-value")
    public double calculateTotalValue() {
        return equipmentService.calculateTotalValue();
    }

    // Find most expensive equipment
    @GetMapping("/most-expensive")
    public ResponseEntity<Equipment> findMostExpensiveEquipment() {
        Equipment equipment = equipmentService.findMostExpensiveEquipment();
        if (equipment != null) {
            return ResponseEntity.ok(equipment);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // Check if equipment is available
    @GetMapping("/{id}/available")
    public boolean isEquipmentAvailable(@PathVariable int id) {
        return equipmentService.isEquipmentAvailable(id);
    }

    // Filter equipment by price range
    @GetMapping("/filter-by-price")
    public List<Equipment> filterByPriceRange(@RequestParam double minPrice, @RequestParam double maxPrice) {
        return equipmentService.filterByPriceRange(minPrice, maxPrice);
    }
}
