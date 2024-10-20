package behavior.chainofresponsibility;

public class ManagerApprover extends Approver {
    @Override
    protected boolean canApprove(LeaveRequest request) {
        return request.getDays() <= 5;
    }

    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println(String.format("Leave request %s approved by Manager", request));
    }
}
