package be.ordina.services;

import be.ordina.domain.Item;
import be.ordina.repository.interfaces.ItemRepositoryInterface;

import be.ordina.services.interfaces.ItemServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by MaBa on 16/03/16.
 */
@Service
public class ItemService implements ItemServiceInterface {

    @Autowired
    private ItemRepositoryInterface itemRepository;


    @Override
    public List<Item> findAll(){
        return itemRepository.findAll();
    }

    @Override
    public Item findOne(Integer id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Item saveAndFlush(Item item) {
        return itemRepository.saveAndFlush(item);
    }

    @Override
    public void delete(Integer id) {
        itemRepository.delete(id);
    }
}
