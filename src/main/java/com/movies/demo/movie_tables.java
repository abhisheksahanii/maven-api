package com.movies.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class movie_tables {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String ranking;

  private String title;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRanking() {
    return ranking;
  }

  public void setRanking(String ranking) {
    this.ranking = ranking;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}