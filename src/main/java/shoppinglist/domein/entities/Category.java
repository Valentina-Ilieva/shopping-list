package shoppinglist.domein.entities;

import shoppinglist.domein.CategoryName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Category extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private CategoryName name;

    @Column(columnDefinition = "TEXT")
    private String description;
}
