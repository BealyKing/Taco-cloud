package taco.data;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import taco.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
    
}
