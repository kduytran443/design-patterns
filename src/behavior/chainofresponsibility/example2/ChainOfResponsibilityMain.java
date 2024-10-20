package behavior.chainofresponsibility.example2;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        InventoryRequest request = new InventoryRequest("Name", 100, 50000);

        ApproveWorkflow.getBasicApproveWorkflow().getApprover().approve(request);
    }

}
