package techlab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import techlab.dto.request.ProductRequestDTO;
import techlab.dto.response.ProductResponseDTO;
import techlab.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "${frontend.url}")
public class ProductController {

  private ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @PostMapping("")
  public ResponseEntity<ProductResponseDTO> createProduct(
      @RequestBody ProductRequestDTO requestDTO) {
    return ResponseEntity.status(HttpStatus.CREATED).body(this.service.createProduct(requestDTO));
  }

  @GetMapping("")
  public List<ProductResponseDTO> getProducts() {
    return this.service.getProducts();
  }

  @GetMapping("/search")
  public List<ProductResponseDTO> searchProductsByName(@RequestParam String queryName) {
    return this.service.searchProductByName(queryName);
  }

  @PutMapping("/{id}")
  public ProductResponseDTO updateProduct(@PathVariable Long id,
      @RequestBody ProductRequestDTO requestDTO) {
    return this.service.updateProduct(id, requestDTO);
  }

  @DeleteMapping("/{id}")
  public ProductResponseDTO deleteProduct(@PathVariable Long id) {
    return this.service.deleteProduct(id);
  }
}
