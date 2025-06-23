package techlab.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {

  private String name;
  private Double price;
  private String description;
  private String img;
}
