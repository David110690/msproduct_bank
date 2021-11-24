package NNTDATA.msproduct_bank.controller.rest;

import NNTDATA.msproduct_bank.entity.Product;
import NNTDATA.msproduct_bank.repository.IProductReposiroty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final IProductReposiroty iProductRepository;

    @GetMapping("/{id}")
    public Mono<Product> findById(@PathVariable String id){
        return iProductRepository.findById(id);
    }

    @PostMapping
    public Mono<Product> save(@RequestBody Product product){
        return iProductRepository.save(product);
    }
}
