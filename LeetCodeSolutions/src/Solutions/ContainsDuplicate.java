package Solutions;

import java.util.HashSet;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num:nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
    return false;   
    }

}
