func minEatingSpeed(piles []int, h int) int {
	left, right := 1, 0
	for _, value := range piles {
		right = max(value, right)
	}
	result := right
	for left <= right {
		mid := left + (right-left)/2
		if canFinish(piles, mid, h) {
			result = mid
			right = mid - 1
		} else {
			left = mid + 1
		}
	}
	return result
}

func canFinish(piles []int, k int, h int) bool {
	sum := 0
	for _, value := range piles {
		sum += (value + k - 1) / k
	}
	return sum <= h
}