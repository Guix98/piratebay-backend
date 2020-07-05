package bo.edu.ucb.sis.piratebay.model;

public class OrderModel {
    private int order_id;
    private int provider_id;
    private int warehouse_id;
    private String date;
    private int status;
    public OrderModel() {

    }
    public OrderModel(int order_id, int provider_id, int warehouse_id, String date, int status) {
        this.order_id = order_id;
        this.provider_id = provider_id;
        this.warehouse_id = warehouse_id;

        this.date = date;
        this.status = status;
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
