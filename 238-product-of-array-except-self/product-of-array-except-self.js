/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let result = [];
    let product = 1;
    for(let i =0;i<nums.length;i++) {
       product = product * nums[i];
       result[i] = product; 
    }
    product = 1;
    for(let i =nums.length-1;i>=0;i--) {
        if(i == nums.length-1) {
            result[i] = result[i-1];
        }
        else if(i == 0) {
            result[i] = product;
        }
        else {
            result[i] = result[i-1] * product;
        }
        product = product * nums[i];
    }
    return result;
};