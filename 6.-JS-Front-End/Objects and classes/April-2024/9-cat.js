function solve(inputArr) {
  class Cat {
    name;
    age;

    constructor(name, age) {
      this.name = name;
      this.age = age;
    }
    
    meow() {
      console.log(`${this.name}, age ${this.age} says Meow`);
    }
  }

  inputArr.forEach(input => {
    spreader = input.split(' ');
    let cat = new Cat(spreader[0], spreader[1])
    cat.meow();
  });
}

solve(['Mellow 2', 'Tom 5']);