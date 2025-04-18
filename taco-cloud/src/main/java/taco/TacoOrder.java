package taco;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoOrder {
    //Название доставки
    private String deliveryName;
    //Улица доставки
    private String deliveryStreet;
    //Город оставки
    private String deliveryCity;
    //Состояние доставки
    private String deliveryState;
    //Быстрая доставка
    private String deliveryZip;
    //Оплата
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    
    private List<Taco> tacos = new ArrayList<Taco>();
    
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
    
}
