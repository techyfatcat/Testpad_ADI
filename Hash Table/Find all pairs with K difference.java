class Result {
  static int getPairsCount(int arr[], int n, int k) {
    // Write your code here
      HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        int count = 0;

        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }
        return count;
  }
}
