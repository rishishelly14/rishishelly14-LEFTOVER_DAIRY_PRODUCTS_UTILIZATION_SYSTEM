
package business.util.inventory;

import business.util.request.RequestItem;


public class DistributedItems {

    private RequestItem distributedRequestItem;
    private int quantityDistributed;

    public RequestItem getDistributedRequestItem() {
        return distributedRequestItem;
    }

    public void setDistributedRequestItem(RequestItem distributedRequestItem) {
        this.distributedRequestItem = distributedRequestItem;
    }

    public int getQuantityDistributed() {
        return quantityDistributed;
    }

    public void setQuantityDistributed(int quantityDistributed) {
        this.quantityDistributed = quantityDistributed;
    }

}
