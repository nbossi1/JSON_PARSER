package Sale_announcement;

/**
 * @author nbossi1
 *
 * Campi relativi al motore del veicolo e rappresenta il JSON
 */
public class Vehicle_engine {
	//Campi del json file
	private static final String field[] = {"\"cylinders\"", "\"fuel\"", "\"odometer\"", "\"transmission\"", "\"drive\""};
	
	//Attributi
	private String cylinders;
	private String fuel;
	private double odometer;
	private String transmission;
	private String drive;
	
	//Metodi
	public Vehicle_engine(String cylinders, String fuel, double odometer, String transmission, String drive) {
		setCylinders(cylinders);
		setFuel(fuel);
		setOdometer(odometer);
		setTransmission(transmission);
		setDrive(drive);
	}
	
	public Vehicle_engine() {
		this(null, null, 1, null, null);
	}

	public String getCylinders() {
		return cylinders;
	}

	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double getOdometer() {
		return odometer;
	}

	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cylinders == null) ? 0 : cylinders.hashCode());
		result = prime * result + ((drive == null) ? 0 : drive.hashCode());
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(odometer);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transmission == null) ? 0 : transmission.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle_engine other = (Vehicle_engine) obj;
		if (cylinders == null) {
			if (other.cylinders != null)
				return false;
		} else if (!cylinders.equals(other.cylinders))
			return false;
		if (drive == null) {
			if (other.drive != null)
				return false;
		} else if (!drive.equals(other.drive))
			return false;
		if (fuel == null) {
			if (other.fuel != null)
				return false;
		} else if (!fuel.equals(other.fuel))
			return false;
		if (Double.doubleToLongBits(odometer) != Double.doubleToLongBits(other.odometer))
			return false;
		if (transmission == null) {
			if (other.transmission != null)
				return false;
		} else if (!transmission.equals(other.transmission))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "" + field[0] + ":" + "\"" + this.cylinders + "\"" + "," +
			    field[1] + ":" + "\"" + this.fuel + "\"" + "," +
			    field[2] + ":" + this.odometer + "," +
			    field[3] + ":" + "\"" + this.transmission + "\"" + "," +
			    field[4] + ":" + "\"" + this.drive + "\"";
	}
}