
package business.role.ngo;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ngo.ngoManager.NGOManagerWorkAreaJPanel;


public class NGOManagerRole extends Role {

    public NGOManagerRole() {
        super(RoleType.NGOManager);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new NGOManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network);
    }

}
