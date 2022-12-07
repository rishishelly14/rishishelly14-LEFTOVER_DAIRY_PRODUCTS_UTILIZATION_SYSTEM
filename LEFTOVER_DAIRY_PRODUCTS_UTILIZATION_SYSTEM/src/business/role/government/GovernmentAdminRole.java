
package business.role.government;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.government.governmentAdmin.GovernmentAdminWorkAreaJPanel;


public class GovernmentAdminRole extends Role {

    public GovernmentAdminRole() {
        super(RoleType.GovernmentAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new GovernmentAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

}
