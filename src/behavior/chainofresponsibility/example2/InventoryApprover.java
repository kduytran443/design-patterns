package behavior.chainofresponsibility.example2;

abstract class InventoryApprover {
    private InventoryApprover nextApprover;

    public void approve(InventoryRequest request) {
        if (canApprove(request)) {
            approveAction(request);
        } else if (nextApprover != null) {
            nextApprover.approve(request);
        } else {
            rejectAction(request);
        }
    }

    public abstract boolean canApprove(InventoryRequest request);

    public abstract void approveAction(InventoryRequest request);

    public abstract void rejectAction(InventoryRequest request);

    public void setNext(InventoryApprover approver) {
        this.nextApprover = approver;
    }
}
