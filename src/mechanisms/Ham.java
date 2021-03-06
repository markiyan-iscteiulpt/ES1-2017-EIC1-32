package mechanisms;

import java.util.ArrayList;

/**
 * @author Markiyan Pyekh
 *
 */
public class Ham {
	
	private String filename;
	private ArrayList<String> ham;
	
	/**
	 * Construtor do Ham
	 * @param filename
	 * @param ham
	 */
	public Ham(String filename, ArrayList<String> ham ) {
		this.filename = filename;
		this.ham = ham;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public ArrayList<String> getRules() {
		return ham;
	}

	public void setRules(ArrayList<String> rules) {
		this.ham = rules;
	}
}
