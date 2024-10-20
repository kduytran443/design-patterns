package behavior.chainofresponsibility;

class DirectorApprover extends Approver {
    @Override
    protected boolean canApprove(LeaveRequest request) {
        return true;
    }

    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println(String.format("Leave request %s approved by Director", request));
    }
}
