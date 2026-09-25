package lambokEx;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Stud implements Comparable<Stud>{
int id;
String nm;
String course;
double cgpa;
 public int compareTo(Stud o) {
	 Double i1=this.getCgpa();
	 Double i2=o.getCgpa();
	 return i1.compareTo(i2);
	// return getNm().compareTo(o.getNm());
 }
}
