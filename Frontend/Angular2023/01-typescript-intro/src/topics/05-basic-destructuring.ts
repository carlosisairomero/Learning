interface Details {
   author: string;
   year: number;
}

interface AudioPlayer {
   audioVolume: number;
   songDuration: number;
   song: string;
   details: Details;
}

const audioPlayer: AudioPlayer = {
   audioVolume: 90,
   songDuration: 36,
   song: "Mess",
   details: {
      author: "Ed Sheeran",
      year: 2015
   }
}

const {song, details} = audioPlayer;
const {author} = details;
 
console.log('Song:', song);
console.log('Author:', author);

const dbz: string[] = ['Goku', 'Vegeta', 'Trunks'];
const [ , , trunks = 'Not Found']: string[] = dbz;
console.log('Personaje 3:', trunks);


export {};