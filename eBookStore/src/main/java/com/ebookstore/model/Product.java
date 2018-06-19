package com.ebookstore.model;

import org.springframework.stereotype.Indexed;
import org.springframework.web.multipart.MultipartFile;
import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

// adds this class to database. An instance of this corresponds to a row
@Indexed
@Entity
public class Product
{
    @Id // unique id
    @GeneratedValue(strategy = GenerationType.AUTO) // generates products ID as they are added
    private String productId;
    private String productName;
    private String productAuthor;
    private String productCategory;
    private String productDescription;
    private double productPrice;
    private String productCondition;
    private String productStatus;
    private Date productReleaseDate;
    private int unitInStock;
    private String productPublisher;

    @OneToOne
    @JoinColumn(name="ratingId")
    private Rating rating;

    @OneToOne
    @JoinColumn(name="commentId")
    private Comment comment;

    @Transient
    private MultipartFile productImage;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductAuthor() {
        return productAuthor;
    }

    public void setProductAuthor(String productAuthor) {
        this.productAuthor = productAuthor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductPublisher() {
        return productPublisher;
    }

    public void setProductPublisher(String productPublisher) {
        this.productPublisher = productPublisher;
    }

    public String getProductReleaseDate() {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        return sd.format(productReleaseDate);
    }

    public void setProductReleaseDate(Date productReleaseDate) {
        this.productReleaseDate = productReleaseDate;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
