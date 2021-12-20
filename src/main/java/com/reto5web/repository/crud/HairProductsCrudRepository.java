package com.reto5web.repository.crud;


import com.reto5web.model.HairProducts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * 
 * @author aleja
 */
public interface HairProductsCrudRepository extends MongoRepository<HairProducts, String> {
    //Reto 5
    public List<HairProducts> findByPriceLessThanEqual(double precio);

    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<HairProducts> findByDescriptionLike(String description);
}

