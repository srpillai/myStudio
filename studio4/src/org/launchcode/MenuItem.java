package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public String isItemNew() {
        if (this.isNew) {
            return ("This item is new!");
        }
        else {
            return ("This item is not new!");
        }
    }

    public boolean equals(MenuItem comparison) {
        if (comparison == this) {
            return true;
        }

        if (comparison == null) {
            return false;
        }

        if (comparison.getClass() != getClass()) {
            return false;
        }

        MenuItem theItem = (MenuItem) comparison;
        return theItem.getDescription() == getDescription();
    }
}
