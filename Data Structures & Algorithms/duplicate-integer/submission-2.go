func hasDuplicate(nums []int) bool {
    hash_map := make(map[int]bool)
    for _, v := range nums {
        if hash_map[v] {
            return true;
        }
        hash_map[v] = true
    }
    return false;
}
