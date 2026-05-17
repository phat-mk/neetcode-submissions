func groupAnagrams(strs []string) [][]string {
	hash := make(map[string][]string)
	for _, value := range strs {
		count := [26]int{}
		for _, char := range value {
			count[char-'a']++
		}
		key := ""
		for _, value := range count {
			key += fmt.Sprintf("#%d", value)
		}
		hash[key] = append(hash[key], value)
	}
	result := [][]string{}
	for _, value := range hash {
		result = append(result, value)
	}
	return result
}