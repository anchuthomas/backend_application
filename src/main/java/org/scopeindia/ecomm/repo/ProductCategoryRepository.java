package org.scopeindia.ecomm.repo;

import org.scopeindia.ecomm.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://a59fa12714b37448ea3e366e2041dcb3-1666809775.ap-south-1.elb.amazonaws.com")
@RepositoryRestResource(path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
