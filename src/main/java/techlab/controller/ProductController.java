package techlab.controller;

import org.springframework.web.bind.annotation.*;
import techlab.dto.request.ProductRequestDTO;
import techlab.dto.response.ProductResponseDTO;
import techlab.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

  private ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @PostMapping("/")
  public ProductResponseDTO createProduct(@RequestBody ProductRequestDTO requestDTO) {
    return this.service.createProduct(requestDTO);
  }

  @GetMapping("/")
  public List<ProductResponseDTO> getProducts() {
    return this.service.getProducts();
  }

  @GetMapping("/search")
  public List<ProductResponseDTO> searchProductsByName(@RequestParam String queryName) {
    return this.service.searchProductByName(queryName);
  }
}
