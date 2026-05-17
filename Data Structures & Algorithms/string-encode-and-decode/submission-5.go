type Solution struct{}

func (s *Solution) Encode(strs []string) string {
	encoded := ""
	for _, value := range strs {
		encoded += strconv.Itoa(len(value)) + "#" + value
	}
	return encoded
}

func (s *Solution) Decode(str string) []string {
	var result []string
	i := 0
	for i < len(str) {
		j := i
		for str[j] != '#' {
			j++
		}
		length, _ := strconv.Atoi(str[i:j])
		j++
		result = append(result, str[j:j+length])
		i = j + length
	}
	return result
}