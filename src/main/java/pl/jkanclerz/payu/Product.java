package pl.jkanclerz.payu;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    String name;
    Integer unitPrice;
    Integer quantity;
}
