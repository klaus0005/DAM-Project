package org.equipments.classes;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id @GeneratedValue
    private int userId;
    private String name;
    private String role;
    private String department;

    public User(int i, String johnDoe, String mail) {

    }
}
