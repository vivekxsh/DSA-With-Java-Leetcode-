class Solution {
    public int subarrayBitwiseORs(int[] arr) {

        Set<Integer> result0rs = new HashSet<>();

        Set<Integer> current0rs = new HashSet<>();

        for(int x : arr) {
            Set<Integer> next0rs = new HashSet<>();

            next0rs.add(x);

            for(int y : current0rs) {
                next0rs.add(x | y);
            }

            result0rs.addAll(next0rs);

            current0rs = next0rs;
        }

        return result0rs.size();
        
    }
}