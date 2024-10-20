package behavior.chainofresponsibility;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        LeaveRequest leaveRequest = LeaveRequest.builder()
                .days(1000)
                .name("DuyTran")
                .build();

        ApproveLeaveWorkFlow.getApprover().approveLeave(leaveRequest);
    }

}
