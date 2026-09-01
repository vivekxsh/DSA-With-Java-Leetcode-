class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {



        Map<String, Integer> seen = new HashMap<>();

        int day = 0;

        while(day < n) {

            String state = Arrays.toString(cells);

            if(seen.containsKey(state)) {
                int previousDay = seen.get(state);
                int cycleLength = day - previousDay;

                int remainingDay = n - day;

                int skip = remainingDay / cycleLength;

                day += skip * cycleLength;

                if(day == n) {
                    break;
                }

            }

            else{
                seen.put(state, day);
            }


            int next[] = new int[8];

            for(int i=1; i<7; i++) {
                next[i] = cells[i-1] == cells[i+1] ? 1 : 0;
            }

            cells = next;
            day++;

        }

        return cells;
        
    }
}