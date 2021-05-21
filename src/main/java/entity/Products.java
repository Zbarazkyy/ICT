package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;
import java.util.Objects;

public class Products {

    @JsonProperty("timestamp")
    private String timeStamp;

    @JsonProperty("productcode")
    private String productCode;

    @JsonProperty("potsize")
    private Float potSize;

    @JsonProperty("height")
    private Float height;

    @JsonProperty("linnaeusname")
    private String linnaeusName;

    @JsonProperty("numberperorder")
    private Integer numberPerOrder;

    @JsonProperty("purchaseprice")
    private Integer purchasePrice;

    @JsonProperty("branches")
    private Integer branches;

    @JsonProperty("images")
    private List <String> images;

    @JsonProperty("languages")
    private Languages languages;

    @JsonProperty("grower")
    private String grower;

    public Products() {
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Float getPotSize() {
        return potSize;
    }

    public void setPotSize(Float potSize) {
        this.potSize = potSize;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getLinnaeusName() {
        return linnaeusName;
    }

    public void setLinnaeusName(String linnaeusName) {
        this.linnaeusName = linnaeusName;
    }

    public Integer getNumberPerOrder() {
        return numberPerOrder;
    }

    public void setNumberPerOrder(Integer numberPerOrder) {
        this.numberPerOrder = numberPerOrder;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getBranches() {
        return branches;
    }

    public void setBranches(Integer branches) {
        this.branches = branches;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public String getGrower() {
        return grower;
    }

    public void setGrower(String grower) {
        this.grower = grower;
    }

    @Override
    public String toString() {
        return "Products{" +
               "timeStamp='" + timeStamp + '\'' +
               ", productCode='" + productCode + '\'' +
               ", potSize=" + potSize +
               ", height=" + height +
               ", linnaeusName='" + linnaeusName + '\'' +
               ", numberPerOrder=" + numberPerOrder +
               ", purchasePrice=" + purchasePrice +
               ", branches=" + branches +
               ", images=" + images +
               ", languages=" + languages +
               ", grower='" + grower + '\'' +
               '}';
    }
}
