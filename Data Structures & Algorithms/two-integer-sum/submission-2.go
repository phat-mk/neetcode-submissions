func twoSum(nums []int, target int) []int {
	hash := make(map[int]int)
	result := make([]int, 2)
	for i, v := range nums {
		hash[v] = i
	}
	fmt.Println(hash)
	for i, v := range nums {
		difference := target - v
		value, ok := hash[difference]
		if ok && value != i {
			result[0] = i
			result[1] = value
			return result
		} else {
			continue
		}
	}
	return result

}