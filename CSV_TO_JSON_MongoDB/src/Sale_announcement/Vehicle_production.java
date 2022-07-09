package Sale_announcement;

/**
 * @author Niccolò Bossi
 *
 * Campi relativi al veicolo e rappresenta il JSON
 */

public class Vehicle_production {
		//Campi del json file
		private static final String field[] = {"\"year\"", "\"manufacturer\"", "\"model\"", "\"condition\"", "\"title_status\"", "\"paint_color\"", "\"type\""};
		
		//Attributi
		private int year;
		private String manufacturer;
		private String model;
		private String condition;
		private String title_status;
		private String paint_color;
		private String type;
		
		//Metodi
		public Vehicle_production(int year, String manufacturer, String model, String condition, String title_status, String paint_color, String type) {
			setYear(year);
			setManufacturer(manufacturer);
			setModel(model);
			setCondition(condition);
			setTitle_status(title_status);
			setPaint_color(paint_color);
			setType(type);
		}
		
		public Vehicle_production() {
			this(0, null, null, null, null, null, null);
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getCondition() {
			return condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public String getTitle_status() {
			return title_status;
		}

		public void setTitle_status(String title_status) {
			this.title_status = title_status;
		}

		public String getPaint_color() {
			return paint_color;
		}

		public void setPaint_color(String paint_color) {
			this.paint_color = paint_color;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((condition == null) ? 0 : condition.hashCode());
			result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			result = prime * result + ((paint_color == null) ? 0 : paint_color.hashCode());
			result = prime * result + ((title_status == null) ? 0 : title_status.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			result = prime * result + year;
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
			Vehicle_production other = (Vehicle_production) obj;
			if (condition == null) {
				if (other.condition != null)
					return false;
			} else if (!condition.equals(other.condition))
				return false;
			if (manufacturer == null) {
				if (other.manufacturer != null)
					return false;
			} else if (!manufacturer.equals(other.manufacturer))
				return false;
			if (model == null) {
				if (other.model != null)
					return false;
			} else if (!model.equals(other.model))
				return false;
			if (paint_color == null) {
				if (other.paint_color != null)
					return false;
			} else if (!paint_color.equals(other.paint_color))
				return false;
			if (title_status == null) {
				if (other.title_status != null)
					return false;
			} else if (!title_status.equals(other.title_status))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "" + field[0] + ":" + this.year + "," +
				    field[1] + ":" + "\"" + this.manufacturer + "\"" + "," +
				    field[2] + ":" + "\"" + this.model + "\"" + "," +
				    field[3] + ":" + "\"" + this.condition + "\"" + "," +
				    field[4] + ":" + "\"" + this.title_status + "\"" + "," +
				    field[5] + ":" + "\"" + this.paint_color + "\"" + "," +
				    field[6] + ":" + "\"" + this.type + "\"";
		}
		
}