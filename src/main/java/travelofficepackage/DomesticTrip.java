package travelofficepackage;

import java.math.BigDecimal;


public class DomesticTrip extends Trip{

    private BigDecimal ownArrivalDiscount;

    public BigDecimal getOwnArrivalDiscount() {
        return ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(BigDecimal ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    public DomesticTrip(Date start, Date end, String destination, BigDecimal price, BigDecimal ownArrivalDiscount) {
        super(start, end, destination, price);
        setOwnArrivalDiscount(ownArrivalDiscount);
    }

    @Override
    public BigDecimal getPrice()
    {

        return super.getPrice().subtract(ownArrivalDiscount);

    }
}
