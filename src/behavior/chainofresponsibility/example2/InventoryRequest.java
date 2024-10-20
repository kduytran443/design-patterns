package behavior.chainofresponsibility.example2;

class InventoryRequest {
    private final String itemName;
    private final float quantity;
    private final float totalPrice;

    public InventoryRequest(String itemName, float quantity, float totalPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "InventoryRequest{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
