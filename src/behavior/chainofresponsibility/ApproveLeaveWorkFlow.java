package behavior.chainofresponsibility;

class ApproveLeaveWorkFlow {

    private ApproveLeaveWorkFlow() {
        // private constructor
    }

    public static Approver getApprover() {
        Approver manager = new ManagerApprover();
        Approver deliveryManager = new DeliveryManagerApprover();
        Approver directorApprover = new DirectorApprover();

        manager.setNext(deliveryManager);
        deliveryManager.setNext(directorApprover);

        return manager;
    }

}
