package com.cefothe.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by cefothe on 27.11.16.
 */
@Entity
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b"),
        @NamedQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title ='H2G2'")
})
public class Book {
    @Id
    @GeneratedValue
    @Getter
    private Long id;

    @NotNull
    @Getter
    private String title;

    @Getter
    private Float price;
    @Size(min = 10, max = 2000)

    @Getter
    private String description;

    @Getter
    private String isbn;

    @Getter
    private Integer nbOfPage;

    @Getter
    private Boolean illustrations;

    public Book(String title, Float price,String description, String isbn, Integer nbOfPage, Boolean illustrations) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.isbn = isbn;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustrations;
    }
}
