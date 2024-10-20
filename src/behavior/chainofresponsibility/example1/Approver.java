package behavior.chainofresponsibility.example1;

import java.util.Optional;

abstract class Approver {
    private Optional<Approver> nextApprover = Optional.empty();

    public void approveLeave(LeaveRequest request) {
        if (canApprove(request)) {
            doApproving(request);
        } else if (nextApprover.isPresent()) {
            nextApprover.get().approveLeave(request);
        }
    }

    public void setNext(Approver approver) {
        this.nextApprover = Optional.of(approver);
    }

    protected abstract boolean canApprove(LeaveRequest request);

    protected abstract void doApproving(LeaveRequest request);

}
