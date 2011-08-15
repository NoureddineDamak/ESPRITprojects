import java.rmi.RemoteException;
import javax.xml.*;
import _1._0._0._127.axis.sommer_jws.*;
public class SommerClient {
      public static void main(String[] args) {
// Cr�ation du service depuis le endpoint
// SommerService correspond au nom du service dans le fichier �wsdl�
// c�est la balise : <wsdl:service name="sommerService">
       SommerService service = new SommerServiceLocator();
       try {
// Utilisation du service pour obtenir un stub qui implemente le SDI
// (Service Definition Type ; i.e. PortType).
// Pour le typage, c�est la balise : <wsdl:portType name="sommer">
// Pour le getsommer(), le sommer correspond � la balise :
// <wsdl:port binding="impl:sommerSoapBinding" name="sommer">
            Sommer port = service.getsommer();
            int s;
            try {
// Mise en oeuvre du service par application directe des m�thodes
                  s = port.getsomme(2, 3);
                  System.out.println("2+3 = " + s);
            } catch (RemoteException e1) {
                  e1.printStackTrace();
            }
       } catch (ServiceException e) {
            e.printStackTrace();
      }
      }
}