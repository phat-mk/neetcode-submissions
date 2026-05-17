func checkInclusion(s1 string, s2 string) bool {
	if len(s1) > len(s2) {
		return false
	}
	count1, count2 := make([]int, 26), make([]int, 26)
	for _, value := range s1 {
		count1[value-'a']++
	}
	left := 0
	for right := 0; right < len(s2); right++ {
		count2[s2[right]-'a']++

		if right-left+1 > len(s1) {
			count2[s2[left]-'a']--
			left++
		}
		if matches(count1, count2) {
			return true
		}
	}
	return false
}

func matches(a []int, b []int) bool {
	for i := 0; i < 26; i++ {
		if a[i] != b[i] {
			return false
		}
	}
	return true
}