func hasDuplicate(nums []int) bool {
    hash_map := make(map[int]int)
    for _, v := range nums {
        _, ok := hash_map[v]
        if ok {
            return true;
        } else {
            hash_map[v] = 1
        }
    }
    return false;
}
