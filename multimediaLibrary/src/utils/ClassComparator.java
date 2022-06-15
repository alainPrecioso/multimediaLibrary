package utils;

import java.util.Comparator;

import multimediaLibrary.Media;

public class ClassComparator implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {

		
		
		return o1.getClass().compareTo(o2.getClass());
	}

}
