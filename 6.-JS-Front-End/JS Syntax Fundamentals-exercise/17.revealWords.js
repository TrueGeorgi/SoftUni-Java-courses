function solve(stringParam, template) {
  stringArr = stringParam.split(', ');
  let prototype;

  for (let index = 0; index < stringArr.length; index++) {
    prototype = '*'.repeat(stringArr[index].length);

    template = template.replace(prototype, stringArr[index])
  }

  console.log(template);
};

solve ('great', 'softuni is ***** place for learning new programming languages');
solve ('great, learning', 'softuni is ***** place for ******** new programming languages');