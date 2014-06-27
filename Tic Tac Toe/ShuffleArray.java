import java.util.*;

class ShuffleArray {
	int randomGameIndex;
	public ShuffleArray(int[] array) {
		randomGameIndex = array[new Random().nextInt(array.length)]; //array.length is the upper limit of the index of the array
	}
}

