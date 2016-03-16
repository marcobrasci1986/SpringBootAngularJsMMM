package be.ordina.services.interfaces;

import be.ordina.domain.Item;

import java.util.List;

/**
 * Created by MaBa on 16/03/16.
 */
public interface GenericServiceInterface<ENTITY, ID> {

    List<ENTITY> findAll();
    ENTITY findOne(ID id);
    ENTITY saveAndFlush(ENTITY entity);
    void delete(ID id);
}
