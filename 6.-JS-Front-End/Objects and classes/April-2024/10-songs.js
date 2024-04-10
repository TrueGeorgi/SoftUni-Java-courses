function solve(inputArr) {
  class Song {
    typeList;
    name;
    time;

    constructor(typeList, name, time) {
      this.typeList = typeList;
      this.name = name;
      this.time = time;
    }
  }

  let numberOfSongs = inputArr[0];
  let sortType = inputArr[inputArr.length - 1];

  let songs = [];

  for (let s = 1; s <= numberOfSongs; s++) {
    currentSong = inputArr[s].split("_");

    list = currentSong[0];
    songName = currentSong[1];
    duration = currentSong[2];

    songs.push(new Song(list, songName, duration));
  }

  if (sortType === "all") {
    for (const song of songs) {
      console.log(song.name);
    }
  } else {
    for (const song of songs) {
      if (song.typeList === sortType) {
        console.log(song.name);
      }
    }
  }
}

solve([2,
  'like_Replay_3:15',
  'ban_Photoshop_3:48',
  'all']
  );
