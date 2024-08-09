package Easy.GroupB;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots. Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 * Example 1:* Input: flowerbed = [1,0,0,0,1], n = 1 Output: true
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current spot is empty
            if (flowerbed[i] == 0) {
                // hcecks if we are at the first plot. If we are, there's no previous plot, so we consider prevEmpty to be true.
                boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    // Plant a flower
                    flowerbed[i] = 1;
                    n--;
                    // If we've planted all the required flowers, return true
                    if (n == 0) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return n <= 0;
    }
}
