
package business.workQueue;


public class PaymentWorkRequest extends WorkRequest{
    
    private CollectionWorkRequest collectionWorkRequest;

    public CollectionWorkRequest getCollectionWorkRequest() {
        return collectionWorkRequest;
    }

    public void setCollectionWorkRequest(CollectionWorkRequest collectionWorkRequest) {
        this.collectionWorkRequest = collectionWorkRequest;
    }
    
    @Override
    public String toString(){
        return collectionWorkRequest.getDeliveredByLogistics();
    }
    
}
