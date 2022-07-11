 package Sale_announcement;

/**
 * @author nbossi1
 * 
 * Rappresenta il documento JSON relativo ai campi della vendita
 *
 */

public class Sale_information{

	//Campi del json file
	private static final String field[] = {"\"id\"", "\"url\"", "\"region\"", "\"price\"", "\"state\"", "\"posting_date\""};
	
	//Attributi
	private String ID;
	private String url;
	private String region;
	private double price;
	private String state;
	private String posting_date;
	
	//Metodi
	public Sale_information(String id, String url, String region, double price, String state, String posting_date){
		setID(id);
		setUrl(url);
		setRegion(region);
		setPrice(price);
		setState(state);
		setPosting_date(posting_date);
	}
	
	public Sale_information() {
		this(null, null, null, 0, null, null);
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPosting_date() {
		return posting_date;
	}

	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((posting_date == null) ? 0 : posting_date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		Sale_information other = (Sale_information) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (posting_date == null) {
			if (other.posting_date != null)
				return false;
		} else if (!posting_date.equals(other.posting_date))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "" + field[0] + ":" + this.ID + "," +
				    field[1] + ":" + "\"" + this.url + "\"" + "," +
				    field[2] + ":" + "\"" + this.region + "\"" + "," +
				    field[3] + ":" + this.price + "," +
				    field[4] + ":" + "\"" + this.state + "\"" + "," +
				    field[5] + ":" + "\"" + this.posting_date + "\"" + ",";				
	}
}