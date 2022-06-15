package utils;

import java.util.Comparator;

import multimediaLibrary.Media;

public class AuthorComparator implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		
		
		
		if (o1.getAuthorName().compareTo(o2.getAuthorName()) == 0) {
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getAuthorName().compareTo(o2.getAuthorName());
	}
	
//	@Override
//	public int compare(Media o1, Media o2) {
//		if (o1.getAuthorName().compareTo(o2.getAuthorName()) == 0) {
//			return NameComparator.compare(o1, o2);
//		}
//		return o1.getAuthorName().compareTo(o2.getAuthorName());
//	}

}
