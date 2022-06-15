package utils;

import java.util.Comparator;

import multimediaLibrary.Media;

public class AuthorComparator implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		if (o1.getAuthor().compareTo(o2.getAuthor()) == 0) {
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getAuthor().compareTo(o2.getAuthor());
	}

}
