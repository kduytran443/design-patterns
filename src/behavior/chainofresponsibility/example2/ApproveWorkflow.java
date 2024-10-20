package behavior.chainofresponsibility.example2;

interface ApproveWorkflow {

    InventoryApprover getApprover();

    static ApproveWorkflow getBasicApproveWorkflow() {
        return new BasicApproveWorkflow();
    }

    static ApproveWorkflow getAdvancedApproveWorkflow() {
        return new AdvancedApproveWorkflow();
    }

}

class BasicApproveWorkflow implements ApproveWorkflow {

    @Override
    public InventoryApprover getApprover() {
        WarehouseManager warehouseManager = new WarehouseManager();
        WarehouseStaff warehouseStaff = new WarehouseStaff();
        warehouseStaff.setNext(warehouseManager);
        return warehouseStaff;
    }

}

class AdvancedApproveWorkflow implements ApproveWorkflow {

    @Override
    public InventoryApprover getApprover() {
        SupplyChainManager supplyChainManager = new SupplyChainManager();
        WarehouseManager warehouseManager = new WarehouseManager();
        WarehouseStaff warehouseStaff = new WarehouseStaff();

        warehouseStaff.setNext(warehouseManager);
        warehouseManager.setNext(supplyChainManager);

        return warehouseStaff;
    }
}
