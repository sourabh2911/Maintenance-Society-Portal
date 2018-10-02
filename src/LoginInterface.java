
import java.rmi.Remote;

public interface LoginInterface extends Remote {
    boolean check(String userId, String password)throws Exception;
}
