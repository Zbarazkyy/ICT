package entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;

public class Dutch {
    @JsonProperty("language")
    private String language;
    @JsonProperty("productname")
    private String productName;
    @JsonProperty("category")
    private String category;
    @JsonProperty("promotionaltext")
    private String promotionalText;
    @JsonProperty("description")
    private String description;
    @JsonProperty("specifications")
    private String specifications;
    @JsonProperty("caretips")
    private String careTips;
    @JsonProperty("aboutgrower")
    private String aboutGrower;

    public Dutch() {
    }

    public Dutch(String language, String productName, String category, String promotionalText, String description, String specifications, String careTips, String aboutGrower) {
        this.language = language;
        this.productName = productName;
        this.category = category;
        this.promotionalText = promotionalText;
        this.description = description;
        this.specifications = specifications;
        this.careTips = careTips;
        this.aboutGrower = aboutGrower;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPromotionalText() {
        return promotionalText;
    }

    public void setPromotionalText(String promotionalText) {
        this.promotionalText = promotionalText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getCareTips() {
        return careTips;
    }

    public void setCareTips(String careTips) {
        this.careTips = careTips;
    }

    public String getAboutGrower() {
        return aboutGrower;
    }

    public void setAboutGrower(String aboutGrower) {
        this.aboutGrower = aboutGrower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dutch dutch = (Dutch) o;
        return Objects.equals(language, dutch.language) && Objects.equals(productName, dutch.productName) && Objects.equals(category, dutch.category) && Objects.equals(promotionalText, dutch.promotionalText) && Objects.equals(description, dutch.description) && Objects.equals(specifications, dutch.specifications) && Objects.equals(careTips, dutch.careTips) && Objects.equals(aboutGrower, dutch.aboutGrower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, productName, category, promotionalText, description, specifications, careTips, aboutGrower);
    }

    @Override
    public String toString() {
        return "Dutch{" +
               "language='" + language + '\'' +
               ", productName='" + productName + '\'' +
               ", category='" + category + '\'' +
               ", promotionalText='" + promotionalText + '\'' +
               ", description='" + description + '\'' +
               ", specifications='" + specifications + '\'' +
               ", careTips='" + careTips + '\'' +
               ", aboutGrower='" + aboutGrower + '\'' +
               '}';
    }
}
