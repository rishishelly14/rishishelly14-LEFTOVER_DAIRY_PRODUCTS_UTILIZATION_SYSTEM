
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;


public class DairyEnterprise extends Enterprise {

    public DairyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Dairy);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
