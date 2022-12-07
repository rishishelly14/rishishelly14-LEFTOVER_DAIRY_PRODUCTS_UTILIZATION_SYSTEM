
package business.role.logistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.logistics.logisticsManager.LogisticsManagerWorkAreaJPanel;


public class LogisticsManagerRole extends Role{

    public LogisticsManagerRole() {
        super(RoleType.LogisticsManager);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LogisticsManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network);
    }
    
}
