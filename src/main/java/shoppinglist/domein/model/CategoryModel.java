package shoppinglist.domein.model;

import shoppinglist.domein.CategoryName;
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class CategoryModel {
    Long id;
    private CategoryName name;
    private String description;
}
