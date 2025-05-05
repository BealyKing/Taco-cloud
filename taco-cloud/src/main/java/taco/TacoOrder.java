package taco;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class TacoOrder {
    //Название доставки
    @NotBlank(message = "Delivery name is required")
    private String deliveryName;
    @NotBlank(message = "Street is required")
    //Улица доставки
    private String deliveryStreet;
    @NotBlank(message = "City name is required")
    //Город оставки
    private String deliveryCity;
    @NotBlank(message = "State is required")
    //Состояние доставки
    private String deliveryState;
    @NotBlank(message = "Zip is required")
    //Быстрая доставка
    private String deliveryZip;
    //Оплата
    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
    
    private List<Taco> tacos = new ArrayList<Taco>();
    
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
    
}
