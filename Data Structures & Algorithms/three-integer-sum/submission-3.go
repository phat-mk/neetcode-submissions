func threeSum(nums []int) [][]int {

	result := make([][]int, 0)
	arr_len := len(nums)
	sort.Ints(nums)

	for i := 0; i < arr_len-2; i++ {
		left, right := i+1, arr_len-1
		if i > 0 && nums[i] == nums[i-1] {
			continue
		}
		for left < right {
			sum := nums[i] + nums[left] + nums[right]
			if sum == 0 {
				result = append(result, []int{nums[i], nums[left], nums[right]})

				for left < right && nums[left] == nums[left+1] {
					left++
				}

				for left < right && nums[right] == nums[right-1] {
					right--
				}
				left++
				right--
			} else if sum < 0 {
				left++
			} else {
				right--
			}
		}
	}
	return result
}