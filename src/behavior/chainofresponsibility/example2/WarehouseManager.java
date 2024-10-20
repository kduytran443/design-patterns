package behavior.chainofresponsibility.example2;

public class WarehouseManager extends InventoryApprover {
    @Override
    public boolean canApprove(InventoryRequest request) {
        return request.getQuantity() < 100 && request.getTotalPrice() < 10000;
    }

    @Override
    public void approveAction(InventoryRequest request) {
        System.out.println(String.format("%s approved by WarehouseManager", request));
    }

    @Override
    public void rejectAction(InventoryRequest request) {
        System.out.println(String.format("%s rejected by WarehouseManager", request));
    }
}
