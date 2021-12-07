package NNTDATA.msproduct_bank.handler;

import NNTDATA.msproduct_bank.documents.Product;
import NNTDATA.msproduct_bank.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public Flux<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> findById(@PathVariable String id){
        return productService.findById(id);
    }

    @PostMapping
    public Mono<Product> save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> delete(@PathVariable String id){
        return productService.findById(id).flatMap(p ->{
            return productService.delete(p).then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)));
        }).defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<Product>> editProduct(@RequestBody Product product, @PathVariable String id){
        return productService.findById(id).flatMap(p -> {
                    p.setProductName(product.getProductName());
                    p.setCurrency(product.getCurrency());
                    p.setProductType(product.getProductType());
                    p.setProductRule(product.getProductRule());
                    return productService.save(p);
                }).map(p->ResponseEntity.created(URI.create("/api/products".concat(p.getId())))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(p))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
