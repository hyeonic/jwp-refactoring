package kitchenpos.product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product save(final Product entity);

    Optional<Product> findById(final Long id);

    List<Product> findAll();
}
