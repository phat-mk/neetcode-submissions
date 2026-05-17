type MinStack struct {
	stack     []int
	min_stack []int
}

func Constructor() MinStack {
	return MinStack{
		stack:     []int{},
		min_stack: []int{},
	}
}

func (this *MinStack) Push(val int) {
	this.stack = append(this.stack, val)
	if len(this.min_stack) == 0 || val <= this.min_stack[len(this.min_stack)-1] {
		this.min_stack = append(this.min_stack, val)
	}
}

func (this *MinStack) Pop() {
	if len(this.stack) == 0 {
		return
	}
	pop := this.stack[len(this.stack)-1]
	this.stack = this.stack[:len(this.stack)-1]
	if len(this.min_stack) > 0 && pop == this.min_stack[len(this.min_stack)-1] {
		this.min_stack = this.min_stack[:len(this.min_stack)-1]
	}
}

func (this *MinStack) Top() int {
	return this.stack[len(this.stack)-1]
}

func (this *MinStack) GetMin() int {
	return this.min_stack[len(this.min_stack)-1]
}