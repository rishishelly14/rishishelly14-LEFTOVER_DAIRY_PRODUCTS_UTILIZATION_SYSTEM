
package business.workQueue;

import business.userAccount.UserAccount;


public class ShortageWorkRequest extends WorkRequest {

    private CollectionWorkRequest linkedCollectionWorkRequest;
    private String ngoName;
    private UserAccount assignToEmployee;

    public CollectionWorkRequest getLinkedCollectionWorkRequest() {
        return linkedCollectionWorkRequest;
    }

    public void setLinkedCollectionWorkRequest(CollectionWorkRequest linkedCollectionWorkRequest) {
        this.linkedCollectionWorkRequest = linkedCollectionWorkRequest;
    }

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public UserAccount getAssignToEmployee() {
        return assignToEmployee;
    }

    public void setAssignToEmployee(UserAccount assignToEmployee) {
        this.assignToEmployee = assignToEmployee;
    }

}
