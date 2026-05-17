func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
		return false
	}

	hash := make(map[rune]int)
	for _, v := range s {
		hash[v]++
	}

	for _, v := range t {
		if hash[v] == 0 {
			return false
		}

		hash[v]--

		if hash[v] == 0 {
			delete(hash, v)
		}
	}

	return len(hash) == 0
}
