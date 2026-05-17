func twoSum(numbers []int, target int) []int {
	result := []int{0, 0}
	left, right := 0, len(numbers)-1
	for left < right {
		sum := numbers[left] + numbers[right]
		if sum == target {
			result[0] = left + 1
			result[1] = right + 1
			return result
		} else if sum > target {
			right--
		} else {
			left++
		}

	}
	return result
}