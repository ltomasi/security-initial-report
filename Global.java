import models.factory.VulnerabilityFactory;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import com.google.inject.Inject;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application arg0) {
        System.out.println("========================  SUBIU ====================");
    }

}
