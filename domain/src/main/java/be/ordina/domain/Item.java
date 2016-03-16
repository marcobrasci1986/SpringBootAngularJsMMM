package be.ordina.domain;

import be.ordina.validators.ItemValidator;

import javax.persistence.*;
import java.lang.annotation.Annotation;

/**
 * Created by MaBa on 15/03/2016.
 */

@ItemValidator
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private boolean checked;
    @Column
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
