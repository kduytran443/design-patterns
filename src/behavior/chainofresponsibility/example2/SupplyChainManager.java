package behavior.chainofresponsibility.example2;

class SupplyChainManager extends InventoryApprover {

    @Override
    public boolean canApprove(InventoryRequest request) {
        return true;
    }

    @Override
    public void approveAction(InventoryRequest request) {
        System.out.println(String.format("%s approved by SupplyChainManager", request));
    }

    @Override
    public void rejectAction(InventoryRequest request) {
        System.out.println(String.format("%s rejected by SupplyChainManager", request));
    }

}
