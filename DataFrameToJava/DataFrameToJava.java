package DataFrameToJava;

import java.util.Enumeration;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.Rengine;
import java.util.HashMap;

public class DataFrameToJava {

	public static HashMap<String,Table> getData() {
		HashMap<String,Table> tables = new HashMap<>();
		Rengine re = new Rengine(new String[] {"--vanilla"}, false, null);
		System.out.println("Rengine created, waiting for R startup");
		
		//if (!re.waitForR()) {
			//System.out.println("Cannot load R");
			//return;
		//}
		
		//If not installed, install tidyverse and load
		re.eval("if(!is.element(tidyverse, installed.packages()[,1])) { "
				+ "packages.install(\"tidyverse\") "
				+ "}");
		re.eval("package(\"tidyverse\")");
		System.out.println(re.eval("getwd()"));
		re.eval("load(\"feature_df.Rda\")");
		System.out.println(re.eval("feature_df[1][[1]][[1]]"));
		System.out.println(re.eval("feature_df[2][[1]][[1]]"));
		double[] test = re.eval("feature_df[3][[1]][[1]]$percentage").asDoubleArray();
		
		int num_rows = re.eval("nrow(feature_df)").asInt();
		
		for (int i = 1; i <= num_rows; i++) {
			String id = re.eval("feature_df[1][[1]][[" + i +"]]").asString();
			String name = re.eval("feature_df[2][[1]][[" + i +"]]").asString();
			String[] values = re.eval("feature_df[3][[1]][[" + i + "]]$value").asStringArray();
			int[] count = re.eval("feature_df[3][[1]][[" + i + "]]$count").asIntArray();
			double[] percentage = re.eval("feature_df[3][[1]][[" + i + "]]$percentage").asDoubleArray();
			Table table = new Table(values, count, percentage);
			tables.put(id, table);
			tables.put(name, table);
		}
		
		re.end();
		
		return tables;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getData().get("39A"));
	}
}
