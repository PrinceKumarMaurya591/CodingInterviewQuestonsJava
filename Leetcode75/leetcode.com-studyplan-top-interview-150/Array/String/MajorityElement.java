package String;

public class MajorityElement {


public int majorityElement(int[] nums) {
    int count = 0;
    Integer candidate = -1;  // संभावित मेजरिटी एलिमेंट

    for (int num : nums) {
        if (count == 0) {
            candidate = num; // नया कैंडिडेट चुनें
        }
        count += (num == candidate) ? 1 : -1; // काउंट अपडेट करें
    }

    return candidate;

}

public static void main(String[] args) {
    MajorityElement obj = new MajorityElement();
    int[] nums = {3, 2, 3};
    int majority = obj.majorityElement(nums);
    System.out.println("Majority element: " + majority);
}
}

