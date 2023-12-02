// going to the server every time
// import useData from "./useData";
import genres from "../data/genres";

export interface Genre {
   id: number;
   name: string;
   image_background: string;
}

// going to the server every time
// const useGenres = () => useData<Genre>('/genres');

// static way
const useGenres = () => ({ data: genres, isLoading: false, error: null });

export default useGenres;