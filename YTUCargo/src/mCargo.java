import java.io.FileNotFoundException;

public class mCargo extends Cargo{

	public mCargo(int cargoNo, String fromWhere, String senderName, String senderPhone, String toWhere,
			String destinationName, String destinationPhone, double weight) throws FileNotFoundException {
		super(cargoNo, fromWhere, senderName, senderPhone, toWhere, destinationName, destinationPhone, weight);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double findPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
