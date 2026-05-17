func lengthOfLongestSubstring(s string) int {
	hashMap := make(map[byte]int)
	left, result := 0, 0
	for right := 0; right < len(s); right++ {
		if idx, ok := hashMap[s[right]]; ok && idx >= left {
			left = idx + 1
		}
		hashMap[s[right]] = right
		result = max(result, right-left+1)
	}
	return result
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}