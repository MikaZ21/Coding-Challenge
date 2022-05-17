function addUp(num) {
	if (num < 0 || typeof(num) !== "number") {
		return "Enter any positive number between 1 and 1000."
	} else {
		let a = 0;
		let b = 1;
		for (let i = 0; i < num; i++) {
			a += b;
			b += 1;
		}
		return a;
	}
};