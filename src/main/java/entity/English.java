package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class English {
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

    public English() {
    }

    public English(String language, String productName, String category, String promotionalText, String description, String specifications, String careTips, String aboutGrower) {
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
        English english = (English) o;
        return Objects.equals(language, english.language) && Objects.equals(productName, english.productName) && Objects.equals(category, english.category) && Objects.equals(promotionalText, english.promotionalText) && Objects.equals(description, english.description) && Objects.equals(specifications, english.specifications) && Objects.equals(careTips, english.careTips) && Objects.equals(aboutGrower, english.aboutGrower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, productName, category, promotionalText, description, specifications, careTips, aboutGrower);
    }

    @Override
    public String toString() {
        return "English{" +
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
