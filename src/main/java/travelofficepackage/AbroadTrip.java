package travelofficepackage;

import java.math.BigDecimal;

public class AbroadTrip extends Trip{
    private BigDecimal insurance;

    public AbroadTrip(Date start, Date end, String destination, BigDecimal price,BigDecimal insurance) {
        super(start, end, destination, price);
        setInsurance(insurance);
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }
    @Override
    public BigDecimal getPrice()
    {
        return super.getPrice().subtract(insurance);
    }
}
