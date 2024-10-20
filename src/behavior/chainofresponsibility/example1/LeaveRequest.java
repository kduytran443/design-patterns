package behavior.chainofresponsibility.example1;

class LeaveRequest {
    private String name;
    private float days;

    private LeaveRequest(String name, float days) {
        this.name = name;
        this.days = days;
    }

    public static LeaveRequestBuilder builder() {
        return new LeaveRequestBuilder();
    }

    static class LeaveRequestBuilder {
        private String name;
        private float days;

        public LeaveRequestBuilder days(float days) {
            this.days = days;
            return this;
        }

        public LeaveRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public LeaveRequest build() {
            return new LeaveRequest(this.name, this.days);
        }
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "name='" + name + '\'' +
                ", days=" + days +
                '}';
    }

    public String getName() {
        return name;
    }

    public float getDays() {
        return days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(float days) {
        this.days = days;
    }
}
