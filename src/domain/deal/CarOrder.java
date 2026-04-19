package domain.deal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarOrder extends Car{
    private long carOrderId;

    private Buyer buyer;
    private Seller seller;


    private String dealCertificateId;
    private LocalDate dealDate;

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public long getCarOrderId() {
        return carOrderId;
    }

    public void setCarOrderId(long carOrderId) {
        this.carOrderId = carOrderId;
    }

    public String getDealCertificateId() {
        return dealCertificateId;
    }

    public void setDealCertificateId(String dealCertificateId) {
        this.dealCertificateId = dealCertificateId;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }
}
































