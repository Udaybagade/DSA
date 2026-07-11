class Solution {
    public int maxDigitRange(int[] nums) {
        int[] range = new int[nums.length];
int maxR = 0;

for (int i = 0; i < nums.length; i++) {
    int n = nums[i];
    int h = 0, l = n % 10;

    while (n != 0) {
        int d = n % 10;
        h = Math.max(h, d);
        l = Math.min(l, d);
        n /= 10;
    }

    range[i] = h - l;
    maxR = Math.max(maxR, range[i]);
}

int ans = 0;
for (int i = 0; i < nums.length; i++) {
    if (range[i] == maxR) {
        ans += nums[i];
    }
}

return ans;
    }
}