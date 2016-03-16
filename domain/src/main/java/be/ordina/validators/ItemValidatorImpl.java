package be.ordina.validators;

import be.ordina.domain.Item;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by MaBa on 16/03/16.
 */
public class ItemValidatorImpl implements ConstraintValidator<ItemValidator, Item> {


    @Override
    public void initialize(ItemValidator itemValidator) {

        System.out.printf("test");
    }

    @Override
    public boolean isValid(Item item, ConstraintValidatorContext constraintValidatorContext) {
        if(item.getDescription() != null && item.getDescription().length() > 3){
            return true;
        }
        return false;
    }
}