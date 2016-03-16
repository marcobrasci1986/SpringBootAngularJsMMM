package be.ordina.controllers;

import be.ordina.domain.Item;
import be.ordina.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by MaBa on 15/03/2016.
 */
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(method = RequestMethod.GET)
    public List findItems() {
        return itemService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Item findById(@PathVariable Integer id){
        return itemService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Item addItem(@RequestBody Item item) {
        item.setId(null);
        return itemService.saveAndFlush(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Item updateItem(@RequestBody Item updatedItem, @PathVariable Integer id) {
        updatedItem.setId(id);
        return itemService.saveAndFlush(updatedItem);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Integer id) {
        itemService.delete(id);
    }
}
