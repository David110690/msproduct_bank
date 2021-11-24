package NNTDATA.msproduct_bank.repository;

import NNTDATA.msproduct_bank.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface IProductReposiroty extends ReactiveMongoRepository<Product, String> {
    Mono<Product> findById(String id);
}
