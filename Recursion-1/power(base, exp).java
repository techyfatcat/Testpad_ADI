class Result {
    static long power(int base, int exp) {
      // Write your code here
        if (exp == 0) return 1;
        if (exp < 0) return -1;
        if (exp % 2 == 0) return power(base * base, exp / 2);
        return power(base * base, (exp - 1) / 2) * base;
    }
}
