function movieCollector(inputMovies) {
  // class Movie {
  //   name;
  //   date;
  //   director;

  //   constructor(name) {
  //     this.name = name;
  //   }

  //   addDate(date) {
  //     this.date = date;
  //   }

  //   addDirector(director) {
  //     this.director = director;
  //   }
  // }

  let movies = [];

  for (let m = 0; m < inputMovies.length; m++) {
    const movieString = inputMovies[m];
    let movieName = "";
    let date = "";
    let movieDirector = "";

    if (movieString.includes("addMovie")) {
      let [command, ...movie] = movieString.split(' ');
      movieName = movie.join(' ');

      let newMovie = [movieName];

      movies.push(newMovie);
    } else if (movieString.includes("directedBy")) {
      movieName = movieString.split(' directedBy ')[0];
      movieDirector = movieString.split(' directedBy ')[1];

      let movieIndex = movies.findIndex(m => m.includes(movieName))

      if(movieIndex !== -1) {
        movies[movieIndex].push = 'director';
        movies[movieIndex].push = movieDirector;
      }
    } else {
      movieName = movieString.split(' onDate ')[0];
      date = movieString.split(' onDate ')[1];

      let movieIndex = movies.findIndex(m => m.includes(movieName))

      if(movieIndex !== -1) {
        movies[movieIndex].push = 'date';
        movies[movieIndex].push = date;
      }
    }
  }

  let output = [];

  movies.forEach(el => {
    if (el.length === 5) {
      output.push({
        name: el[0],
        [el[1]]: el[2],
        [el[3]]: el[4] 
      })
    }
  })

  output.forEach(o => {
    console.log(JSON.stringify(o));
  })
}

movieCollector([
  "addMovie Fast and Furious",
  "addMovie Godfather",
  "Inception directedBy Christopher Nolan",
  "Godfather directedBy Francis Ford Coppola",
  "Godfather onDate 29.07.2018",
  "Fast and Furious onDate 30.07.2018",
  "Batman onDate 01.08.2018",
  "Fast and Furious directedBy Rob Cohen",
]);

// movieCollector([
//   "addMovie The Avengers",
//   "addMovie Superman",
//   "The Avengers directedBy Anthony Russo",
//   "The Avengers onDate 30.07.2010",
//   "Captain America onDate 30.07.2010",
//   "Captain America directedBy Joe Russo",
// ]);
