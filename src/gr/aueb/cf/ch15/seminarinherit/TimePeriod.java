package gr.aueb.cf.ch15.seminarinherit;

import java.util.Date;

public class TimePeriod extends IdentifiableEntity {
    private Date start;
    private Date end;

    public TimePeriod() {
    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
