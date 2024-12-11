package org.work1.eventmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "dinner_tables") 
public class DinnerTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dinner_tables_seq")
    @SequenceGenerator(name = "dinner_tables_seq", sequenceName = "dinner_tables_seq", allocationSize = 1)
    private long id;

    private int number;
    private int places;

    public DinnerTable(int n, int p) {
        number = n;
        places = p;
    }

    public DinnerTable() {}

    @Column(name = "number", unique = true)
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    @Column(name = "places")
    public int getPlaces() {
        return places;
    }

    public void setPlaces(int p) {
        places = p;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", number=" + number +
                ", places=" + places +
                '}';
    }
}

