package comum;

import java.io.Serializable;
import java.rmi.RemoteException;

public class Professor extends Pessoa implements Serializable {

	private static final long serialVersionUID = 6727480839163419904L;

	public Professor() throws RemoteException {
		super();
	}

}
