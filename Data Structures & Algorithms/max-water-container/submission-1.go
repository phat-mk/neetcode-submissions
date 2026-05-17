func maxArea(heights []int) int {
	max := 0
	arr_len := len(heights)
	start, end := 0, arr_len-1
	for start < end {
		temp_max := min(heights[start], heights[end]) * (end - start)
		if temp_max > max {
			max = temp_max
		}
		if heights[start] < heights[end] {
			start++
		} else {
			end--
		}
	}
	return max
}