
package business.organization;
import business.organization.dairy.DairyAdminOrganization;
import business.organization.dairy.DairyWorkerOrganization;
import business.organization.dairy.DairyManagerOrganization;
import business.organization.ngo.NGOWorkerOrganization;
import business.organization.ngo.NGOManagerOrganization;
import business.organization.ngo.NGOAdminOrganization;
import business.organization.logistics.LogisticsManagerOrganization;
import business.organization.logistics.LogisticsWorkerOrganization;
import business.organization.logistics.LogisticsAdminOrganization;
import business.organization.Organization.Type;
import business.organization.government.GovernmentAdminOrganization;
import business.organization.government.GovernmentMayorOrganization;
import java.util.ArrayList;

public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization addOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.NGOAdmin.getValue())) {
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGOManager.getValue())) {
            organization = new NGOManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGOWorker.getValue())) {
            organization = new NGOWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.LogisticsAdmin.getValue())) {
            organization = new LogisticsAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.LogisticsManager.getValue())) {
            organization = new LogisticsManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.LogisticsWorker.getValue())) {
            organization = new LogisticsWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DairyAdmin.getValue())) {
            organization = new DairyAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DairyManager.getValue())) {
            organization = new DairyManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DairyWorker.getValue())) {
            organization = new DairyWorkerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GovernmentAdmin.getValue())) {
            organization = new GovernmentAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GovernmentMayor.getValue())) {
            organization = new GovernmentMayorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void remoeOrganization(Organization o){
        organizationList.remove(o);
    }
    
    
    
    
    
    
    
    
    
}
