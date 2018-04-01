package beans;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

		private Vector fruits;
		private TreeSet cricketers;
		private Hashtable CountryCap;

			public void setFruits(Vector fruits) {
				this.fruits = fruits;
			}
			public void setCricketers(TreeSet cricketers) {
				this.cricketers = cricketers;
			}
			public void setCountryCap(Hashtable countryCap) {
				this.CountryCap = countryCap;
			}
			public void printData() {
				System.out.println("----------------");
					for(Object fruit:fruits) {
						System.out.println(fruit);
					}
				System.out.println("-----------------");
					for(Object cir:cricketers) {
						System.out.println(cir);
					}
				System.out.println("-----------------");
				Set keys=CountryCap.keySet();
					for(Object cc:keys) {
						System.out.println("Country = "+cc+"Capital:"+CountryCap.get(cc));
					}
			}
}
