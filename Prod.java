package lambokEx;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Prod implements Comparable<Prod > {
int id;
String nm;
double price;
public int compareTo(Prod o) {
	Double i1=this.getPrice();
	Double i2=o.getPrice();
	 return i1.compareTo(i2);
	// return getNm().compareTo(o.getNm());
}
}
