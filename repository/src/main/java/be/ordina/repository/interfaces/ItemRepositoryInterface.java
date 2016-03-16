package be.ordina.repository.interfaces;

import be.ordina.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MaBa on 15/03/2016.
 */
public interface ItemRepositoryInterface extends JpaRepository<Item, Integer>{
}
