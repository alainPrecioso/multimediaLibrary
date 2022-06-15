package utils;

import java.util.Comparator;

import multimediaLibrary.Media;

public class NameComparator implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
