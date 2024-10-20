package behavior.chainofresponsibility.example2;

public class WarehouseStaff extends InventoryApprover {
    @Override
    public boolean canApprove(InventoryRequest request) {
        return request.getQuantity() < 500 && request.getTotalPrice() < 5000;
    }

    @Override
    public void approveAction(InventoryRequest request) {
        System.out.println(String.format("%s approved by WarehouseStaff", request));
    }

    @Override
    public void rejectAction(InventoryRequest request) {
        System.out.println(String.format("%s rejected by WarehouseStaff", request));
    }
}
