package Hard;
import java.util.*;
public class Meeting_Rooms_III {
	public class Info implements Comparable<Info> {
		int room;
		long end;

		Info(int r, long e) {
			this.room = r;
			this.end = e;
		}

		public int compareTo(Info obj) {
			// Sorting based on ending time
			if (this.end == obj.end) {
				return this.room - obj.room;
			}
			return (int) (this.end - obj.end);

		}
	}

	public int mostBooked(int n, int[][] meetings) {
		Arrays.sort(meetings, Comparator.comparingDouble(o -> o[0]));
		PriorityQueue<Info> pq = new PriorityQueue<>();
		int ans[] = new int[n];
		int freeRoom = 0;
		int currTime = 0;
		for (int i = 0; i < n; i++) {
			pq.add(new Info(i, 0));
		}

		for (int i = 0; i < meetings.length; i++) {
			int start = meetings[i][0];
			int end = meetings[i][1];
			int time = end - start;

			while (pq.peek().end < start) { // Handle to case when previous end is less then the next start
				Info top = pq.remove();
				pq.add(new Info(top.room, start));
			}
			Info top = pq.remove();
			ans[top.room]++;
			pq.add(new Info(top.room, top.end + time));
		}

		int max = 0;
		int maxRoom = 0;
		for (int j = 0; j < n; j++) {
			if (ans[j] > max) {
				max = ans[j];
				maxRoom = j;
			}
		}

		return maxRoom;
	}
}
