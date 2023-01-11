package Easy.GroupB;

public class MajorityElement {
    public static void main(String[] args) {
        int[] intArray = {2,2,1,1,1,2,2};


        System.out.println(majorityElement(intArray));
    }



    public static int majorityElement(int[] nums) {

        int counter = 1;
        int candidate = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(counter == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                counter++;
            }
            else{
                counter--;
            }
        }
        return candidate;

    }


//    public static int majorityElement(int[] nums) {
//
//        int counter = 1;
//        int candidate = nums[0];
//
//        for(int i = 1; i < nums.length; i++){
//            if(counter == 0){
//                candidate = nums[i];
//            }
//            if(nums[i] == candidate){
//                counter++;
//            }
//            else{
//                counter--;
//            }
//        }
//        return candidate;
//
//    }
}
