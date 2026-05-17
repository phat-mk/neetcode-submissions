func longestConsecutive(nums []int) int {
	hash := make(map[int]bool)
	for _, value := range nums {
		hash[value] = true
	}

	result := 0
	for num := range hash {
		if hash[num-1] == false {
			temp_result := 1
			current := num
			for hash[current+1] {
				temp_result++
				current++
			}
			if temp_result > result {
				result = temp_result
			}
		}
	}
	return result
}