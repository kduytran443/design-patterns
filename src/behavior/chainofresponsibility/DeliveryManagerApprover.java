package behavior.chainofresponsibility;

class DeliveryManagerApprover extends Approver {
    @Override
    protected boolean canApprove(LeaveRequest request) {
        return request.getDays() <= 15;
    }

    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println(String.format("Leave request %s approved by DeliveryManager", request));
    }
}
