package NNTDATA.msproduct_bank.dao;

import NNTDATA.msproduct_bank.documents.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductDao extends ReactiveMongoRepository<Product, String> {
}
