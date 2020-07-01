import java.util.*;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		int n = in.nextInt();
		int m = in.nextInt();
		HashSet<Integer> unique = new HashSet<Integer>();
		int maxUnique = 0;
		for (int i = 0; i < n; i++)
		{
			int num = in.nextInt();
			if(i >= m)
			{
				if(!unique.contains(num))
				{
					unique.add(num);
				}
				deque.addLast(num);
				num = deque.removeFirst();
				if(!deque.contains(num))
				{
					unique.remove(num);
				}
				maxUnique = Math.max(maxUnique, unique.size());
			}
			else
			{
				unique.add(num);
				deque.addLast(num);
				maxUnique = unique.size();
			}
		}
		System.out.println(maxUnique);
	}
}
