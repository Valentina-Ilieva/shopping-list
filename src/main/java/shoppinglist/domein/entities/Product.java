package shoppinglist.domein.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Product extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    private BigDecimal price;

    @Column
    private Date neededBefore;

    @ManyToOne
    private Category category;

}
