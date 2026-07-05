//Platform:LeetCode
//Approach:Using simply while loop true and using two variabe to update the fibonacci series.
//Time Complexity:O(n)
//Space Complexity:O(n)

//Code--
var fibGenerator = function* () {
    let a = 0;
    let b = 1;

    while (true) {
        yield a;

        let c = a + b;
        a = b;
        b = c;
    }
};
