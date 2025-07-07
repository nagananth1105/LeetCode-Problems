class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int lastDay = 0;
        int day = Integer.MAX_VALUE;

        for (int[] event : events) {
            day = Math.min(day, event[0]);
            lastDay = Math.max(lastDay, event[1]);
        }

        int count = 0;
        int i = 0;

        while (day <= lastDay) {
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            while (i < events.length && events[i][0] == day) {
                pq.offer(events[i][1]);
                i++;
            }

            if (!pq.isEmpty()) {
                pq.poll();
                count++;
            }

            day++;
        }

        return count;
    }
}