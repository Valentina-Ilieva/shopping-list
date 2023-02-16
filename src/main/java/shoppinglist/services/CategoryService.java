package shoppinglist.services;

import jakarta.annotation.PostConstruct;
import shoppinglist.domein.CategoryName;
import shoppinglist.domein.entities.Category;
import shoppinglist.domein.model.CategoryModel;
import shoppinglist.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    private final ModelMapper modelMapper;

    public CategoryService(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    public void initCategories (){
        if (this.categoryRepository.count() ==0) {
        this.categoryRepository.saveAllAndFlush( Arrays.stream(CategoryName.values())
                    .map(enums-> CategoryModel.builder()
                            .name(enums)
                            .description(" to buy")
                            .build())
                    .map(categoryModel -> this.modelMapper.map(categoryModel, Category.class)).toList());
        }
    }
}
