
package business.util.inventory;

import java.util.ArrayList;


public class Distributed {

    private ArrayList<DistributedItems> distributedItemList;
    private int peopleFed;

    public Distributed() {
        distributedItemList = new ArrayList();
    }

    public ArrayList<DistributedItems> getDistributedItemList() {
        return distributedItemList;
    }

    public int getPeopleFed() {
        return peopleFed;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    public void removeDistributedItem(DistributedItems di) {
        distributedItemList.remove(di);
    }

    public DistributedItems addDistributedItems() {
        DistributedItems di = new DistributedItems();
        distributedItemList.add(di);
        return di;
    }

}
