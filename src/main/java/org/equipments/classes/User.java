package org.equipments.classes;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data // Generează getter, setter, toString, equals, hashCode
@AllArgsConstructor // Constructor cu toți parametrii
@NoArgsConstructor // Constructor fără parametri
@Builder // Permite utilizarea unui builder pattern
public class User {
    private int userId;
    private String name;
    private String role;
    private String department;
}
