
package business.role.logistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.logistics.logisticsAdmin.LogisticsAdminWorkAreaJPanel;


public class LogisticsAdminRole extends Role {

    public LogisticsAdminRole() {
        super(RoleType.LogisticsAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LogisticsAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

}
