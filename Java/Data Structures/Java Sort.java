import java.util.*;

class Student implements Comparable<Student>, Comparator<Student>
{
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa)
	{
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId()
	{
		return id;
	}

	public String getFname()
	{
		return fname;
	}

	public double getCgpa()
	{
		return cgpa;
	}

	@Override
	public int compareTo(Student o)
	{
		return this.compare(this, o);
	}

	@Override
	public int compare(Student o1, Student o2)
	{
		int result;
		if(o1.cgpa != o2.cgpa)
		{
			result = Double.compare(o2.cgpa, o1.cgpa);
		}
		else if(!o1.fname.equals(o2.fname))
		{
			result = o1.fname.compareTo(o2.fname);
		}
		else
		{
			result = o1.id - o2.id;
		}
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		boolean result;
		if(obj instanceof Student)
		{
			result = this.compareTo((Student)obj) == 0;
		}
		else
		{
			result = false;
		}
		return result;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0)
		{
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList);
		for(Student st: studentList)
		{
			System.out.println(st.getFname());
		}
	}
}
