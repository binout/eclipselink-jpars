package com.devoxx.eclipselink.jpars;

import javax.persistence.*;

@Entity
@Table(name="PROD")
@NamedQuery(name="Product.findAll", query ="select p from Product p")
public class Product {
    
    @GeneratedValue @Id
    private Long id;
    
    private String techCode;
    private String studyCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(String studyCode) {
        this.studyCode = studyCode;
    }

    public String getTechCode() {
        return techCode;
    }

    public void setTechCode(String techCode) {
        this.techCode = techCode;
    }
    
    
}
