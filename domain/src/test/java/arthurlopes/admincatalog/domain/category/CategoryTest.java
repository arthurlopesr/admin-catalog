package arthurlopes.admincatalog.domain.category;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    @DisplayName("Given a valid params when call new Category then instance a category")
    public void execute_category_instance() {
        final var expectedName = "any_name";
        final var expectedDescription = "any_description";
        final var expectedIsActive = true;

        final var createdCategory = Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        Assertions.assertNotNull(createdCategory);
        Assertions.assertNotNull(createdCategory.getId());
        Assertions.assertEquals(expectedName, createdCategory.getName());
        Assertions.assertEquals(expectedDescription, createdCategory.getDescription());
        Assertions.assertEquals(expectedIsActive, createdCategory.isActive());
        Assertions.assertNotNull(createdCategory.getCreatedAt());
        Assertions.assertNotNull(createdCategory.getUpdatedAt());
        Assertions.assertNull(createdCategory.getDeletedAt());
    }
}